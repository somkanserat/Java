package ornekler5_Array;

import java.util.Scanner;

public class Q10_BinarySayiToplama {

    /*30---
        Kullanıcının gireceği iki binary sayıyı toplayan  Java kodunu yazınız.

        Test Data:
        birinci binary number: 100010
        ikinci  binary number: 110010

        Beklenen Çıktı:
        1010100
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("İki adet binary sayı giriniz:");
        int binary1 = scan.nextInt();
        int binary2 = scan.nextInt();

        long toplam = binary1+binary2;

        String basamakSayisi = toplam+"";

        String tersYeniSayi="";
        String yeniSayi="";


        while (toplam>0){

            if (toplam%10 == 0){
                tersYeniSayi +="0";
                toplam = toplam/10;
            }
            else if (toplam%10 == 1) {
                tersYeniSayi+="1";
                toplam = toplam/10;
            }
            else if (toplam%10 == 2){
                tersYeniSayi+="0";
                toplam = toplam/10;
                toplam+=1;
            }
        }

        for (int i=tersYeniSayi.length()-1; i>=0;i--){
            yeniSayi+=tersYeniSayi.charAt(i);
        }
        System.out.println(yeniSayi);
    }
}
