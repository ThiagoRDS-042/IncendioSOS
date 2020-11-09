package univs.edu.ibama;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Ibama {
    
    @Id
    @GeneratedValue
    private int idIbama;
    
    @Column(length = 18, nullable = false, unique = true)
    private String cnpj;
    
    @Column(length = 100, nullable = false)
    private String nomeIbama;
    
    @Column(length = 100, nullable = false)
    private String cidadeIbama;
    
    @Column(length = 100, nullable = false)
    private String estadoIbama;
    
    @Column(length = 100, nullable = false)
    private String ruaIbama;
    
    @Column(length = 100, nullable = false)
    private String responsavelIbama;
    
    @Column(length = 20, nullable = false)
    private String telefoneIbama;

    @Column(length = 100, nullable = false, unique = true)
    private String emailIbama;

    @Column(length = 100, nullable = false)
    private String senhaIbama;
    
    @Transient
    public static Ibama ibama;

    public int getIdIbama() {
        return idIbama;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCidadeIbama() {
        return cidadeIbama;
    }

    public void setCidadeIbama(String cidadeIbama) {
        this.cidadeIbama = cidadeIbama;
    }

    public String getEstadoIbama() {
        return estadoIbama;
    }

    public void setEstadoIbama(String estadoIbama) {
        this.estadoIbama = estadoIbama;
    }

    public String getRuaIbama() {
        return ruaIbama;
    }

    public void setRuaIbama(String ruaIbama) {
        this.ruaIbama = ruaIbama;
    }

    public String getResponsavelIbama() {
        return responsavelIbama;
    }

    public void setResponsavelIbama(String responsavelIbama) {
        this.responsavelIbama = responsavelIbama;
    }

    public String getTelefoneIbama() {
        return telefoneIbama;
    }

    public void setTelefoneIbama(String telefoneIbama) {
        this.telefoneIbama = telefoneIbama;
    }

    public String getEmailIbama() {
        return emailIbama;
    }

    public void setEmailIbama(String emailIbama) {
        this.emailIbama = emailIbama;
    }

    public String getSenhaIbama() {
        return senhaIbama;
    }

    public void setSenhaIbama(String senhaIbama) {
        this.senhaIbama = senhaIbama;
    }

    public String getNomeIbama() {
        return nomeIbama;
    }

    public void setNomeIbama(String nomeIbama) {
        this.nomeIbama = nomeIbama;
    }

    

    
    
}
