///even or odd numbers
package conditional;
class Test{
    public static void main(String[] args) {
        //int num=42; //even
        int num=77; //odd
        String msg=num%2==0? "Even" : "Odd";
        System.out.println(msg);
    }
}