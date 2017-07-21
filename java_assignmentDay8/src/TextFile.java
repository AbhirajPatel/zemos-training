/**
 * Created by zemoso on 21/7/17.
 */
//package net.mindview.util;
import java.io.*;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.*;
public class TextFile {
    /**
     *    Read a file as a single string:
      */

    public String read(String fileName) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader in = new BufferedReader(new FileReader(
                new File(fileName)));
        String s;
        while ((s = in.readLine()) != null) {
            sb.append(s);
            sb.append("\n");
        }
        return sb.toString();
    }
    /**
     * remove the dublicated charecter from the char array;
     * @param chr
     * @return
     */
    public char[] removeDuplicate(char[] chr )
    {
        Arrays.sort(chr);
        String string = "";
        for(int i = 0; i < chr.length; i++)
        {
           if( string.indexOf(chr[i])== -1 )
               string = string+chr[i];
        }
        return string.toCharArray();
    }

    /**
     *  Write a single file in one method call:
     */

    public void write (String fileName, String text) {

        StringBuilder stringBuilder = new StringBuilder();
        File file = new File(fileName);
        try{
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(text);
            bufferedWriter.close();
        }
        catch (IOException e){
            System.out.println("something went wrong");
        }
        finally {
            System.out.println("written on given file:  " +fileName +" , thanku....");
        }

    }

}
