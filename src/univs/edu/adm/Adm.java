package univs.edu.adm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Adm {
    
    @Id
    @GeneratedValue
    private int idAdm;

    @Column(length = 50, nullable = false, unique = true)
    private String emailAdm;

    @Column(length = 20, nullable = false)
    private String senhaAdm;
    
    @Transient
    public static Adm adm;

    public int getIdAdm() {
        return idAdm;
    }

    public String getEmailAdm() {
        return emailAdm;
    }

    public void setEmailAdm(String emailAdm) {
        this.emailAdm = emailAdm;
    }

    public String getSenhaAdm() {
        return senhaAdm;
    }

    public void setSenhaAdm(String senhaAdm) {
        this.senhaAdm = senhaAdm;
    }
}
