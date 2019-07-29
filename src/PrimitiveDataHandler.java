import java.io.*;

public class PrimitiveDataHandler
{
    public static String fileReader(String fileName) throws FileNotFoundException
    {
        StringBuilder result = new StringBuilder();
        FileInputStream reader = new FileInputStream(fileName); //fileinput stream specific for file
        DataInputStream datareader = new DataInputStream(reader); //more optimal can handle any type of stream
        try(datareader) {
            // byte[] buffer = new byte[reader.available()];  //available checks the stream contents and gives number of characters
            System.out.println(datareader.readChar());
            System.out.println(datareader.readBoolean());
            System.out.println(datareader.readDouble());
            //result = new String(buffer);
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return result.toString();
    }

    public static void main(String args[]) throws FileNotFoundException {
        fileReader("Datafile1.txt");
    }
}
