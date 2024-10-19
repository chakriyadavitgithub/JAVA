//here we ere expecting the AIBOS error
class Testthree {
    public static void main(String[] args) {
        int[] eids={101,102,103,104};
        //index 0 1 2 3
        System.out.println(eids[0]);//101
        System.out.println(eids[1]);//102
        //System.out.println(eids[10]);///AIOBException with out try and catch
        try{
            System.out.println(eids[10]);//with try & catch
        }
        catch(Exception e){
            System.out.println("Test cases");
        }
        System.out.println(eids[3]);
    }
    
}
