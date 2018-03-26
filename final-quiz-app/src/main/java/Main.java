import java.io.*;
import java.util.ArrayList;
import java.util.List;
/*
@author Tudor Patrutiu
 */
public class Main {
    private static final String FILE_NAME = "src/main/resources/packages.csv";

    public static void main(String[] args) {

        Delivery dl = new Delivery();
        Thread t1 = new Thread(dl);
        t1.start();

    /*
    Created a reader for getting the data from .csv file
     */
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;

        try {
            fileReader = new FileReader (FILE_NAME);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine())!= null){
                List lines = new ArrayList(); //putting the data read into a List
                lines.add(line);
                System.out.println(lines);
            }
        }catch (IOException e){
            System.out.println("error in reading the file");
            e.printStackTrace();
        }finally {
            try {
                if (bufferedReader != null) //closing the buffer
                    bufferedReader.close();
                if (fileReader != null)
                    fileReader.close();
            }catch (IOException ex){
                System.out.println("error in closing the reader");
                ex.printStackTrace();
            }

        }

    }

}
