package ornekler7;

import java.util.Scanner;

public class Q4_TekrarEdenHarfSatisi {

    /*44----
    String içindeki birden fazla geçen karakter sayısını bulan program yazınız.
     Mesela "Merhaba" kelimesinde sadece a harfi tekrar ettiği için
     bu String için sonuç 1 olacak.
     Eğer herhangi tekrar eden bir harf yoksa 0 sayısını döndersin program.

    Örnekler:
    duplicates("Hello World!")
    Çıktı : 2
    duplicates("foobar")
    Çıktı : 1
    duplicates("helicopter")
    Çıktı : 1
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir cümle girin:");
        String cumle = scan.nextLine();

        cumle=cumle.replaceAll(" ",""); //boşlıkların hepsini sildik.
        String yeniCumle = "";

        int sayac=0;

        for (int i=0; i<cumle.length();i++){

            if (yeniCumle.contains(cumle.substring(i,i+1))){
                sayac++;
            }
            yeniCumle+=cumle.charAt(i);
        }

        System.out.println("Tekrar eden harf sayısı:"+sayac);
    }
}
