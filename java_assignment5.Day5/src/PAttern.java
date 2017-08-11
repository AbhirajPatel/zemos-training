import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by zemoso on 14/7/17.
 */

public class PAttern {
    public static void main(String[] args) {
        String string;

        Scanner sc = new Scanner(System.in);
        string = sc.nextLine().trim();

        Pattern p = Pattern.compile("^[A-Z].*[.]$");
        Matcher m = p.matcher(string);


        if(m.matches())
        System.out.println("well......!,  given line start with capital letter and end with period");
        else
            System.out.println("given line is not in desire format");

          }

}
