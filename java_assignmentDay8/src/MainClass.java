import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zemoso on 21/7/17.
 */
public class MainClass {


    public static void main(String[] args) {

        if(args.length == 0)
        {
            System.out.println("Please provide input file");
            return;
        }
        TextFile textFile = new TextFile();
        String fileString=null;
        try {
            fileString = textFile.read(args[0]);
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
            System.exit(1);
        } catch (Exception e) {
            System.out.println("Something went wrong, sorry!");
            System.exit(-1);
        }


        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = fileString.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int count[] = new int[127];
        Arrays.fill(count, 1);
        //Arrays.sort(chars);

        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], count[(int) chars[i]]++);
        }
        char[] Char = textFile.removeDuplicate(chars);

        for(int i= 0; i<Char.length ; i++){

            stringBuilder.append(Char[i]);
            stringBuilder.append("--");
            stringBuilder.append(map.get(Char[i]));
            stringBuilder.append("\n");

        }
        textFile.write("output_file_test1.txt", stringBuilder.toString());
       // textFile.write("output",stringBuilder.toString());
    }
}
