package univs.edu.bombeiro;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bombeiro {
    
    @Id
    @GeneratedValue
    private int idBombeiro;

    @Column(length = 100, nullable = false, unique = true)
    private String emailBombeiro;

    @Column(length = 100, nullable = false)
    private String senhaBombeiro;

    public int getIdBombeiro() {
        return idBombeiro;
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

    
}
