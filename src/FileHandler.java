import java.io.FileNotFoundException;

public class FileHandler
{
    public static void main(String args[])
    {
        streamFileWriter myFile = new streamFileWriter(); //crl+alt+v
        String data = "HEllo how are you?";
        try {
            myFile.fileWriter("DataFile.txt",data);
        } catch (FileNotFoundException e) {
            System.out.println("Please give a valid name");
            e.printStackTrace();
        }

        streamFileReader file = new streamFileReader();
        try {
            String contents = file.fileReader("DataFile.txt");
            System.out.println(contents);
        } catch (FileNotFoundException e) {
            System.out.println("Please give valid name");
            e.printStackTrace();
        }
    }
}
