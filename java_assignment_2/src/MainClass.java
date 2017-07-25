import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by zemoso on 21/7/17.
 */
public class MainClass {
    public static String getInput() {
        return input;
    }

    public static void setInput(String input) {
        MainClass.input = input;
    }

    private static String input;

    /**
     * test for the presence of all alphabet.
     * @return  boolean
     */
    public static boolean testString() {
        int sum = 0;
        int flag[] = new int[26];
        Arrays.fill(flag, 0);


         // space compelxity  = O(n);
        char[] inputCharArray = getInput().toLowerCase().toCharArray();

        // time complexity  = O(n);
        for (int i = 0; i < inputCharArray.length; i++) {
           if ((int) inputCharArray[i] >= 97 && (int) inputCharArray[i] <= 122)
                flag[(int) inputCharArray[i] - 97] = 1;
        }
        for (int i = 0; i < 26; i++) {
            sum = sum + flag[i];
            if (flag[i] == 0)
                return false;
        }
        if (sum == 26)
            return true;

        return false;
    }

    public static void main(String[] args) {
        System.out.println("please inter the string..");
        Scanner sc = new Scanner(System.in);
        MainClass.setInput(sc.nextLine());

        if(MainClass.testString())
        System.out.println("wow..! your string have all alphabates");
        else
            System.out.println("sorry..!, your string does not have all alphabates");
    }
}
//   final time complexity = O(n);
//   final space complexity = O(n);