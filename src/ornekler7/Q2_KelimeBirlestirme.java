package ornekler7;

import java.util.Scanner;

public class Q2_KelimeBirlestirme {

    /*42----
    İki farklı kelimeyi birleştirip, ilk harfini büyük kalan harfleri
    küçük yapan bir method yazınız.

    Örnekler
    getKelime("kal", "em") ? "Kalem"
    getWord("gözl", "emlemek") ? "Gözlemlemek"
    getWord("zor", "luk") ? "Zorluk"
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String kelime1 = null;
        String kelime2 = null;
        try {

            System.out.print("Bir kelime giriniz:");
            kelime1 = scan.nextLine();
            System.out.print("Bir kelime daha giriniz:");
            kelime2 = scan.nextLine();
        } catch (Exception e) {
            System.out.println("Yanlış değer girdiniz.");
        }

        String yeniKelime = "";

        yeniKelime+=kelime1.substring(0,1).toUpperCase()+kelime1.substring(1)+kelime2;
        System.out.println("Birleştirilen Kelime:"+yeniKelime);
    }
}
