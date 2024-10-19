 class Testfive {
    public static void main(String[] args) {
        //String to primitive datatype
        float a=Float.parseFloat(args[0]);
        float b=Float.parseFloat(args[1]);
        float sum=a+b;
        System.out.println(sum);
    }//the error will be occur
    //ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
}
