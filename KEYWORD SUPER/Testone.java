
class Parent{
    Parent(String name,String mname){
        //System.out.println("Parent class constructor -1");
        System.out.println("Name"+name+"amd Mothername"+mname);
    }
}
class Child extends Parent{
    Child(String name,String surname,String mname){
       super(name,mname);
        //System.out.println("Child class");
       System.out.println("CHILD Name"+surname);

    }
}
class Testone{
    public static void main(String[] args) {
        new Child("chakri" ,"yadav","Kalpana");
    }
}