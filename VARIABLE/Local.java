 class A {
    static int b=40;///static
    int c=50;//instance
    public static void main(String[] args) {
        //local variable will be write public void main
        int a=20;//local variable
        A ref=new A();
        System.out.println(a);
        System.out.println(A.b);
        System.out.println(ref.c);
    }
    
}
