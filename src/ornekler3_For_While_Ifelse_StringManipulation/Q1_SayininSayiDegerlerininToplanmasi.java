package ornekler3_For_While_Ifelse_StringManipulation;

import java.util.Scanner;

public class Q1_SayininSayiDegerlerininToplanmasi {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayı değeri giriniz:");
        int sayi = scan.nextInt();

        System.out.println("Basamak değerlerinin toplamı:"+BasToplami(sayi));

    }

    public static int BasToplami(int sayi){

        int toplam =0;

        while (sayi>0){

            toplam += sayi%10;
            sayi = sayi/10;
        }
        return toplam;
    }
}
