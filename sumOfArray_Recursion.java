import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class sumOfArray_Recursion {
    static int SumArray(List<Integer> arrayy,int i){
        
        if(i == 0){
            return 0;

        }
        else{
            int sum = arrayy.get(i-1)+SumArray(arrayy,i-1);
            return sum;
        }

    }
    public static void main(String[] args) {
        List<Integer> arrayy = new ArrayList<>() ;
        arrayy.add(1);
        arrayy.add(3);
        arrayy.add(5);
        System.out.println(SumArray(arrayy, 3));

    }
    
}
