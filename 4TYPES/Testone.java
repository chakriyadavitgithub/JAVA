 class Testone {
    public static void main(String[] args) {
     SA sa1= new SA(1314, "Mahesh", 50000, "mahesh@gmail.com");
     sa1.setMin_Bal(1000);
     
     
      CA ca1= new CA(206, "Prabhas", 60000, "prabhas23@gmail.com");
      ca1.setMin_Bal(2000);
      Accountservice.get_Services(sa1);
      Accountservice.get_Services(ca1);
    }
    
}


