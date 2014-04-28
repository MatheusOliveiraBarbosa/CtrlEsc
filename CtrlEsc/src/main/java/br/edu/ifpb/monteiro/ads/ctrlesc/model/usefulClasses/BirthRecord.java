/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses;

import javax.persistence.Embeddable;

/**
 *
 * @author E.Wellington
 */
@Embeddable
public class BirthRecord {

    public BirthRecord(String folha, String livro, String registry) {
        this.folha = folha;
        this.livro = livro;
        this.registry = registry;
    }
    
    
    
    private String folha;
    
    private String livro;
    
    private String registry;

    public String getFolha() {
        return folha;
    }

    public void setFolha(String folha) {
        this.folha = folha;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getRegistry() {
        return registry;
    }

    public void setRegistry(String registry) {
        this.registry = registry;
    }
    
     
}
