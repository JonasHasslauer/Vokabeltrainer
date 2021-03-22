public class Card {

    int number; //fortlaufend
    String front;
    String back;
    String progress;
    Card currentCard;

    public Card(String front, String back){
        this.front = front;
        this.back = back;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int nummer) {
        this.number = nummer;
    }

    String difficulty;

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




}
