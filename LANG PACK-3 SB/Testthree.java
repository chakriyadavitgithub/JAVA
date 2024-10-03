public class Testthree {
    public static void main(String[] args) {
        String ename1="Chakri";//it can be create in String constant pool only 
        String ename2=new String("Priya");///it can be create heap & String constatnt pool by using new .

        ename1=ename1.concat("Yadav");
        ename2=ename2.concat("Yadav");

        System.out.println(ename1);//CY
        System.out.println(ename2);//PY
    }
    
}
