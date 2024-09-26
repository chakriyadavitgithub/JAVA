//SA & CA are some times it will be come two excetutes
public class Test{
    public static void main(String[] args) {
      SA sa1= new SA(206,"Chakri" , 60000, "chakriyadav163@gmail.com");
         sa1.setMin_Bal(1000);
         double bal1=sa1.cal_bal();
         System.out.println(bal1);
    
       CA ca1=new CA(1314,"ROLEX" , 80000, "rolex17@gmail.com");
         ca1.setMin_Bal(2000);
         double bal2=ca1.cal_bal();
         System.out.println(bal2);
    }
    
}