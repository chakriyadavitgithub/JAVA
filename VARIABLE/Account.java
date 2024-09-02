class Account {
    int acc_id=3634;
    String acc_name="chakri";
    double acc_balance=80000;
    static double min_bal=2000.00;
    static String branch_name="SBI";
    public static void main(String[] args) {
       Account a1=new Account();
       Account a2=new Account();
       Account a3=new Account();
System.out.println(a1.acc_id);
System.out.println(a1.acc_name);
System.out.println(a3.acc_balance);
System.out.println(a2.min_bal);


    }
    
}
