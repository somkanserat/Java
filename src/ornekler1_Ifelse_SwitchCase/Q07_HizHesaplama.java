package ornekler1_Ifelse_SwitchCase;

import java.util.Scanner;

public class Q07_HizHesaplama {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.

        System.out.print("Gidilecek mesafeyi km cinsinden giriniz:");
        int km = input.nextInt();
        System.out.print("Hız değerini giriniz:");
        int hiz = input.nextInt();

        float sure = (float) km / hiz;
        System.out.println("Süre:" +sure +" saat");
    }
}
