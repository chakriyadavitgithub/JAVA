/// class ---------implements----------> interface.
//class to interface relation is implements.
interface Daoi{                   ///data access object
   public abstract void login();
   public abstract void logout();
}
interface  USI{                    ///User service interface
    public abstract void forgotpassword();

}
class DaoImpl implements Daoi,USI{   
    public void login(){System.out.println("Login successfully");}
    public void logout(){System.out.println("Log out sucees");}
   public void forgotpassword(){System.out.println("Forgot password");}

}
public class Multiple{
    public static void main(String[] args) {
        DaoImpl  obj=new DaoImpl();
        obj.login();
        obj.logout();
        obj.forgotpassword();
        
    }
}