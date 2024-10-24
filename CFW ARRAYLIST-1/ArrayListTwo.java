package ArrayListEx;

import java.util.ArrayList;

public class ArrayListTwo{
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();//allowed heterogenous elements
        ArrayList<String> enames=new ArrayList<String>();//allowed only string objects
        enames.add("Nancy");
        enames.add("Sony");
        enames.add("Siri");
        enames.add("oleva");
        System.out.println(enames);

        //print size of array list
        System.out.println(enames.size());//4

        //verify is empty list or not
        System.out.println(enames.isEmpty());//false

        //verify element/object presents in the list or not?
        System.out.println(enames.contains("Nancy"));//true

        //in this array list the babe name is not their and contains says the it is false.
        System.out.println(enames.contains("Babe"));//false
    }
}

// //from exceute process.
// javac -d . Testone.java 
//java ArrayListEx.Test
// //tree /F
