import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Dataoutputstream
{
    public void writeData(String fileName,String data) throws FileNotFoundException {
        FileOutputStream writerstream = new FileOutputStream(fileName,true);
        DataOutputStream writer = new DataOutputStream(writerstream); //can write to sny object
        try(writer)
        {
            writer.writeChar('A');
            writer.writeBoolean(true);
            writer.writeDouble(22);
            writer.write(data.getBytes());
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }



    public static void main(String args[]) throws FileNotFoundException {
        Dataoutputstream data = new Dataoutputstream();
        data.writeData("Datafile1.txt","Hello");
    }


}
