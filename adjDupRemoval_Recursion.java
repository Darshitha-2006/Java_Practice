import java.util.*;
import java.util.Scanner;

public class adjDupRemoval_Recursion {
    static String adjDup_removal(String str) {
        // If the string length is less than 2, return the string itself
        if (str.length() < 2) {
            return str;
        }

        StringBuilder b = new StringBuilder(str);
        boolean foundDuplicates = false;

        for (int i = 1; i < b.length(); i++) {
            if (b.charAt(i) == b.charAt(i - 1)) {
                int j = i;
                while (j < b.length() && b.charAt(j) == b.charAt(i - 1)) {
                    j++;
                }
                b.delete(i - 1, j);
                foundDuplicates = true;
                break;
            }
        }

        if (foundDuplicates) {
            return adjDup_removal(b.toString());
        } else {
            return b.toString();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(adjDup_removal(str));
        sc.close();
    }
}