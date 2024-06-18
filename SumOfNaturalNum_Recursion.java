import java.util.Scanner;

public class SumOfNaturalNum_Recursion {
    static int Sum(int n, int i){
        
        if(n==1){
            return 0;
        }
        
        return n+Sum(n-i, i);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Sum(n, 1));
    }
    
}
