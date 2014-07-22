
package br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses;

import javax.persistence.Embeddable;

/**
 * Helper class containing attributes for creating an login.
 * 
 * @author E.Wellington
 */
@Embeddable
public class Login {

    private String login;
    
    private String password;

    
    public Login(String user, String password) {
        this.login = user;
        this.password = password;
    }
    
    public Login(){
        
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
