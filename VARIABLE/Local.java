 class A {
    static int b=40;///static
    int c=50;//instance
    public static void main(String[] args) {
        //local variable will be write under public void main
        int a=20;//local variable
        A t1=new A();
        System.out.println(a);
        System.out.println(t1.b);
        System.out.println(t1.c);
        System.out.println(b);
    }
    
}
