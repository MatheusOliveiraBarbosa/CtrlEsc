/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.monteiro.ads.ctrlesc.model.security;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author WitaloCarlos
 */
@Embeddable
public class GroupTablePK implements Serializable{
    
   private static final long serialVersionUID = 1L;
    
    @Basic(optional = false)
    @Column(name = "idUser")
    private String idUser;
    
    @Basic(optional = false)
    @Column(name = "idGroup")
    private String idGroup;

    public GroupTablePK() {
    }

    public GroupTablePK(String idUser, String idGroup) {
        this.idUser = idUser;
        this.idGroup = idGroup;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(String idGroup) {
        this.idGroup = idGroup;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUser != null ? idUser.hashCode() : 0);
        hash += (idGroup != null ? idGroup.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GroupTablePK)) {
            return false;
        }
        GroupTablePK other = (GroupTablePK) object;
        if ((this.idUser == null && other.idUser != null) || (this.idUser != null && !this.idUser.equals(other.idUser))) {
            return false;
        }
        if ((this.idGroup == null && other.idGroup != null) || (this.idGroup != null && !this.idGroup.equals(other.idGroup))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.GrupoPK[idusuario=" + idUser + ", idgrupo=" + idGroup + "]";
    } 
    
}
