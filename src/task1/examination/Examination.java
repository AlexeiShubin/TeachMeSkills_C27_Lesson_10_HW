package task1.examination;

/*
class with verification methods CVV, Number
 */
import task1.creditCard.CreditCard;

import java.util.Scanner;

public class Examination {

    public static void checkCVV(CreditCard card){
        Scanner scanner=new Scanner(System.in);
        while(card.CVV_code<100||card.CVV_code>999){
            System.out.print("Введите верный CVV код: ");
            card.CVV_code= scanner.nextShort();
        }
    }

    public static void checkNumberOfCard(CreditCard card){
        Scanner scanner=new Scanner(System.in);
        while(card.numberOfCard<100||card.numberOfCard>999){
            System.out.print("Введите верный номер карты: ");
            card.numberOfCard= scanner.nextShort();
        }
    }

    public static boolean checkNumberOfCard(byte numberOfCard){
        if(numberOfCard==0){
            System.out.println("нет карт");
            return false;
        }
        return true;
    }
}
