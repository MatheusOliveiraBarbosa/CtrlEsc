package br.edu.ifpb.monteiro.ads.ctrlesc.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Administrator authority and atribudos contains methods for creating a 
 * administrator. 
 * @author Markus Patriota
 */

@br.edu.ifpb.monteiro.ads.ctrlesc.model.qualifiers.Administrator
@Entity
@Table(name = "TB_administrator")
public class Administrator extends Person {

    
}
