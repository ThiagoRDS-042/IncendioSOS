package univs.edu.bombeiro;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class CorpoDeBombeiros {
    
    @Id
    @GeneratedValue
    private int idBombeiro;
    
    @Column(length = 10, nullable = false, unique = true)
    private String companhiaBatalhao;
    
    @Column(length = 100, nullable = false)
    private String cidadeBombeiro;
    
    @Column(length = 100, nullable = false)
    private String estadoBombeiro;
    
    @Column(length = 100, nullable = false)
    private String ruaBombeiro;
    
    @Column(length = 100, nullable = false)
    private String nomeDoComandante;
    
    @Column(length = 20, nullable = false)
    private String telefoneBombeiro;
    
    @Column(length = 100, nullable = false, unique = true)
    private String emailBombeiro;

    @Column(length = 100, nullable = false)
    private String senhaBombeiro;
    
    @Column(nullable = false)
    private boolean verificaConta;
    
    @Transient
    public static CorpoDeBombeiros bombeiro;

    public int getIdBombeiro() {
        return idBombeiro;
    }

    public String getCompanhiaBatalhao() {
        return companhiaBatalhao;
    }

    public void setCompanhiaBatalhao(String companhiaBatalhao) {
        this.companhiaBatalhao = companhiaBatalhao;
    }

    public String getCidadeBombeiro() {
        return cidadeBombeiro;
    }

    public void setCidadeBombeiro(String cidadeBombeiro) {
        this.cidadeBombeiro = cidadeBombeiro;
    }

    public String getEstadoBombeiro() {
        return estadoBombeiro;
    }

    public void setEstadoBombeiro(String estadoBombeiro) {
        this.estadoBombeiro = estadoBombeiro;
    }

    public String getRuaBombeiro() {
        return ruaBombeiro;
    }

    public void setRuaBombeiro(String ruaBombeiro) {
        this.ruaBombeiro = ruaBombeiro;
    }

    public String getNomeDoComandante() {
        return nomeDoComandante;
    }

    public void setNomeDoComandante(String nomeDoComandante) {
        this.nomeDoComandante = nomeDoComandante;
    }

    public String getTelefoneBombeiro() {
        return telefoneBombeiro;
    }

    public void setTelefoneBombeiro(String telefoneBombeiro) {
        this.telefoneBombeiro = telefoneBombeiro;
    }

    public String getEmailBombeiro() {
        return emailBombeiro;
    }

    public void setEmailBombeiro(String emailBombeiro) {
        this.emailBombeiro = emailBombeiro;
    }

    public String getSenhaBombeiro() {
        return senhaBombeiro;
    }

    public void setSenhaBombeiro(String senhaBombeiro) {
        this.senhaBombeiro = senhaBombeiro;
    }

    public boolean isVerificaConta() {
        return verificaConta;
    }

    public void setVerificaConta(boolean verificaConta) {
        this.verificaConta = verificaConta;
    }

    

    
}
