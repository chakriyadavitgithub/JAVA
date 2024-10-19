 //UNBOXING:
//-When an Integer variable is assigned to a primitive int, unboxing automatically extracts the primitive value from the Integer wrapper. 

 class Testtwo {
    public static void main(String[] args) {
        Integer a =Integer.valueOf(20);
        int b=a.intValue();//unboxing
        int c=a.byteValue();
        float d=a.floatValue();
       // byte c=a; Integer can't be converted to byte
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(a);
    }

    
}
