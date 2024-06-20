import java.util.LinkedList;
import java.util.Scanner;

public class reverseLinkedList_Recursion {
    static LinkedList<Integer> reversalOfLinkedList(LinkedList<Integer> array){
        LinkedList<Integer> ans = new LinkedList<Integer>();
        int i = array.size();
        for(int j = i-1; j >=0; j--){
            ans.add(array.get(j));
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println("Enter the size of linked list");
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> array = new LinkedList<Integer>();
        int k = sc.nextInt();
        for(int i = 0; i<k; i++){
            int e = sc.nextInt();
            array.add(e);
        }
        System.out.println(reversalOfLinkedList(array));
    }
}
