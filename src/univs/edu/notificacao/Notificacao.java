package univs.edu.notificacao;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Notificacao {

    @Id
    @GeneratedValue
    private int idNotificacao;
    
    @Column(nullable = false)
    private int idUsuario;
    
    @Column(nullable = false)
    private int idCorpoDeBombeiros;
    
    @Column(length = 10, nullable = false)
    private Date dataHoje;

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

    public int getIdNotificacao() {
        return idNotificacao;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdCorpoDeBombeiros() {
        return idCorpoDeBombeiros;
    }

    public void setIdCorpoDeBombeiros(int idCorpoDeBombeiros) {
        this.idCorpoDeBombeiros = idCorpoDeBombeiros;
    }
    
    public Date getDataHoje() {
        return dataHoje;
    }

    public void setDataHoje(Date dataHoje) {
        this.dataHoje = dataHoje;
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
}
