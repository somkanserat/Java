package ornekler6_MetotOlusturma;

import java.util.Scanner;

public class Q1_SaatiSaniyeyeCevirme {

    /*31----
    Saati saniyeye çeviren java methodunu yazınız.

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Saniyeye çevirilecek saati girin:");
        double time = scan.nextDouble();
        howManySeconds(time);

    }

    public static void howManySeconds(double time){

        double saniye;
        saniye = time*60*60;
        System.out.println(saniye);
    }
}
