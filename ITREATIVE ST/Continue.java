//Continue: skip the current iteration & execute the next iteration
public class Continue {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i==5)//here number will be skip from 1 to 10
            continue;
            System.out.println(i);
        }

    }
    
}
