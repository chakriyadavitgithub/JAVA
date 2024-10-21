//illegal program exception
public class Testtwo {
    public static void main(String[] args) {
        Thread t=new Thread();
        t.setPriority(102);///IllegalArgumentException
        //we can use the try & catch
    }
    
}
