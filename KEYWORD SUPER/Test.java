class Account{ ///parent class or super class
    String acc_Name;
    String acc_Email;
    Account(String name,String email){
        this.acc_Name=name;
        this.acc_Email=email;
    }
}
class SA extends Account {   
    int acc_Id;                ///// child class or derived class
    double acc_Bal;
    static double min_BAl=500;
    SA(int id, String name ,double bal,String email){
        super(name,email); //invoke the parent class constructor
        this.acc_Id=id;
        this.acc_Bal=bal;
    }
}
public class Test{
    public static void main(String[] args) {
        new SA(206,"chakri",5000,"chakriyadav163@gmail.com");
    }
}