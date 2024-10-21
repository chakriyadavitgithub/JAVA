///number format exception
class Test{
    public static void main(String[] args) {
        try{
            int a=Integer.parseInt("Chakri");
            System.out.println(a*5);
        }
        catch(NumberFormatException nfe){
         nfe.printStackTrace();//we want direct output we can use this.
         System.out.println(nfe.getMessage());
         System.out.println(nfe.getClass());
        }
    }
}