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
    private String detalhes;
    
    @Column(length = 100, nullable = false)
    private String evidencias;

    @Column(length = 100, nullable = false)
    private String estado;
    
    @Column(length = 100, nullable = false)
    private String cidade;
    
    @Column(length = 100, nullable = false)
    private String complemento;

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

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public String getEvidencias() {
        return evidencias;
    }

    public void setEvidencias(String evidencias) {
        this.evidencias = evidencias;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    
}
