/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.monteiro.ads.ctrlesc.model.security;


import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author WitaloCarlos
 */
@Entity
@Table(name = "TB_group")
public class GroupTable implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected GroupTablePK groupTablePK;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idUser", referencedColumnName = "idUser", insertable = false, updatable = false)
    private User user;

    public GroupTable() {
    }

    public GroupTable(GroupTablePK groupTablePK) {
        this.groupTablePK = groupTablePK;
    }

    public GroupTable(String idUser, String idGroup) {
        this.groupTablePK = new GroupTablePK(idUser, idGroup);
    }

    public GroupTablePK getGroupTablePK() {
        return groupTablePK;
    }

    public void setGroupTablePK(GroupTablePK groupTablePK) {
        this.groupTablePK = groupTablePK;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

       
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (groupTablePK != null ? groupTablePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GroupTable)) {
            return false;
        }
        GroupTable other = (GroupTable) object;
        if ((this.groupTablePK == null && other.groupTablePK != null) || (this.groupTablePK != null && !this.groupTablePK.equals(other.groupTablePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Grupo[grupoPK=" + groupTablePK + "]";
    }
    
}
