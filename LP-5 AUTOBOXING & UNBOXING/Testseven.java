class Testseven{
    //by using the primitive datatypes to String
    public static void main(String[] args) {
        int a=10;
        Integer i=a;//autoboxing 
        Integer i1=Integer.valueOf(a);//primitive to the object

        String s1=i.toString(a);//object to string
        int b=Integer.parseInt(s1);//String to primitive
        int c=i.intValue();//object to primitive

        System.out.println(a);//and the whole output will be same (10)
        System.out.println(b);
        System.out.println(c);
        System.out.println(s1);
        System.out.println(i);
    }
}