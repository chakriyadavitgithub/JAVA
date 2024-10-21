import java.io.FileNotFoundException;
import java.io.PrintWriter;
class Test{
    public static void main(String[] args) {
        try{
      PrintWriter  pw=new PrintWriter("chak.txt");
        }catch(FileNotFoundException fnfe){
            fnfe.printStackTrace();//here we can exceute the direct ouput by using <----------
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
//by using the try and catch

    }
}