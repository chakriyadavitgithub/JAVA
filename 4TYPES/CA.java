public class CA extends Account{
    
    private double min_Bal;
    private int acc_ID;
    private double acc_Bal;
    public CA(int id,String name,double bal,String email){
        super(name,email);
        this.acc_ID=id;
        this.acc_Bal=bal;
    }
    public double getMin_Bal() {
        return min_Bal;
    }
    public void setMin_Bal(double min_Bal) {
        this.min_Bal = min_Bal;
    }
    public double cal_bal(){
        double bal=this.acc_Bal-this.getMin_Bal();
        return bal;
    }
}