package ornekler3_For_While_Ifelse_StringManipulation;

import java.util.Scanner;

public class Q9_StringBirlestirme {

    /*9----
    2 farklı String'i  ucuca ekleyen Java Kodunu yazınız.

    Test Data:
    str1: Java is
    str2: fun

    Beklenen Çıktı:
    java is fun

    */

    public static void main(String[] args) {

        String metin1 = "Java is";
        String metin2 = "fun";

        System.out.println(metin1.concat(" "+metin2));

        Scanner scan = new Scanner(System.in);

        System.out.println("1. metin değerini giriniz:");
        String mtn1 = scan.nextLine();
        System.out.println("2. metin değerini giriniz:");
        String mtn2 = scan.nextLine();

        birlestirme(mtn1,mtn2);

    }

    public static void birlestirme(String mtn1, String mtn2){


        System.out.println("1. ve 2. metinin birleştirilmesi: "+mtn1.concat(" "+mtn2));
    }
}
