import java.io.IOException;

public class Main {

    public static void main(String[] args){

        try{
            Data.readDataFromFile("Daten/Test.txt");
        }catch (IOException e){
            e.printStackTrace();
        }



    }


}