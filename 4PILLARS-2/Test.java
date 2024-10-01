class Test{///here using the static directly we didn't use the sysout we can access directly
    public static void main(String[] args) {
       SA sa1=new SA("Chakri", "chakri@gmail.com", "Andhra Pradesh", 206, 80000);
       sa1.setMin_Bal(1000);
       CA ca1=new CA(201, "Sandy", "sandy@gmail.com", 70000, "USA");
       ca1.setMin_Bal(3000);
       Accountservice.get_Services(sa1);
       Accountservice.get_Services(ca1);//access the direct services
    }
}