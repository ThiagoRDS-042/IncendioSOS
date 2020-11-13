package univs.edu.notificacao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import univs.edu.bombeiro.CorpoDeBombeiros;
import univs.edu.usuario.Usuario;

@Entity
public class Notificacao {

    @Id
    @GeneratedValue
    private int idNotificacao;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "idCorpoDeBombeiros")
    private CorpoDeBombeiros corpoDeBombeiros;

    @Column(length = 19, nullable = false)
    private String dataEnvio;

    @Column(length = 100, nullable = false)
    private String cidadeOcorrencia;

    @Column(length = 100, nullable = false)
    private String ComplementoOcorrencia;

    @Column(length = 100, nullable = false)
    private String ruaOcorrencia;

    @Column(length = 20, nullable = false)
    private String tipo;

    @Column(length = 50, nullable = false)
    private String abrangencia;

    @Column(length = 20, nullable = false)
    private String duracao;

    @Column(length = 150, nullable = false)
    private String descricao;
    
    @Transient
    public static Notificacao notificacao;

    public int getIdNotificacao() {
        return idNotificacao;
    }

    public String getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(String dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public String getCidadeOcorrencia() {
        return cidadeOcorrencia;
    }

    public void setCidadeOcorrencia(String cidadeOcorrencia) {
        this.cidadeOcorrencia = cidadeOcorrencia;
    }

    public String getComplementoOcorrencia() {
        return ComplementoOcorrencia;
    }

    public void setComplementoOcorrencia(String complementoOcorrencia) {
        this.ComplementoOcorrencia = complementoOcorrencia;
    }

    public String getRuaOcorrencia() {
        return ruaOcorrencia;
    }

    public void setRuaOcorrencia(String ruaOcorrencia) {
        this.ruaOcorrencia = ruaOcorrencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAbrangencia() {
        return abrangencia;
    }

    public void setAbrangencia(String abrangencia) {
        this.abrangencia = abrangencia;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public CorpoDeBombeiros getCorpoDeBombeiros() {
        return corpoDeBombeiros;
    }

    public void setCorpoDeBombeiros(CorpoDeBombeiros corpoDeBombeiros) {
        this.corpoDeBombeiros = corpoDeBombeiros;
    }
}
