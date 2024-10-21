//by using the throws
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class Testone {
    //we have to use the throws by the strings after and we definitely get excetuted.
    //it will not occur the compile time error by using the throws.
    public static void main(String[] args)throws FileNotFoundException {
        PrintWriter pw=new PrintWriter("acd.txt");
        //here we didn't use throws means will be occur(FileNotFoundException).
    }
    
}
