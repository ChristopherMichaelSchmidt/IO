import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

public class Textanalyse {


    public static void main(String[] args) {







    }

    public static HashMap<Character, Integer> anzahljeZeichen(File f){
        HashMap<Character, Integer> hilf = new HashMap<>();
        FileInputStream fis = null;
        try {

           fis = new FileInputStream(f);
            int bytestream;
            while((bytestream=fis.read())==-1){
                if(hilf.containsKey((char)fis.read())){
                    int temp = hilf.get((char)fis.read()) +1;
                    hilf.put((char)fis.read(), temp);
                }
                else hilf.put((char)fis.read(), 1);


            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException io){
            io.printStackTrace();

        }
        finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return hilf;

    }


}
