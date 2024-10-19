 //here by using string and null point exception
 class Testfour {
    public static void main(String[] args) {
        //String ename="VIRAT";
        String ename=null;
        try{
        System.out.println(ename.length());
        }
        catch(Exception e){
        System.out.println(e.getMessage());
        }
        System.out.println("GM");
    }
    
}
