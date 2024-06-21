import java.util.LinkedList;
import java.util.Scanner;

public class Palindrome_LinkedList {
    static boolean palindromeOrNot(LinkedList<Character> array){
        LinkedList<Character> rev = new LinkedList<>();
        int size = array.size();
        for(int i = size-1;i>=0;i--){
            rev.add(array.get(i));
        }
        if(array.equals(rev)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> array = new LinkedList<>();
        String input = sc.nextLine();
        for(char c : input.toCharArray()){
            array.add(c);
        }
        System.out.println(palindromeOrNot(array));

    }
}
