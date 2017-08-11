import static org.junit.Assert.*;
import java.io.File;

/**
 * Created by zemoso on 11/8/17.
 */
public class ListDirectoryTest {
    @org.junit.Test
    public void listFilesFromRegex() throws Exception {
        File [] files= new File("/home/").listFiles();
        ListDirectory listDirectory = new ListDirectory();
        listDirectory.setPattern(".+java");
        listDirectory.listFilesFromRegex(files);
        assertEquals(listDirectory.countOfFile , 188);
       listDirectory.setPattern(".+html");
       listDirectory.listFilesFromRegex(files);
       assertEquals(listDirectory.countOfFile , 689);
    }

}