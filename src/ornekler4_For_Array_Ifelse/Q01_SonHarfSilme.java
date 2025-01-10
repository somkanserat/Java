package ornekler4_For_Array_Ifelse;

import java.util.Scanner;

public class Q01_SonHarfSilme {


    /*11----
    Kullanıcıdan alınan Stringin son karakteirini silip ekrana yazan Java kodunu yazınız.

    Test Data:
    good

    Beklenen Çıktı:
    goo
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir kelime girin:");
        String kelime = scan.next();

        System.out.println(kelime.substring(0,kelime.length()-1));


    }
}
