interface Sweets {
    void sweet();
}
interface Chocolates {
    void chocolate();
}
    /**
     * @param args the command line arguments
     */
public class Newyeargift {
    public void sweet() {
        System.out.println("Sweets for Newyear Gift");
    }
    public void chocolate() {
        System.out.println("Chocolates for Newyear Gift"); 
    }
    
    public static void main(String[] args) {
         Newyeargift ob = new  Newyeargift();
           ob.sweet();
           ob.chocolate();// TODO code application logic here
    }
    
}
