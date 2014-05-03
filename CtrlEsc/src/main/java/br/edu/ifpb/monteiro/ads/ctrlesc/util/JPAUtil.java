/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.monteiro.ads.ctrlesc.util;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author E.Wellington
 */
public class JPAUtil {

    @PersistenceContext(unitName = "CtrlEsc")
    private static EntityManager emf;

    public static EntityManager getEntityManager() {
        return emf;
   
    }
}
