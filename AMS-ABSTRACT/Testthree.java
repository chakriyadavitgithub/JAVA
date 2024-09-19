///Account
abstract class Account{
    public void open_AC(){
        System.out.println("Account opened successfully");
    }
    public abstract int get_bal();
    
}
class SA extends Account{
    public int get_bal(){
        return 100;
    }
}
    class Testthree{
    public static void main(String[] args) {
        SA obj=new SA();
           obj.open_AC();
           int bal=obj.get_bal();
           System.out.println(bal);
    }
}

