import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Data {

    static String streamUntreated = "";

    public static String readDataFromFile(String path) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(path));

        String line = br.readLine();

        while(line != null){
            //System.out.print(line);
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

        Card neueKarte = new Card();
        neueKarte.setFront();
        neueKarte.setBack();

    }



}
