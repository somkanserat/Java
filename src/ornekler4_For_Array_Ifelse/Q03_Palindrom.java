package ornekler4_For_Array_Ifelse;

import java.util.Scanner;

public class Q03_Palindrom {

    /*13----
        Bir palindrom, madam veya racecar veya 10801 sayısı gibi
        ileriye doğru geriye doğru okuyan bir kelime, sayı, kelime öbeği veya diğer karakter dizisidir.

        Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.

        Test Data:
        madam

        Beklenen Çıktı:
        True
    */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir kelime giriniz:");
        String kelime = scan.next();
        String tersKelime = "";

        for (int i=kelime.length()-1; i>=0;i--){
            tersKelime += kelime.charAt(i);
        }

        System.out.println(kelime.contains(tersKelime));

        /*
            if (kelime.equals("Kelimenin tersi: "+tersKelime)){
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
         */

    }
}
