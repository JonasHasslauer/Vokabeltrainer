public class Card {

    int number; //fortlaufend
    String front;
    String back;
    String progress;
    Card currentCard;
    String difficulty;

    public Card(int number, String front, String back){
        this.number = number+1;
        this.front = front;
        this.back = back;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int nummer) {
        this.number = nummer;
    }

    public String getFront() {
        return front;
    }

    public void setFront(String front) {
        this.front = front;
    }

    public String getBack() {
        return back;
    }

    public void setBack(String back) {
        this.back = back;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void setCurrentCard(Card card){
        this.currentCard = card;
    }

    public Card getCurrentCard(){
        return this.currentCard;
    }

    @Override
    public String toString(){
        return
                "Number: " + this.number + "\n" +
                "Front: '" + this.front + "'\n" +
                "Back: '" + this.back + "'\n" +
                "Progress: " + this.progress + "\n" +
                "Difficulty: " + this.difficulty + "\n";

    }




}
