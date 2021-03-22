import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Data {

    String[] wordsEnglisch;
    String[] wordsDeutsch;

    public static void readDataFromFile(String path) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(path));

        String line = br.readLine();

        while(line != null){
            System.out.print(line + "\n");
            line = br.readLine();
        }
    }

    /**
     *Within the file the content looks like this:
     *
     * Englisch
     * Deutsch
     *
     * Englisch
     * Deutsch
     *
     * @param dataStream the read content from a file
     */

    public static void convertDataToArrays(String dataStream){

    }



}
