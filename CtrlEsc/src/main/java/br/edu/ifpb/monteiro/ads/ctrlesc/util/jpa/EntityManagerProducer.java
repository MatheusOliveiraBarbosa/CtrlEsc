/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.monteiro.ads.ctrlesc.util.jpa;


import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 *
 * @author WitaloCarlos
 */

@ApplicationScoped
public class EntityManagerProducer {

	private static EntityManagerFactory factory;
        private static  Logger log = LogManager.getLogger(EntityManagerProducer.class);
        
	protected EntityManagerProducer() {
		EntityManagerProducer.factory = Persistence.createEntityManagerFactory("CtrlEsc");
	}
	
	@Produces
	@RequestScoped
	public EntityManager create() {
                log.info("Entity Manager was produced");
		return EntityManagerProducer.factory.createEntityManager();
	}
	
	public void close(@Disposes EntityManager manager) {
		manager.close();
	}
	
}
