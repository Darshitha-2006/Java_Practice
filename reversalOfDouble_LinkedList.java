import java.util.LinkedList;
import java.util.Scanner;

public class reversalOfDouble_LinkedList {
    static LinkedList<LinkedList<Integer>> reversingDouble(LinkedList<LinkedList<Integer>> array){
        int i = array.size();
        LinkedList<LinkedList<Integer>> finalAns = new LinkedList<LinkedList<Integer>>();
        for(int j = i-1 ;j>=0;j--){
            LinkedList<Integer> ans = new LinkedList<Integer>();
            for(int k = array.get(j).size()-1 ;k>=0;k--){
                ans.add(array.get(j).get(k));
            }
            finalAns.add(ans);
        }
        return finalAns;
    }
    public static void main(String[] args){
        LinkedList<LinkedList<Integer>> array = new LinkedList<LinkedList<Integer>>();
        System.out.println("Enter size of each sub linked list : ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("Enter size of master LinkedList");
        int i = sc.nextInt();
        for(int j = 0;j<i;j++){
            LinkedList<Integer> subList = new LinkedList<Integer>();
            for(int l = 0 ; l<k;l++){
                int input = sc.nextInt();
                subList.add(input);

            }
            array.add(subList);
        }
        System.out.println(reversingDouble(array));
    }
}
