import javax.xml.crypto.Data;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        DataImporter importer = new DataImporter("Data/Test.txt");
        Card card = new Card();

        importer.readDataFromFile();
        System.out.println(importer.toString());

        System.out.println(card.createMainCard());




    }


}
