
package project.java.library;
public class Admin extends Human {
    
private String passward;
 
        
    public Admin(String name,String address,String phone,int age,String passward) {
        super(name,address,phone,age);
        this.passward=passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }
   

  
    
}
