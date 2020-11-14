package univs.edu.denuncia;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import univs.edu.ibama.Ibama;
import univs.edu.usuario.Usuario;

@Entity
public class Denuncia {

    @Id
    @GeneratedValue
    private int idDenuncia;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "idIbama")
    private Ibama ibama;

    @Column(length = 19, nullable = false)
    private String dataEnvio;

    @Column(length = 100)
    private String nomeSuspeito;

    @Column(length = 100, nullable = false)
    private String detalhesIncendio;

    @Column(length = 100, nullable = false)
    private String descricaoSuspeito;

    @Column(length = 300)
    private byte[] evidencias;

    @Column(length = 100, nullable = false)
    private String localizacao;
    
    @Column(length = 100, nullable = false)
    private String cidadeOcorrencia;
    
    @Column(length = 1, nullable = false)
    private boolean trote;
    
    @Transient
    public static Denuncia denuncia;

    public int getIdDenuncia() {
        return idDenuncia;
    }

    public String getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(String dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public String getNomeSuspeito() {
        return nomeSuspeito;
    }

    public void setNomeSuspeito(String nomeSuspeito) {
        this.nomeSuspeito = nomeSuspeito;
    }

    public String getDetalhesIncendio() {
        return detalhesIncendio;
    }

    public void setDetalhesIncendio(String detalhesIncendio) {
        this.detalhesIncendio = detalhesIncendio;
    }

    public byte[] getEvidencias() {
        return evidencias;
    }

    public void setEvidencias(byte[] evidencias) {
        this.evidencias = evidencias;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getDescricaoSuspeito() {
        return descricaoSuspeito;
    }

    public void setDescricaoSuspeito(String descricaoSuspeito) {
        this.descricaoSuspeito = descricaoSuspeito;
    }

    public String getCidadeOcorrencia() {
        return cidadeOcorrencia;
    }

    public void setCidadeOcorrencia(String cidadeOcorrencia) {
        this.cidadeOcorrencia = cidadeOcorrencia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Ibama getIbama() {
        return ibama;
    }

    public void setIbama(Ibama ibama) {
        this.ibama = ibama;
    }

    public boolean isTrote() {
        return trote;
    }

    public void setTrote(boolean trote) {
        this.trote = trote;
    }

}
