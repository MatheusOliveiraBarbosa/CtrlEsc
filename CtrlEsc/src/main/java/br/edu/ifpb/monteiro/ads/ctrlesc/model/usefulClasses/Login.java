
package br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses;

/**
 *
 * @author E.Wellington
 */
public class Login {

    public Login(String user, String password) {
        this.user = user;
        this.password = password;
    }
    
    
    
    private String user;
    
    private String password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}