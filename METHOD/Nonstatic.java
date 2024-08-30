class Employe{
    int eid=101;
    public void m1(){
        System.out.println("empty m1-method()");///non static members

    }
    ///how to access non static members-using the object
    public static void main(String[] args) {
        Employe e1=new Employe();///here object is e1
        System.out.println(e1.eid);
        e1.m1();
    }

    
}
