import java.lang.Math;
import java.util.Scanner;


public class decimalToBinary_Recursion {
    static int DecimalToBinary(int k){   
        int binary; 
        if(k==0){
           binary=  0;
        }
        else{
            binary = k%2 + 10*(DecimalToBinary(k/2));
        }
        return binary;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(DecimalToBinary(n));
    }
    
}
