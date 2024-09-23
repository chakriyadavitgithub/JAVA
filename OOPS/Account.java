public class Account{
    private int acc_id;
    private String acc_name;
    private double acc_bal;
    //generate setter & getters

    public int getAcc_id() {
        return acc_id;
    }
    public void setAcc_id(int acc_id){
        this.acc_id=acc_id;
        
    }
    public String getAcc_name(){
        return acc_name;
    }
    public void setAcc_name(String acc_name){
        this.acc_name=acc_name;
    }
    public double getAcc_bal(){
        return acc_bal;
    }
    public void setAcc_bal(double acc_bal){
        this.acc_bal=acc_bal;
    }
    public static void main(String[] args) {
        Account a1=new Account();
        a1.setAcc_id(206);
        a1.setAcc_name("CHAKRI");
        a1.setAcc_bal(6000);
        System.out.println("Acc Id:"+a1.getAcc_id()+" and ACC Name:"+a1.getAcc_name()+"and ACC Bal:"+a1.getAcc_bal());  
    }

    }


    //output:
    //Acc Id:206 and ACC Name:CHAKRIand ACC Bal:6000.0