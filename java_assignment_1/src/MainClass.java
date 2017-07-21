import java.io.File;
import java.util.Scanner;

/**
 * Created by zemoso on 21/7/17.
 */
public class MainClass {
    public static void main(String[] args){

        File[] file = new File("/home/").listFiles();
        String regex;
        // List= file.list();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the regex u want to browse");
        regex=sc.next();

        Directory directory = new Directory();
        directory.setPattern(regex);
        directory.showfiles(file);

        //showfileAll(file);
        System.out.println("total files are:" + Directory.countOfFile);
    }
}
