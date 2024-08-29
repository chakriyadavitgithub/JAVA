// public class Test {
//     public static void main(String[] args) {
//         ///by using int the o/p will be (I@33cb5951)
//         int[] sizes ={40,42,46};
//         System.out.println(sizes);
//         //for use for correct order o/p
//         for (int size : sizes){
//         System.out.println(size);
//         }
//     }
// }


public class Test{
    public static void main(String[] args) {
        /// the int :o/p[Ljava.lang.String;@140e5a13
        String[] enames={"priya","chakri"};
        System.out.println(enames);
        //by using for the names in string
        for (String ename : enames){
            System.out.println(ename);
        }
    }
}
