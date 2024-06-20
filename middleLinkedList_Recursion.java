import java.util.LinkedList;
import java.util.Scanner;

public class middleLinkedList_Recursion {
    static int midOfLinkedlist(LinkedList<Integer> array ) {
        int i = array.size();
        if (i % 2 != 0) {
            return array.get(i % 2);
        }
        return array.get((i % 2) + 1);
    }
    public static void main(String[] args){
        LinkedList<Integer> array = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int j = 0;j<k;j++){
            int l = sc.nextInt();
            array.add(l);
        }
        System.out.println(midOfLinkedlist(array));

    }
}
