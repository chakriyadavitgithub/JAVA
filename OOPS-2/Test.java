//constructor:is a special method & it is excetute directly
class Test{
    Test(){
        System.out.println("Test class constructor");
    }
public void m1(){System.out.println("test class constructor m1");}
public void m2(){}
public static void main(String[] args) {
    new Test();
    
}

}