import java.io.BufferedReader;
import java.io.Console;
import java.io.FileReader;
import java.io.IOException;

/***
 * Common utilities and functionalities for handling the specific project data
 */

public class DataImporter {

    String stream = "";
    String filePath;

    BufferedReader br;

    public DataImporter(String filePath) {
        this.filePath = filePath;
    }

    public String readDataFromFile(String filePath) {

        try {
            br = new BufferedReader(new FileReader(filePath));
            String line = br.readLine();

            while (line != null) {
                this.stream += line;
                line = br.readLine();
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return this.stream;

    }

    public String getData(){
        return this.stream;
    }

}
