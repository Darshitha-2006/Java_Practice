import java.util.LinkedList;
import java.util.Scanner;

public class reversingInNodes_LinkedList {
    static LinkedList<Integer> reversal(LinkedList<Integer> array,int k){
        LinkedList<Integer> ans = new LinkedList<>();
        for(int i = k-1;i>=0;i--){
            ans.add(array.get(i));
        }
        for(int j = array.size()-1;j>=k;j--){
            ans.add(array.get(j));
        }

        return ans;
    }
    public static void main(String[] args){
        LinkedList<Integer> array = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of input LinkedList : ");
        int k = sc.nextInt();
        for(int n = 0;n<k;n++){
            int l = sc.nextInt();
            array.add(l);
        }
        System.out.println("enter node number");
        int inp = sc.nextInt();
        System.out.println(reversal(array,inp));
    }
}
