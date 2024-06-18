import java.util.Scanner;

public class RecursionProblems_GFG {
    public static int printing(int n){
        System.out.println(n);
        
        if(n==1){
            return 0;
        }
        printing(n-1);
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        printing(n);

    }
    
}
