import java.io.*;

public class DateiKopieren {

    public static void main(String[] args) {

        File f  = new File("C:\\Users\\CRIS\\Desktop\\sub-ordner\\dokumente\\lorem-ipsum.txt");
        File k = new File("C:\\Users\\CRIS\\Desktop\\sub-ordner\\dokumente\\Kopiere.txt");

        FileOutputStream fos= null;
        FileInputStream fis = null;

       try {
            fis = new FileInputStream(f);
            fos = new FileOutputStream(k);

           int bytestream;
           while((bytestream = fis.read())!= -1){
               fos.write(bytestream);


           }



       }


       catch (IOException e){
           e.printStackTrace();
       }
       finally {
         try{  fos.flush();
           fos.close();
           fis.close();}


         catch (Exception e){
             e.printStackTrace();
         }

       }



    }






}
