package task1.runner;
/*
class with data filling methods
 */
import task1.client.Client;
import task1.examination.Examination;

import java.util.Random;
import java.util.Scanner;

public class Enter {

    public static void enterCVV(Client client){
        Scanner scanner=new Scanner(System.in);
        for(byte i=0; i<client.cards.length; i++){
            System.out.print("Введите СVV карты номер "+(i+1) +": ");
            client.cards[i].CVV_code= scanner.nextShort();
            Examination.checkCVV(client.cards[i]);
        }
    }

    public static void enterNumberOfCard(Client client){
        Scanner scanner=new Scanner(System.in);
        for(byte i=0; i< client.cards.length; i++){
            System.out.print("Введите номер карты "+(i+1)+": ");
            client.cards[i].numberOfCard=scanner.nextInt();
            Examination.checkNumberOfCard(client.cards[i]);
        }
    }

    public static void enterBalance(Client client){
        Random random=new Random();
        for(byte i=0; i<client.cards.length; i++){
            client.cards[i].balance= random.nextInt(0, 10000);
        }
    }
}
