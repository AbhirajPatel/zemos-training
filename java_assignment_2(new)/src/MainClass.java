import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by zemoso on 21/7/17.
 */
public class MainClass {

    /**
     * test for the presence of all alphabet.
     * @return  boolean
     */
    public  static boolean testString(String string) {
        // space compelxity = O(1);
        boolean[] b = new boolean[26];

        // time complexity  = O(n);
        for (int i = 0; i < string.length(); i++) {
          if(string.charAt(i) >= 'a' && string.charAt(i) <= 'z' )
              b[(int)string.charAt(i) - 97]= true;
          else if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z')
              b[(int)string.charAt(i) - 65]= true;

        }
        for (int i = 0 ; i < 26 ; i++ ){
            if(!b[i])
                return false;
        }
        return true;
        }

    public static void main(String[] args) {

        System.out.println("please inter the string..");
        Scanner sc = new Scanner(System.in);


        if(MainClass.testString(sc.nextLine()))
        System.out.println("wow..! your string have all alphabets");
        else
            System.out.println("sorry..!, your string does not have all alphabets");
    }
}
//   final time complexity = O(n);
//   final Space complexity = O(1);