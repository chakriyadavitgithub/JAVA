interface Account{
   public abstract int get_bal();
    public abstract void close_account();
}
class SA implements Account{
    public int get_bal(){
        return 100;
    
    }
    public void close_account(){
        System.out.println("Account closed succes");
    }
public static void main(String[] args) {
    SA S=new SA();
    System.out.println(S.get_bal());
    S.close_account();
    
}
}

