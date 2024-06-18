import java.util.Scanner;

public class reversingString_Recursion {

    static String stringReversal(String str, int i) {
        if (i < 0) {
            return "";
        }
        return str.charAt(i) + stringReversal(str, i - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();  // Close the scanner to avoid resource leaks
        System.out.println(stringReversal(str, str.length() - 1));
    }
}