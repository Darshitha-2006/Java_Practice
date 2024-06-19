import java.util.Scanner;

public class productOf2Numbers_Recursion {
    static int product(int a, int b){
        
        if(b == 0){
            return 0;
        }
        return a + product(a,b-1);    
    }
    public static void main(String[] args){
        System.out.println(product(1,2));
    }
}
