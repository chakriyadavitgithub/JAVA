//Autoboxing:primitive data types like:Autoboxing in Java is a feature that automatically converts primitive types into their corresponding wrapper classes. 
class Testone {
    public static void main(String[] args) {
        Integer i=15;//autoboxing
       //Integer i =Integer.ValueOf(15); //compile error
       //and this is the all primitive datatypes of the autoboxing
        System.out.println(i);
        System.out.println(i.byteValue());
        System.out.println(i.shortValue());
        System.out.println(i.longValue());
        System.out.println(i.intValue());
        System.out.println(i.doubleValue());
        System.out.println(i.doubleValue());
        //all output will be same(15)
        

    }
    
}


