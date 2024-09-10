//from here by using the getdata & for loop and the  values will be excetute.
class Test {
    public static void main(String[] args) {
    getData(new int[] {10,20,30,40,50});

    }
    //by using the for loop
    public static void getData(int[] numbers){
        for(int i : numbers){
            System.out.println(i); ///output:10 20 30 40 50
        }
    }
}
