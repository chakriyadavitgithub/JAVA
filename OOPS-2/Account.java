public class Account{
    int acc_id;
    String acc_name;
    double acc_bal;
     double min_bal=500.00;
    
    public Account(int id,String name,double amount){
        this.acc_id=id;
        this.acc_name=name;
        this.acc_bal=amount;
    }
    public void open_Account(){}
    public boolean depoist_Amount(double amount){
        this.acc_bal=this.acc_bal+amount;
    return true;
    }
    public double get_bal(){
        return this.acc_bal;
        return this.min_bal=this.min_bal();
    }
    public static void main(String[] args) {
      Account a1=new Account(206,"Chakri",60000);
      a1.depoist_Amount(300);
      System.out.println(a1.get_bal());
      
    }
}



