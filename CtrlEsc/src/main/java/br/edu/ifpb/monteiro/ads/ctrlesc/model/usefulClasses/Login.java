
package br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses;

import javax.persistence.Embeddable;

/**
 *
 * @author E.Wellington
 */
@Embeddable
public class Login {

    public Login(String user, String password) {
        this.login = user;
        this.password = password;
    }
    public Login(){
        
    }
     
    private String login;
    
    private String password;

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
