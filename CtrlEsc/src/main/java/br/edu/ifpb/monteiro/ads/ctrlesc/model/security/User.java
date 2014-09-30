
package br.edu.ifpb.monteiro.ads.ctrlesc.model.security;

import br.edu.ifpb.monteiro.ads.ctrlesc.util.security.Encrypter;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Helper class containing attributes for creating an login.
 * 
 * @author Witalo Carlos
 */

@Entity
@Table(name = "TB_users")
public class User implements Serializable{

    
    
   private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idUser")
    private String idUser;
    @Basic(optional = false)
    @Column(name = "userPassword")
    private String userPassword;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<GroupTable> grupoList;

   

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) throws Exception {
         try {
            this.userPassword = Encrypter.sha256HashPassword(userPassword);
        } catch (Exception exception) {
            throw new Exception("Encryption Error userPassword"
                    + " (".concat(userPassword).concat(") for SHA-256."));
        }
    }

    
    public List<GroupTable> getGrupoList() {
        return grupoList;
    }

    public void setGrupoList(List<GroupTable> grupoList) {
        this.grupoList = grupoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUser != null ? idUser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.idUser == null && other.idUser != null) || (this.idUser != null && !this.idUser.equals(other.idUser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getIdUser();
    }
    
}
