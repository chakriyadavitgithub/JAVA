///polymorphism
class Employee{
    String name;
   Employee (String name){
    this.name=name;
   }
}
class Manager extends Employee{ //by using the extends and it is child class
    String Branch;
    Manager(String name,String Branch){
        super(name);
        this.Branch=Branch;
    }
}
class Test{
    public static void main(String[] args) { //& we create the object 
        Manager m1=new Manager("Chakri", "EEE");
        System.out.println(m1.name+":"+m1.Branch);
        
    }
}