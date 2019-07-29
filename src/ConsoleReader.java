import java.io.*;

public class ConsoleReader
{
    public static void main(String[] args) throws FileNotFoundException {
        writetoconsole("Hello");
    }

    public static void writetoconsole(String data) throws FileNotFoundException {
        OutputStream writer = new  BufferedOutputStream(System.out);
        //BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(writer);
        try(writer) {
           writer.write(data.getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace(); //function related data is stored in stack
        }
    }
}

