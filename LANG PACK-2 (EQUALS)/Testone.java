class A{}
public class Testone {

    
    public static void main(String[] args) {
        A a=new A();
        String ename1="Chakri";
        String ename2= new String("Chakri");
        String ename3="Chakri";

        System.out.println(ename1.equals(ename2));//true
        System.out.println(ename1 == ename2);//false

        System.out.println(ename1.equals(ename3));//true
        System.out.println(ename1 == ename3);//true

        System.out.println(a.equals(ename1));///false
        System.out.println(a == ename1);//error incomparable type: A & String

    }
}
