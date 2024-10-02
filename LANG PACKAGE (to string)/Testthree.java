class B{
    public String toString(){ //by using String we get the name
        return "Chakri";//over riding the object
    }////output : chakri
    public static void main(String[] args) {
        B b=new B();
        System.out.println(b);//chakri
        System.out.println(b.toString());
    }
}

///here while compaling javac & get the output java B