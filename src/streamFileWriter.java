import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class streamFileWriter
{
//    public String readFile(String fileName)
//    {
//        return null;
//    }
//
    public void fileWriter(String fileName, String data) throws FileNotFoundException {
        FileOutputStream writer = new FileOutputStream(fileName);
        try(writer) {
            writer.write(data.getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace(); //function related data is stored in stack
        }
    }
}