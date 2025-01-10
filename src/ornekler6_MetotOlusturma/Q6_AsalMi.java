package ornekler6_MetotOlusturma;

import java.util.Scanner;

public class Q6_AsalMi {

    /*-----
        Bir sayı asal olduğunda true, aksi halde false çıktısı return eden bir Java Methodu yazınız.

        Test Data:
        isPrime(31)
        true

        isPrime(18)
        false
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Asallığını kontrol etmek için bir sayı giriniz:");
        int sayi = scan.nextInt();

        System.out.println(asalMi(sayi));

    }

    public static String asalMi(int sayi){
        String kontrol = "";

        if (sayi==2){
            kontrol+="true";
        }

        else {
            for (int i=2;i<=sayi; i++){

                if (sayi%i==0){
                    kontrol+="false";
                    break;
                }

                else {
                    kontrol+="true";
                    break;
                }
            }
        }
        return kontrol;
    }
}
