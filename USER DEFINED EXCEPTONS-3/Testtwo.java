///by using the throw 
public class Testtwo {
   
        public static void m1(){
            System.out.println(10/5);
            //System.out.println(10/0);
            System.out.println(10/3);
            //here using the throw 
            try{
               throw new ArithmeticException("hii nancy");
                //System.out.println(10/0);
            }
            catch(ArithmeticException ae){
                ae.printStackTrace();
                System.out.println(ae.getMessage());
            }
            System.out.println(10/6);
        }
        public static void main(String[] args) {
            m1();
        }
    }

