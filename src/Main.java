public class Main {

    public static void main(String[] args) {

        DataImporter importer = new DataImporter("Data/Test.txt");

        importer.readDataFromFile();

        String[] dataSplitted = importer.getData().split(";");

        /*
        Prints all Cards and deleting whitespaces while creating Card objects
         */

        int cardNumber = 0;
        for(int i = 1; i < dataSplitted.length; i++){
            System.out.println(new Card(cardNumber, dataSplitted[i-1].strip(), dataSplitted[i].strip()));
            cardNumber++;
            i++;
        }


    }


}
