import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        final String filePathInput = "Data/Test.txt";
        final String filePathOutput = "Data/TestOutput.txt";

        DataImporter importer = new DataImporter(filePathInput);
        DataExporter exporter = new DataExporter();

        importer.readDataFromFile(filePathInput);

        String[] dataSplitted = importer.getData().split(";");

        /***
         * This method is for the initial creation of the cards from the two-word pairs from the input file
         */

        int cardNumber = 0;
        for(int i = 1; i < dataSplitted.length; i+=2){
            Card k = new Card(cardNumber, dataSplitted[i-1].strip(), dataSplitted[i].strip());
            System.out.println(k.toString());

            cardNumber++;
        }

    }


}
