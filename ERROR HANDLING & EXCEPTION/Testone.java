//here we are using the try and catch
//for without catch & try definitely we get the error
class Testone {
    public static void main(String[] args) {
        System.out.println("GM");
        try{
            System.out.println(10/0);///by using the try no error will be occur
        }
        catch(Exception e){//by using the catch & exception
            System.out.println("can't divide by zero");
        }
        System.out.println("Chakri");
    }
    
}
