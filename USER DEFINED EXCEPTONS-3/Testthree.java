 //by using throw and try catch
 class LowBalException extends Exception{
    LowBalException(String msg){
        super(msg);
    }
}
class Account{
    public void withdraw(int amount){
        int acc_Bal=500;
        try{
        if(acc_Bal>amount){
            System.out.println("HII SIRI");
        }
        else{
         throw  new LowBalException("Hii RAJu");
         //we don't give any values in throw down bcoz it is not access.
         //we have to give catch down only any values it will be access.
        }
    }catch(LowBalException le){
        System.out.println(le.getMessage());
        System.out.println("Hii Oleva");
    }
    }
    public static void main(String[] args) {
        new Account().withdraw(500);
    }
}
