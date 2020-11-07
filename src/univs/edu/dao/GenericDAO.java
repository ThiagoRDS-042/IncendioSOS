package univs.edu.dao;

import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import univs.edu.bombeiro.CorpoDeBombeiros;
import univs.edu.denuncia.Denuncia;
import univs.edu.ibama.Ibama;
import univs.edu.notificacao.Notificacao;
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
                JOptionPane.showMessageDialog(null, "Editado com Sucesso!");
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
        } else if (generico instanceof Notificacao) {
            Notificacao notificacao = (Notificacao) generico;
            sessao.save(notificacao);
            JOptionPane.showMessageDialog(null, "Notificação Enviada Com Sucesso!");

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

        T generica = null;
        if (sessao.createCriteria(Usuario.class).add(Restrictions.eq("emailUsuario", email)).uniqueResult() != null) {
            Usuario usuario = (Usuario) sessao.createCriteria(Usuario.class).add(Restrictions.eq("emailUsuario", email)).uniqueResult();
            generica = (T) usuario;
        } else if (sessao.createCriteria(CorpoDeBombeiros.class).add(Restrictions.eq("emailBombeiro", email)).uniqueResult() != null) {
            CorpoDeBombeiros bombeiro = (CorpoDeBombeiros) sessao.createCriteria(CorpoDeBombeiros.class).add(Restrictions.eq("emailBombeiro", email)).uniqueResult();
            generica = (T) bombeiro;
        } else if (sessao.createCriteria(Ibama.class).add(Restrictions.eq("emailIbama", email)).uniqueResult() != null) {
            Ibama ibama = (Ibama) sessao.createCriteria(Ibama.class).add(Restrictions.eq("emailIbama", email)).uniqueResult();
            generica = (T) ibama;
        }
        sessao.close();
        return generica;
    }

    public <T> T pesquisarId(String id) {
        criarSessao();

        T generica = null;
        if (sessao.createCriteria(Usuario.class).add(Restrictions.eq("idUsuario", id)).uniqueResult() != null) {
            Usuario usuario = (Usuario) sessao.createCriteria(Usuario.class).add(Restrictions.eq("idUsuario", id)).uniqueResult();
            generica = (T) usuario;
        } else if (sessao.createCriteria(CorpoDeBombeiros.class).add(Restrictions.eq("idBombeiro", id)).uniqueResult() != null) {
            CorpoDeBombeiros bombeiro = (CorpoDeBombeiros) sessao.createCriteria(CorpoDeBombeiros.class).add(Restrictions.eq("idBombeiro", id)).uniqueResult();
            generica = (T) bombeiro;
        } else if (sessao.createCriteria(Ibama.class).add(Restrictions.eq("idIbama", id)).uniqueResult() != null) {
            Ibama ibama = (Ibama) sessao.createCriteria(Ibama.class).add(Restrictions.eq("idIbama", id)).uniqueResult();
            generica = (T) ibama;
        }
        sessao.close();
        return generica;
    }

    public <T> T login(String email, String senha) {
        criarSessao();

        T generica = null;
        if (sessao.createCriteria(Usuario.class).add(Restrictions.eq("emailUsuario", email)).add(Restrictions.eq("senhaUsuario", senha)).uniqueResult() != null) {
            Usuario usuario = (Usuario) sessao.createCriteria(Usuario.class).add(Restrictions.eq("emailUsuario", email)).add(Restrictions.eq("senhaUsuario", senha)).uniqueResult();
            generica = (T) usuario;
        } else if (sessao.createCriteria(CorpoDeBombeiros.class).add(Restrictions.eq("emailBombeiro", email)).add(Restrictions.eq("senhaBombeiro", senha)).uniqueResult() != null) {
            CorpoDeBombeiros bombeiro = (CorpoDeBombeiros) sessao.createCriteria(CorpoDeBombeiros.class).add(Restrictions.eq("emailBombeiro", email)).add(Restrictions.eq("senhaBombeiro", senha)).uniqueResult();
            generica = (T) bombeiro;
        } else if (sessao.createCriteria(Ibama.class).add(Restrictions.eq("emailIbama", email)).add(Restrictions.eq("senhaIbama", senha)).uniqueResult() != null) {
            Ibama ibama = (Ibama) sessao.createCriteria(Ibama.class).add(Restrictions.eq("emailIbama", email)).add(Restrictions.eq("senhaIbama", senha)).uniqueResult();
            generica = (T) ibama;
        }
        sessao.close();
        return generica;
    }

    public List<T> listarObjetos(String tipo) {
        criarSessao();

        List<T> generica = null;
        if (tipo.equalsIgnoreCase("Usuario")) {
            List<Usuario> usuarios = sessao.createCriteria(Usuario.class).list();
            generica = (List<T>) usuarios;
        } else if (tipo.equalsIgnoreCase("Bombeiro")) {
            List<CorpoDeBombeiros> bombeiros = sessao.createCriteria(CorpoDeBombeiros.class).list();
            generica = (List<T>) bombeiros;
        } else if (tipo.equalsIgnoreCase("Ibama")) {
            List<Ibama> ibama = sessao.createCriteria(Ibama.class).list();
            generica = (List<T>) ibama;
        }
        sessao.close();
        return generica;
    }

}
