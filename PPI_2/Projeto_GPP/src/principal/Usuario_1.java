/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Filipe
 */
@Entity
@Table(name = "usuario", catalog = "projetopizza", schema = "")
@NamedQueries({
    @NamedQuery(name = "Usuario_1.findAll", query = "SELECT u FROM Usuario_1 u"),
    @NamedQuery(name = "Usuario_1.findByIdUsuario", query = "SELECT u FROM Usuario_1 u WHERE u.idUsuario = :idUsuario"),
    @NamedQuery(name = "Usuario_1.findByNmUsuario", query = "SELECT u FROM Usuario_1 u WHERE u.nmUsuario = :nmUsuario"),
    @NamedQuery(name = "Usuario_1.findByLogin", query = "SELECT u FROM Usuario_1 u WHERE u.login = :login"),
    @NamedQuery(name = "Usuario_1.findBySenha", query = "SELECT u FROM Usuario_1 u WHERE u.senha = :senha")})
public class Usuario_1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario")
    private Short idUsuario;
    @Basic(optional = false)
    @Column(name = "nm_usuario")
    private String nmUsuario;
    @Basic(optional = false)
    @Column(name = "login")
    private String login;
    @Basic(optional = false)
    @Column(name = "senha")
    private String senha;

    public Usuario_1() {
    }

    public Usuario_1(Short idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario_1(Short idUsuario, String nmUsuario, String login, String senha) {
        this.idUsuario = idUsuario;
        this.nmUsuario = nmUsuario;
        this.login = login;
        this.senha = senha;
    }

    public Short getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Short idUsuario) {
        Short oldIdUsuario = this.idUsuario;
        this.idUsuario = idUsuario;
        changeSupport.firePropertyChange("idUsuario", oldIdUsuario, idUsuario);
    }

    public String getNmUsuario() {
        return nmUsuario;
    }

    public void setNmUsuario(String nmUsuario) {
        String oldNmUsuario = this.nmUsuario;
        this.nmUsuario = nmUsuario;
        changeSupport.firePropertyChange("nmUsuario", oldNmUsuario, nmUsuario);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        String oldLogin = this.login;
        this.login = login;
        changeSupport.firePropertyChange("login", oldLogin, login);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        String oldSenha = this.senha;
        this.senha = senha;
        changeSupport.firePropertyChange("senha", oldSenha, senha);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario_1)) {
            return false;
        }
        Usuario_1 other = (Usuario_1) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "principal.Usuario_1[ idUsuario=" + idUsuario + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
