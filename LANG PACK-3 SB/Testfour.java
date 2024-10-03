///for the content comparsion
public class Testfour{
    public static void main(String[] args) {
        String ename1=new String("Chakri");
        StringBuffer ename2=new StringBuffer("Chakri");

        System.out.println(ename1.equals("Chakri"));//true
        System.out.println(ename2.equals("Chakri"));//false

        //System.out.println(ename1==ename2);///relation is required
    }
}
