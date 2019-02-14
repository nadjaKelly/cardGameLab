public class Player {

    Card card;

    public Player(){
        this.card = null;
    }

    public void receiveCard(Card dealtCard){
        this.card = dealtCard;
    }
}
