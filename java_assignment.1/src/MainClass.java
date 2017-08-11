import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by zemoso on 21/7/17.
 */
public class MainClass {
    public static void main(String[] args) {
        String regex;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the regex u want to browse");
        regex = sc.next();
        ArrayList<File> files;
        ListDirectory directory = new ListDirectory();
        directory.setPattern(regex);
        try {
            File[] filesInDirectory = new File("/home/").listFiles();
            files = directory.listFilesFromRegex(filesInDirectory);
            for (File file1 : files) {
                System.out.println("Name :" + file1.getName());
                System.out.println("path :" + file1.getAbsolutePath());
            }
        } catch (NullPointerException e) {
            System.out.print("path is not given\n");
            System.exit(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Argument provided is not correct\n");
            System.exit(-1);
        } catch (Exception e) {
            System.out.println("exception \n ");
            System.exit(-1);
        }
        System.out.println("total files are:" + ListDirectory.countOfFile);
    }
}
