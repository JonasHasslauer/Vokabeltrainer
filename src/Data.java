import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/***
 * Common utilities and functionalities for handling the specific project data
 */

public class Data {

    private static String streamUntreated;

    public static String readDataFromFile(String path) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(path));

        String line = br.readLine();

        while(line != null){
            streamUntreated += line;
            line = br.readLine();
        }

        return streamUntreated;
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

    public static void convertData(String dataStream, int line){

        //TODO

    }

    public static void split2Lines(String construct){



    }



}
