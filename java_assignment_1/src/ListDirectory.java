import java.io.File;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Created by zemoso on 21/7/17.
 */

public class ListDirectory {
    public static int countOfFile = 0;
    private static Pattern pattern;
    private static ArrayList<File> files1 = new ArrayList<>();

    /**
     * show file which matches the given regex
     *
     * @param files
     */
    public ArrayList<File> listFilesFromRegex(File[] files) {

        if (files != null)   //   check for null ?
            for (File file : files) {

                Matcher m = getPattern().matcher(file.getName());
                if (m.matches()) {
                    files1.add(file);
                    ListDirectory.countOfFile++;
                }

                if (file.isDirectory())
                    listFilesFromRegex(file.listFiles());
            }
        return files1;
    }

    public Pattern getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        try {
            this.pattern = Pattern.compile(pattern);
        } catch (PatternSyntaxException e) {
            System.out.println("enter correct syntax of pattern");
            System.exit(-1);
        } catch (Exception e) {
            System.exit(-1);
        }
    }
}
