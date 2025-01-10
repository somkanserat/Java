package ornekler4_For_Array_Ifelse;

import java.util.Scanner;

public class Q4_IstenenHarf {

    /*15----
        Grilen String değer içinde istenen sıradaki karakteri bulan Java kodunu yazınız.

        Test Data:
        Java is fun


        Beklenen Çıktı
        0. pozisyondaki karakter : J

        5. pozisyondaki karakter : i
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Cümle giriniz:");
        String cumle = scan.nextLine();

        System.out.println("0.pozisyondaki karakter: "+cumle.charAt(0));
        System.out.println("5.pozisyondaki karakter: "+cumle.charAt(5));


    }

}
