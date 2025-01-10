package ornekler3_For_While_Ifelse_StringManipulation;

import java.util.Scanner;

public class Q8_TerstenYazma {

     /*8----
     Girilen String değerde tersten yazan Java kodunu yazınız.

    Test Data:
    java
    avaj
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir metin giriniz:");
        String metin = scan.nextLine();

        String yeniMetin="";

        for (int i=metin.length()-1; i>=0;i--){
            yeniMetin+=metin.charAt(i);
        }
        System.out.println(yeniMetin);
    }
}
