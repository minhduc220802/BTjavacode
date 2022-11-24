/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardtestdrive;
import java.util.ArrayList;
import java.util.*;
class Card{
    private String quanbai = "At,2,3,4,5,6,7,8,9,10,J,Q,K";
    private String chatbai = "Co,Ro,Bich,Tep";
    public String getQuanbai(){
        return quanbai;
    }
    public void setQuanbai(String quanbai){
        this.quanbai = quanbai;
    }
    public String getChatbai(){
        return chatbai;
    }
    public void setChatbai(String chatbai){
        this.chatbai = chatbai;
    }
}
class CardSet{
    private static final String[] quanbai = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" }; // 2->A
    private static final String[] chatbai = { " Co", " Ro", " Bich", " Tep" };
    private List<Card> CardSet = new ArrayList<Card>();
    public CardSet(){
        this.createCardSet();
    }
    public List<Card> getCardSet() {
        return CardSet;
    }
    public void setCardSet(List<Card> playingCards) {
        this.CardSet = playingCards;
    }
    public void createCardSet() {
        Card c;
        for (int j = 0; j < quanbai.length; j++) {
            for (int k = 0; k < chatbai.length; k++) {
                c = new Card();
                c.setQuanbai(quanbai[j]);
		c.setChatbai(chatbai[k]);
                CardSet.add(c);
            }
        }
    }

	public void shuffleCardSet(int time){
		for(int i =0;i<time;i++) {
			Collections.shuffle(this.getCardSet());
		}
	}
}

public class CardTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CardSet Ca = new CardSet();
        Ca.shuffleCardSet(1);
        for (int i = 0; i < Ca.getCardSet().size(); i++) {
            System.out.print(Ca.getCardSet().get(i).getQuanbai());
            System.out.println(Ca.getCardSet().get(i).getChatbai());
		}
    }
}
