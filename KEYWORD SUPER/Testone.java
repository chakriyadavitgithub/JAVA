
class Parent{
    Parent(String name,String mname,String fname){
        //System.out.println("Parent class constructor -1");
         System.out.println("Name"+name+"and Mothername"+mname+"and Fathername"+fname);
    }
}
class Child extends Parent{
    Child(String name,String surname,String mname,String fname){
       super(name,mname,fname);
        //System.out.println("Child class");
        System.out.println("CHILD Name"+surname);

    }
}
class Testone{
    public static void main(String[] args) {
        new Child("Chakri" ,"yadav","Kalpana","Batheiah");
    }
}