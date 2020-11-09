package univs.edu.usuario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Usuario {

    @Id
    @GeneratedValue
    private int idUsuario;

    @Column(length = 100, nullable = false)
    private String nomeUsuario;
    
    @Column(length = 14, nullable = false, unique = true)
    private String cpfUsuario;
    
    @Column(length = 20, nullable = false)
    private String telefoneUsuario;
    
    @Column(length = 100, nullable = false)
    private String cidadeUsuario;
    
    @Column(length = 100, nullable = false)
    private String estadoUsuario;
    
    @Column(length = 100, nullable = false)
    private String ruaUsuario;

    @Column(length = 100, nullable = false, unique = true)
    private String emailUsuario;

    @Column(length = 100, nullable = false)
    private String senhaUsuario;
    
    @Transient
    public static Usuario usuario;

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpfUsuario(String cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public String getTelefoneUsuario() {
        return telefoneUsuario;
    }

    public void setTelefoneUsuario(String telefoneUsuario) {
        this.telefoneUsuario = telefoneUsuario;
    }

    public String getCidadeUsuario() {
        return cidadeUsuario;
    }

    public void setCidadeUsuario(String cidadeUsuario) {
        this.cidadeUsuario = cidadeUsuario;
    }

    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public String getRuaUsuario() {
        return ruaUsuario;
    }

    public void setRuaUsuario(String ruaUsuario) {
        this.ruaUsuario = ruaUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    
    
}
