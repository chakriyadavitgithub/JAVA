///String ilteral are used
//and it can be create the object constant String pool.
class A{}
class B{}
class C extends B{}
    public class Testfive{
        public static void main(String[] args) {
            int a=100;
            int b=200;
            int c=100;
            String ename1="Chakri";
            String ename2=new String("Chakri");
            StringBuffer ename3=new StringBuffer("Chakri");
            
            A obj1=new A();
            B obj2=new B();
            C obj3=new C();
///this is the only string can be used here.
//in this string objects only allowed.
            System.out.println(a==b);//false 
            System.out.println(a==c);//true
            System.out.println(b==a);//false

            //System.out.println(a==ename1); //compile error
            //System.out.println(a.equals(c));//CE

        }

    }
