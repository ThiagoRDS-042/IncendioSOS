package univs.edu.notificacao;

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

    @Column(length = 100, nullable = false)
    private String cidade;
    
    @Column(length = 100, nullable = false)
    private String estado;
    
    @Column(length = 100, nullable = false)
    private String rua;
    
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

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
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
