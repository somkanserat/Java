package ornekler3_For_While_Ifelse_StringManipulation;

import java.util.Scanner;

public class Q3_1den10aKadarCarpim {

    public static void main(String[] args) {

        /*3----
            Belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.

            Örnek Sonuç:
            5 x 1 = 5
            5 x 2 = 10
            5 x 3 = 15
            5 x 4 = 20
            5 x 5 = 25
            5 x 6 = 30
            5 x 7 = 35
            5 x 8 = 40
            5 x 9 = 45
            5 x 10 = 50
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("1'den 10'a kadar çarpılmasını istediğiniz sayıyı giriniz:");
        int sayi = scan.nextInt();

        int sonuc = 1;
        for (int i=1;i<=10;i++){

            sonuc = sayi*i;
            System.out.println(sayi +" x " +i +" = "+sonuc);
        }
    }
}
