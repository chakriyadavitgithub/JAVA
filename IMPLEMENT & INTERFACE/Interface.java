///interface ---------extends---------> interface
///interface relation is extends
interface Daoi{
    void login();
    void logout();
}
interface USI extends Daoi{
    void forgotpassword();
}
class Usimpl implements USI{
    public void login(){System.out.println("Login successfully");}
    public void logout(){System.out.println("Log out sucess");}
    public void forgotpassword(){System.out.println("Forgot the password");}    
}
public class Interface{
public static void main(String[] args) {
     Usimpl obj=new Usimpl();
     obj.login();
     obj.logout();
     obj.forgotpassword();
}
}