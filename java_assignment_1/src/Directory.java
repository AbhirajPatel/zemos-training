import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zemoso on 21/7/17.
 */

public class Directory {
    public static int countOfAllFile =0;
    public static int countOfFile = 0;
    private static Pattern pattern;

    /**
     * show all the file within the home directory.
     * @param files
     */
    public void showAllfile(File[] files) {
        StringBuilder stringBuilder = new StringBuilder();
        for (File file : files) {

            Directory.countOfAllFile++;

                System.out.println(file.getAbsolutePath());
            if (file.isDirectory()) {
                showAllfile(file.listFiles());
            }
        }
        return;
    }

    /**
     * show file which matches the given regex
     * @param files
     */
    public  void showfiles(File[] files)
    {

        //Matcher m = pattern.matcher(" bngnbn");
        if(files != null)
           for (File file : files) {

               Matcher m = getPattern().matcher(file.getName());
               if (m.matches()) {
                   System.out.println("Name :" + file.getName());
                   System.out.println("path :" + file.getAbsolutePath());
                   Directory.countOfFile++;
               }

               if (file.isDirectory())
                   showfiles(file.listFiles());
           }
    }

    public Pattern getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = Pattern.compile(pattern);
    }
}
