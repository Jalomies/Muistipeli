import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random arpoja = new Random();
        int arvotutNumerot [] = new int [7];
        int arvottuNumero = 0;
        String kayttajaSyote = "";
        int syotetytNumerot [] = new int [7];
        int syotettyNumero = 0;
        int oikeinMaara = 0;


       for (int i = 0; i < arvotutNumerot.length; i++) {
        arvottuNumero = arpoja.nextInt(1,6);
        arvotutNumerot[i] = arvottuNumero;
       }

       System.out.println("Yritä muistaa alla olevat numerot. Näet numerot 3 sekunnin ajan.");
       for (int i = 0; i < arvotutNumerot.length; i++) {
        System.out.print(arvotutNumerot[i]+" ");
       }

       try {
         Thread.sleep(3000); 
         } catch(InterruptedException ex) {
             Thread.currentThread().interrupt();
            }

        for (int i = 0; i < 20; ++i) System.out.println();


       for (int i = 0; i < arvotutNumerot.length; i++) {
        System.out.println("\nSyötä "+(i+1)+". numero");
        kayttajaSyote = in.nextLine();
        syotettyNumero = Integer.parseInt(kayttajaSyote);
        syotetytNumerot[i] = syotettyNumero;

            if (arvotutNumerot[i] == syotettyNumero) {
                oikeinMaara ++;

            }

       }
       System.out.println("Oikeat numerot olivat:");
       for (int i = 0; i < arvotutNumerot.length; i++) {
        System.out.print(" "+arvotutNumerot[i]);
       }

       System.out.println("\nSinun numerosi olivat:");
        for (int i = 0; i < syotetytNumerot.length; i++) {
        System.out.print(" "+syotetytNumerot[i]);
       }

       System.out.println("\nSait "+oikeinMaara+"/"+syotetytNumerot.length+" oikein.");







    }
}

