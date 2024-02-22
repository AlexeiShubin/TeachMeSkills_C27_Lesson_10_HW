package task1.creditCard;

/*
class "credit card" with data parameters and object CreditCard
 */
public class CreditCard {

    public short CVV_code;
    public double balance;
    public int numberOfCard;

    public CreditCard(short CVV_code, double balance, int numberOfCard){
        this.CVV_code=CVV_code;
        this.numberOfCard=numberOfCard;
        this.balance=balance;
    }
}
