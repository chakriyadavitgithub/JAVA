package ArrayListEx;

import java.util.ArrayList;

public class ArrayListFour {
    public static void main(String[] args) {
        ArrayList<String> enames = new ArrayList<String>();
        enames.add("Nancy");
        enames.add("Sony");
        enames.add("Siri");
        enames.add("oleva");

        System.out.println(enames);
        //here we are write the array index[0,1,2,3] like that
        System.out.println(enames.get(0));
        System.out.println(enames.get(1));
        System.out.println(enames.get(2));
        System.out.println(enames.get(3));
    }
}