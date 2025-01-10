package ornekler3_For_While_Ifelse_StringManipulation;

import java.util.Scanner;

public class Q10_KelimeBulma {

    /*10-----
    Kullanıcıdan alınan String kümesi içerisinde aranan String i bulan Java Kodunu yazınız.

    Test Data:
    Java is easy

    Aranan String: is

    Bektenen Çıktı:
    True

    Aranan String: and

    Beklenen Çıktı:False

    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir cümle yazınız:");
        String cumle = scan.nextLine();
        System.out.print("Aranacak kelimeyi girin:");
        String aranacakKelime = scan.nextLine();

        KelimeBulma(cumle,aranacakKelime);

    }

    public static void KelimeBulma(String cumle, String arananKelime){

        if (cumle.contains(arananKelime)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
