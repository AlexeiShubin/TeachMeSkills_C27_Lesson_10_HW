package task1.client;

/*
class "client" with data parameters and object Client
 */
import task1.creditCard.CreditCard;

public class Client {

    public String name;
    public byte numberOfCard;
    public CreditCard[]cards;

    public Client(byte numberOfCard){
        this.name="Ivan";
        this.numberOfCard=numberOfCard;
        cards=new CreditCard[numberOfCard];
        for(int i=0; i<cards.length; i++){
            cards[i]=new CreditCard((short) 0, 0, 0);
        }
    }
}
