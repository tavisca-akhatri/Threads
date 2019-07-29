import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class streamFileReader  //ctrl+alt+m to create a function
{
    public String fileReader(String fileName) throws FileNotFoundException
    {
        String result = "";
        FileInputStream reader = new FileInputStream(fileName);
        try {
            byte[] buffer = new byte[reader.available()];
            reader.read(buffer);
            result = new String(buffer);
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
}
