//static method
//  class Employe{
//     int eid=101;
//     public static void main(String[] args) {
//         System.out.println("Employe class - m1 method");
//     }

    
// }

class Employe{
    ///by using static only we can excetute and didn't use means error eill be occur
    ///by using the object is compulsory in static
    static int eid=101;
     public static void  m1(){
        System.out.println("Employe class - m1 method");
     }
    public static void main(String[] args) {
        //System.out.println(eid);
        m1();//non-static variable eid cannot be referenced from a static context
    }

}
