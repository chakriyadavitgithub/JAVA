class Parent{
    Parent(String fname,String mname){
        System.out.println("Father Name"+fname+"and Mother Name"+mname);
    }
}
class Child extends Parent{
    Child(String cname,String fatherName, String mname){
        super(fatherName,mname);
        System.out.println("Child Name"+cname);
    }
}

public class Testtwo {
    public static void main(String[] args) {
        new Child("Rahul","Rajeeve-Gandhi","Sonia-Gandhi");
    }
}