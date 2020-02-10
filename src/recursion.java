package src;

public class recursion {
    static int count=0;
    static void p(){
        count++;
        if(count<=108){
            System.out.println("om namah shivay! shivji sada sahay\n" +
                    "   om namah shivay! guruji sada sahay"+count);
            p();
        }
    }
    public static void main(String[] args) {
        p();
    }
}
