import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class streamFileReader  //ctrl+alt+m to create a function
{
    public String fileReader(String fileName) throws FileNotFoundException
    {
        StringBuilder result = new StringBuilder();
        FileInputStream reader = new FileInputStream(fileName); //fileinput stream specific for file
        BufferedInputStream bufferedInputStream = new BufferedInputStream(reader); //more optimal can handle any type of stream
        try(bufferedInputStream) {
           // byte[] buffer = new byte[reader.available()];  //available checks the stream contents and gives number of characters
            byte[] buffer = new byte[8];
            while(bufferedInputStream.read(buffer)>0){
                result.append(new String(buffer));
                buffer = new byte[8];
            }
            //result = new String(buffer);
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return result.toString();
    }
}
