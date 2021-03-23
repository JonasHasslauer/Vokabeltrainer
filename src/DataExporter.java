import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class DataExporter {

    /**
     * //TODO funkioniert noch nicht richtig, da immer nur die letze Karte ausgegeben wird
     *
     * @param card Text of the whole card
     * @param filePath
     * @throws IOException
     */
    public void exportDataToFile(Card card, String filePath) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));

        try {
            File file = new File(filePath);
            if (!file.exists()) {
                file.createNewFile();
            }

            bw.write(card.toString());
            bw.close();

        }catch(IOException e) {
            e.printStackTrace();

        }

    }
}
