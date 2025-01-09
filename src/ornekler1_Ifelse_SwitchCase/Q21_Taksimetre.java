package ornekler1_Ifelse_SwitchCase;

import java.util.Scanner;

public class Q21_Taksimetre {
    /*
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Gidilen km'yi giriniz:");
        float km = scan.nextFloat();

        float tutar = (10 + (km*2.20f));

        if (km >0 && tutar<20){
            tutar =20;
            System.out.print("Ödenecek tutar:"+tutar);
        }
        else if(km >0 && tutar>=20) {
            System.out.println("Ödenecek tutar:"+tutar);
        }
        else {
            System.out.println("Yanlış değer girdiniz.");
        }
    }
}
