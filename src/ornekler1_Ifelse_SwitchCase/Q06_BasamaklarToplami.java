package ornekler1_Ifelse_SwitchCase;

import java.util.Scanner;

public class Q06_BasamaklarToplami {

    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz

        Scanner input = new Scanner(System.in);

        System.out.print("5 Basamaklı Bir Tam Sayı Giriniz:");
        int sayi = input.nextInt();

        int onbinler = (sayi/10000)%10;
        System.out.println(onbinler);

        int binler = (sayi/1000)%10;
        System.out.println(binler);

        int onlar = (sayi/10)%10;
        System.out.println(onlar);

        int birler = sayi%10;
        System.out.println(birler);

        System.out.println("Sayıların Toplamı:"+(onbinler+binler+onlar+binler));
    }
}
