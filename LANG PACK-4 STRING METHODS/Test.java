class Test{
    public static void main(String[] args) {
        String ename=new String("Chakri");
        String loc="  BNG   ";  //the whitespace will be cleared and the output will 8
        System.out.println(loc.length());//trim method wiil be helpful they remove the whitespace.
        String new_Loc=loc.trim();//we want to access the String and we will get the trim.
        System.out.println("After Triming");
        System.out.println(new_Loc.length());///here also the space will trim and get the output 3
    

        char ch=ename.charAt(1);
        System.out.println(ch);//while we are giving name chakri & the ouput will be(h) & here index value we give the (1)
        int i=ename.indexOf('a');
        System.out.println(i);//and this output will be the output 2
    }
}