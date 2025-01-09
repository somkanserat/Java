package ornekler2_StringManipulation;

import java.util.Scanner;

public class Q3_KisitliSayilarinToplami {

    public static void main(String[] args) {

        /*
            Q3 -Kullanıcıdan 5 adet sayı isteyiniz
            Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen 5 adet sayı değeri giriniz:");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();
        int sayi3 = input.nextInt();
        int sayi4 = input.nextInt();
        int sayi5 = input.nextInt();

        int genelToplam = 0;

        if (!(sayi1 >= 5 && sayi1 <= 10)) {
            genelToplam += sayi1;
        }
        if (!(sayi2 >= 5 && sayi2 <= 10)) {
            genelToplam += sayi2;
        }
        if (!(sayi3 >= 5 && sayi3 <= 10)) {
            genelToplam += sayi3;
        }
        if (!(sayi4 >= 5 && sayi4 <= 10)) {
            genelToplam += sayi4;
        }
        if (!(sayi5 >= 5 && sayi5 <= 10)) {
            genelToplam += sayi5;
        }
        System.out.println("5 ve 10 arasında olmayan sayıların toplamı:"+genelToplam);

        /*
        KISA YOL
            int i = 0;
            int toplam=0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Bir sayı giriniz: ");
            int number = scanner.nextInt();
            if (number < 5 || number > 10) {
                toplam += number;
            }


         */


    }
}
