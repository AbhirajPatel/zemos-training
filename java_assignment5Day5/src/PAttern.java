import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by zemoso on 14/7/17.
 */

/**
 * to check the patter of the string from define regex ;
 */
public class PAttern {
    /**
     * will chetch the string against the defined regex in it.
     *
     * @param string
     * @return
     */
    public static boolean checkMatching(String string) {
        if (string != null) {
            Pattern p = Pattern.compile("^[A-Z].*[.]$");
            Matcher m = p.matcher(string);
            return m.matches();
        } else {
            System.out.print("you have passed null\n");
            return false;
        }
    }

    /**
     * main method to start the execution.
     *
     * @param args
     */
    public static void main(String[] args) {
        String string;
        Scanner sc = new Scanner(System.in);
        string = sc.nextLine().trim();
        if (checkMatching(string))
            System.out.println("well......!,  given line start with capital letter and end with period");
        else
            System.out.println("given line is not in desire format");
    }

}
