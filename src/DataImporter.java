import java.io.BufferedReader;
import java.io.Console;
import java.io.FileReader;
import java.io.IOException;

/***
 * Common utilities and functionalities for handling the specific project data
 */

public class DataImporter {

    String streamUntreated;
    String streamTreated;
    String filePath;

    BufferedReader br;

    public DataImporter(String filePath) {
        this.filePath = filePath;
    }

    public void readDataFromFile() {

        try {
            br = new BufferedReader(new FileReader(filePath));
            String line = br.readLine();

            while (line != null) {
                this.streamUntreated += line;
                line = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @Override
    public String toString(){
        return this.streamUntreated;
    }

}
