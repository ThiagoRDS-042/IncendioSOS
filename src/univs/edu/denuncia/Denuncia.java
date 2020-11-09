package univs.edu.denuncia;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Denuncia {

    @Id
    @GeneratedValue
    private int idDenuncia;

    @Column(nullable = false)
    private int idUsuario;

    @Column(nullable = false)
    private int idIbama;
    
    @Column(length = 100, nullable = false)
    private String nomeSuspeito;
    
    @Column(length = 100, nullable = false)
    private String nomeUsuario;
    
    @Column(length = 100, nullable = false)
    private String estadoUsuario;
    
    @Column(length = 100, nullable = false)
    private String cidadeUsuario;
    
    @Column(length = 100, nullable = false)
    private String ruaUsuario;
    
    @Column(length = 100, nullable = false)
    private String detalhesIncendio;
    
    @Column(length = 100, nullable = false)
    private String descricaoSuspeito;
    
    @Column(length = 300, nullable = false)
    private byte[] evidencias;

    @Column(length = 100, nullable = false)
    private String localizacao;

    public int getIdDenuncia() {
        return idDenuncia;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdIbama() {
        return idIbama;
    }

    public void setIdIbama(int idIbama) {
        this.idIbama = idIbama;
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

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public String getCidadeUsuario() {
        return cidadeUsuario;
    }

    public void setCidadeUsuario(String cidadeUsuario) {
        this.cidadeUsuario = cidadeUsuario;
    }

    public String getRuaUsuario() {
        return ruaUsuario;
    }

    public void setRuaUsuario(String ruaUsuario) {
        this.ruaUsuario = ruaUsuario;
    }

    public String getDescricaoSuspeito() {
        return descricaoSuspeito;
    }

    public void setDescricaoSuspeito(String descricaoSuspeito) {
        this.descricaoSuspeito = descricaoSuspeito;
    }

   
    
    
}
