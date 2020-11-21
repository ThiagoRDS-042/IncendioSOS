package univs.edu.dao;

import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import univs.edu.adm.Adm;
import univs.edu.bombeiro.CorpoDeBombeiros;
import univs.edu.denuncia.Denuncia;
import univs.edu.ibama.Ibama;
import univs.edu.notificacao.Notificacao;
import univs.edu.telas.bombeiro.DetalhesNotificacao;
import univs.edu.telas.login.GenericLogin;
import univs.edu.usuario.Usuario;
import univs.edu.util.HibernateUtil;

public class GenericDAO<T> {

    private Session sessao;
    private Transaction transacao;

    public void criarSessao() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
    }

    public void salvar(T generico) {
        criarSessao();
        if (generico instanceof Usuario) {
            Usuario usuario = (Usuario) generico;
            if (usuario.getIdUsuario() == 0) {
                sessao.save(usuario);
                JOptionPane.showMessageDialog(null, "Cadastrado Concluído!");
            } else {
                sessao.update(usuario);
                if (GenericLogin.login == false && DetalhesNotificacao.trote == false) {
                    JOptionPane.showMessageDialog(null, "Editado com Sucesso!");
                }
            }
        } else if (generico instanceof CorpoDeBombeiros) {
            CorpoDeBombeiros bombeiro = (CorpoDeBombeiros) generico;
            if (bombeiro.getIdBombeiro() == 0) {
                sessao.save(bombeiro);
                JOptionPane.showMessageDialog(null, "Cadastrado Concluído!");
            } else {
                sessao.update(bombeiro);
                JOptionPane.showMessageDialog(null, "Editado com Sucesso!");
            }
        } else if (generico instanceof Ibama) {
            Ibama ibama = (Ibama) generico;
            if (ibama.getIdIbama() == 0) {
                sessao.save(ibama);
                JOptionPane.showMessageDialog(null, "Cadastrado Concluído!");
            } else {
                sessao.update(ibama);
                JOptionPane.showMessageDialog(null, "Editado com Sucesso!");
            }
        } else if (generico instanceof Adm) {
            Adm adm = (Adm) generico;
            if (adm.getIdAdm() == 0) {
                sessao.save(adm);
                JOptionPane.showMessageDialog(null, "Cadastrado Concluído!");
            } else {
                sessao.update(adm);
                JOptionPane.showMessageDialog(null, "Editado com Sucesso!");
            }
        } else if (generico instanceof Notificacao) {
            Notificacao notificacao = (Notificacao) generico;
            if (notificacao.getIdNotificacao() == 0) {
                sessao.save(notificacao);
                JOptionPane.showMessageDialog(null, "Notificação Enviada Com Sucesso!");
            } else {
                sessao.update(notificacao);
            }
        } else {
            Denuncia denuncia = (Denuncia) generico;
            if (denuncia.getIdDenuncia() == 0) {
                sessao.save(denuncia);
                JOptionPane.showMessageDialog(null, "Denuncia Enviada Com Sucesso!");
            } else {
                sessao.update(denuncia);
            }
        }
        transacao.commit();
        sessao.close();
    }

    public void excluir(T generico) {
        criarSessao();
        sessao.delete(generico);
        transacao.commit();
        sessao.close();
    }

    public <T> T pesquisarEmail(String email) {
        criarSessao();

        T generica;
        if (sessao.createCriteria(Usuario.class).add(Restrictions.eq("emailUsuario", email)).uniqueResult() != null) {
            Usuario usuario = (Usuario) sessao.createCriteria(Usuario.class).add(Restrictions.eq("emailUsuario", email)).uniqueResult();
            generica = (T) usuario;
        } else if (sessao.createCriteria(CorpoDeBombeiros.class).add(Restrictions.eq("emailBombeiro", email)).uniqueResult() != null) {
            CorpoDeBombeiros bombeiro = (CorpoDeBombeiros) sessao.createCriteria(CorpoDeBombeiros.class).add(Restrictions.eq("emailBombeiro", email)).uniqueResult();
            generica = (T) bombeiro;
        } else if (sessao.createCriteria(Ibama.class).add(Restrictions.eq("emailIbama", email)).uniqueResult() != null) {
            Ibama ibama = (Ibama) sessao.createCriteria(Ibama.class).add(Restrictions.eq("emailIbama", email)).uniqueResult();
            generica = (T) ibama;
        } else {
            Adm adm = (Adm) sessao.createCriteria(Adm.class).add(Restrictions.eq("emailAdm", email)).uniqueResult();
            generica = (T) adm;
        }
        sessao.close();
        return generica;
    }

    public <T> T pesquisarIdentificacao(String identidicacao) {
        criarSessao();

        T generica;
        if (sessao.createCriteria(Usuario.class).add(Restrictions.eq("cpfUsuario", identidicacao)).uniqueResult() != null) {
            Usuario usuario = (Usuario) sessao.createCriteria(Usuario.class).add(Restrictions.eq("cpfUsuario", identidicacao)).uniqueResult();
            generica = (T) usuario;
        } else if (sessao.createCriteria(CorpoDeBombeiros.class).add(Restrictions.eq("companhiaBatalhao", identidicacao)).uniqueResult() != null) {
            CorpoDeBombeiros bombeiro = (CorpoDeBombeiros) sessao.createCriteria(CorpoDeBombeiros.class).add(Restrictions.eq("companhiaBatalhao", identidicacao)).uniqueResult();
            generica = (T) bombeiro;
        } else {
            Ibama ibama = (Ibama) sessao.createCriteria(Ibama.class).add(Restrictions.eq("cnpj", identidicacao)).uniqueResult();
            generica = (T) ibama;
        }
        sessao.close();
        return generica;
    }

    public <T> T pesquisarId(int id, String tipo) {
        criarSessao();

        T generica;
        if (tipo.equalsIgnoreCase("Notificação")) {
            Notificacao notificacao = (Notificacao) sessao.createCriteria(Notificacao.class).add(Restrictions.eq("idNotificacao", id)).uniqueResult();
            generica = (T) notificacao;
        } else if (tipo.equalsIgnoreCase("Denuncia")) {
            Denuncia denuncia = (Denuncia) sessao.createCriteria(Denuncia.class).add(Restrictions.eq("idDenuncia", id)).uniqueResult();
            generica = (T) denuncia;
        } else if (tipo.equalsIgnoreCase("Usuário")) {
            Usuario usuario = (Usuario) sessao.createCriteria(Usuario.class).add(Restrictions.eq("idUsuario", id)).uniqueResult();
            generica = (T) usuario;
        } else if (tipo.equalsIgnoreCase("Bombeiro")) {
            CorpoDeBombeiros bombeiro = (CorpoDeBombeiros) sessao.createCriteria(CorpoDeBombeiros.class).add(Restrictions.eq("idBombeiro", id)).uniqueResult();
            generica = (T) bombeiro;
        } else {
            Ibama ibama = (Ibama) sessao.createCriteria(Ibama.class).add(Restrictions.eq("idIbama", id)).uniqueResult();
            generica = (T) ibama;
        }
        sessao.close();
        return generica;
    }

    public <T> T login(String email, String senha) {
        criarSessao();

        T generica;
        if (sessao.createCriteria(Usuario.class).add(Restrictions.eq("emailUsuario", email)).add(Restrictions.eq("senhaUsuario", senha)).uniqueResult() != null) {
            Usuario usuario = (Usuario) sessao.createCriteria(Usuario.class).add(Restrictions.eq("emailUsuario", email)).add(Restrictions.eq("senhaUsuario", senha)).uniqueResult();
            generica = (T) usuario;
        } else if (sessao.createCriteria(CorpoDeBombeiros.class).add(Restrictions.eq("emailBombeiro", email)).add(Restrictions.eq("senhaBombeiro", senha)).uniqueResult() != null) {
            CorpoDeBombeiros bombeiro = (CorpoDeBombeiros) sessao.createCriteria(CorpoDeBombeiros.class).add(Restrictions.eq("emailBombeiro", email)).add(Restrictions.eq("senhaBombeiro", senha)).uniqueResult();
            generica = (T) bombeiro;
        } else if (sessao.createCriteria(Ibama.class).add(Restrictions.eq("emailIbama", email)).add(Restrictions.eq("senhaIbama", senha)).uniqueResult() != null) {
            Ibama ibama = (Ibama) sessao.createCriteria(Ibama.class).add(Restrictions.eq("emailIbama", email)).add(Restrictions.eq("senhaIbama", senha)).uniqueResult();
            generica = (T) ibama;
        } else {
            Adm adm = (Adm) sessao.createCriteria(Adm.class).add(Restrictions.eq("emailAdm", email)).add(Restrictions.eq("senhaAdm", senha)).uniqueResult();
            generica = (T) adm;
        }
        sessao.close();
        return generica;
    }

    public List<T> pesquisarNotDen(Usuario usuario, String dataEnvio, String tipo) {
        criarSessao();

        List<T> generica;
        if (tipo.equalsIgnoreCase("Notificação")) {
            List<Notificacao> notificacoes = (List<Notificacao>) sessao.createCriteria(Notificacao.class).add(Restrictions.eq("usuario", usuario)).add(Restrictions.like("dataEnvio", (dataEnvio + "%"))).list();
            generica = (List<T>) notificacoes;
        } else {
            List<Denuncia> denuncias = (List<Denuncia>) sessao.createCriteria(Denuncia.class).add(Restrictions.eq("usuario", usuario)).add(Restrictions.like("dataEnvio", (dataEnvio + "%"))).list();
            generica = (List<T>) denuncias;
        }
        sessao.close();
        return generica;
    }
    
    public List<T> relatorio(String mes, String tipo, boolean porCidade, String cidade) {
        criarSessao();

        List<T> generica;
        if (tipo.equalsIgnoreCase("Notificação") && porCidade == true) {
            List<Notificacao> notificacoes = (List<Notificacao>) sessao.createCriteria(Notificacao.class).add(Restrictions.like("dataEnvio", ("%" + mes + "%"))).add(Restrictions.eq("cidadeOcorrencia", cidade)).list();
            generica = (List<T>) notificacoes;
        } else  if (tipo.equalsIgnoreCase("Denuncia") && porCidade == true) {
            List<Denuncia> denuncias = (List<Denuncia>) sessao.createCriteria(Denuncia.class).add(Restrictions.like("dataEnvio", ("%" + mes + "%"))).add(Restrictions.eq("cidade", cidade)).list();
            generica = (List<T>) denuncias;
        } else if(tipo.equalsIgnoreCase("Notificação")){
            List<Notificacao> notificacoes = (List<Notificacao>) sessao.createCriteria(Notificacao.class).add(Restrictions.like("dataEnvio", ("%" + mes + "%"))).list();
            generica = (List<T>) notificacoes;
        } else{
            List<Denuncia> denuncias = (List<Denuncia>) sessao.createCriteria(Denuncia.class).add(Restrictions.like("dataEnvio", ("%" + mes + "%"))).list();
            generica = (List<T>) denuncias;
        }
        sessao.close();
        return generica;
    }

    public List<T> listarNotDen(T generico, String tipo) {
        criarSessao();

        List<T> generica;
        if (generico instanceof CorpoDeBombeiros) {
            List<Notificacao> notificacoes = (List<Notificacao>) sessao.createCriteria(Notificacao.class).add(Restrictions.eq("corpoDeBombeiros", generico)).add(Restrictions.eq("trote", false)).list();
            generica = (List<T>) notificacoes;
        } else if (generico instanceof Ibama) {
            List<Denuncia> denuncias = (List<Denuncia>) sessao.createCriteria(Denuncia.class).add(Restrictions.eq("ibama", generico)).add(Restrictions.eq("trote", false)).list();
            generica = (List<T>) denuncias;
        } else if (generico instanceof Usuario && tipo.equalsIgnoreCase("Notificação")) {
            List<Notificacao> notsUsuario = (List<Notificacao>) sessao.createCriteria(Notificacao.class).add(Restrictions.eq("usuario", generico)).add(Restrictions.eq("trote", true)).list();
            generica = (List<T>) notsUsuario;
        } else {
            List<Denuncia> densUsuario = (List<Denuncia>) sessao.createCriteria(Denuncia.class).add(Restrictions.eq("usuario", generico)).add(Restrictions.eq("trote", true)).list();
            generica = (List<T>) densUsuario;
        }
        sessao.close();
        return generica;
    }

    public List<T> listarObjetos(String tipo) {
        criarSessao();

        List<T> generica;
        if (tipo.equalsIgnoreCase("Usuario")) {
            List<Usuario> usuarios = sessao.createCriteria(Usuario.class).list();
            generica = (List<T>) usuarios;
        } else if (tipo.equalsIgnoreCase("Bombeiro")) {
            List<CorpoDeBombeiros> bombeiros = sessao.createCriteria(CorpoDeBombeiros.class).list();
            generica = (List<T>) bombeiros;
        } else if (tipo.equalsIgnoreCase("Ibama")) {
            List<Ibama> ibama = sessao.createCriteria(Ibama.class).list();
            generica = (List<T>) ibama;
        } else if (tipo.equalsIgnoreCase("Notificação")) {
            List<Notificacao> notificacao = sessao.createCriteria(Notificacao.class).list();
            generica = (List<T>) notificacao;
        } else {
            List<Denuncia> denuncia = sessao.createCriteria(Denuncia.class).list();
            generica = (List<T>) denuncia;
        }
        sessao.close();
        return generica;
    }

}
