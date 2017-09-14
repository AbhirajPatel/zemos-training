/**
 * Created by zemoso on 12/9/17.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 * DataExtraction class
 */
public class DataExtraction {
    public static String department;

    /**
     * static method;
     * write method to write the given string on the given filename;
     *
     * @param fileName
     * @param text
     */
    public static void write(String fileName, String text) {
        StringBuilder stringBuilder = new StringBuilder();
        File file = new File(fileName);
        try {
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(text);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("something went wrong");
        } finally {
            System.out.println("written on given file:  " + fileName + " \n, thanku....");
        }
    }

    /**
     * main method for execution;
     *
     * @param a
     */
    public static void main(String a[]) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("deparment" + "," + "code" + "," + "discription" + "," + "rate" + "\n");
        try {
            Document document = Jsoup.connect("http://dme.ap.nic.in/ma/nims.html").get();
            Elements pList = document.select("p.MsoPlainText");
            for (Element p : pList) {

                if (p.text().contains("DEPARTMENT OF ")) {
                    int firstIndex = p.text().indexOf("D");
                    int lastIndex = p.text().length() - 1;
                    if (firstIndex > -1 && lastIndex > -1) {
                        department = p.text().substring(firstIndex, lastIndex);
                    }
                    continue;
                }
                if (p.text().length() > 25 && !p.text().contains("DEPARTMENT") &&
                        !p.text().contains("------")) {
                    stringBuilder.append(department + ",");
                    int firstIndex = p.text().indexOf(" ");
                    int lastIndex = p.text().lastIndexOf(" ");

                    StringBuilder description = new StringBuilder(p.text());
                    if (firstIndex > -1 && lastIndex > -1) {
                        description.setCharAt(firstIndex, ',');
                        description.setCharAt(lastIndex, ',');
                    }
                    stringBuilder.append(description.toString());
                    stringBuilder.append("\n");
                }
            }
            write("output.csv", stringBuilder.toString());
        } catch (IOException e) {
            System.exit(-1);
        }
    }
}
