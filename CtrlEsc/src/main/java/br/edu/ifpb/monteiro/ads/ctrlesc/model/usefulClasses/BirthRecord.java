package br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses;

import javax.persistence.Embeddable;

/**
 * Helper class containing attributes for creating an birth record.
 * 
 * @author E.Wellington
 */
@Embeddable
public class BirthRecord {

      
    private String folha;
    
    private String livro;
    
    private String registry;
    
    public BirthRecord(String folha, String livro, String registry) {
        this.folha = folha;
        this.livro = livro;
        this.registry = registry;
    }
    
    public BirthRecord(){
        
    }
    
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
