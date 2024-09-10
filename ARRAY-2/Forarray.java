//here by using the for loop & the arrays should be increase 
class Test {
    public static void main(String[] args) {
        int[][] two_D;
        two_D = new int[3][3];
        two_D[0][0] = 1;
        two_D[0][1] = 2;
        two_D[0][2] =3;
        two_D[1][0] =4;
        two_D[1][1] =5;
        two_D[1][2] =6;
        two_D[2][0] =7;
        two_D[2][1] =8;
        two_D[2][2] =100;//output:136
        int sum=0;
        for(int[] numbers:two_D){
            for(int num:numbers){
                sum=sum+num;

            }
        }
        System.out.println(sum);
    }
    
}
