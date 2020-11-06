package univs.edu.ibama;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ibama {
    
    @Id
    @GeneratedValue
    private int idIbama;

    @Column(length = 100, nullable = false, unique = true)
    private String emailIbama;

    @Column(length = 100, nullable = false)
    private String senhaIbama;

    public int getIdIbama() {
        return idIbama;
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

    
    
}
