package calisma05_ifElseStatements;

import java.util.Scanner;

public class C14_ElseIleBitmezse {

    public static void main(String[] args) {

        // Bir if, else if... cümlesinde kodun sonu else ile bitmezse, Java kod için hata vermez. ANCAK else ile
        // bitmeyen kodlarda  bazı değerşeri için sonuc üretmeyeceğini bilmemiz gerekir.

        // Kullanicidan pozitif bir tamsayi isteyin
        // sayi hem 3 hem 5 ile bolunuyorsa "super",
        // sayi sadece 3 ile bolunuyorsa "3'un kati"
        // sayi sadece 5 ile bolunuyorsa "5'in kati" yazdirin

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Pozitif Bir Tam Sayı Giriniz:");
        int sayi = input.nextInt();

        /*
        if (sayi % 3 == 0 && sayi % 5 == 0){
            System.out.println("Super");
        }

        else if (sayi % 3 == 0) {
            System.out.println("Sayı, 3'ün katıdır.");
        }

        else if (sayi % 5 == 0) {
            System.out.println("Sayı, 5'in katıdır.");
        }
        */


        /*

        // Eğer aynı sayıya farklı sonuçlar verilmesi mümkün olan bir kod yazıyorsak, önce en kısıtlayıcı olanı yazarız.
        //Aksi durumda diğerleri verilen değeri yakalayacağı için en dar olana hiçbir değer vermez.

        Ornegin 30 sayisi hem 3'e hem 5'e bolunur
                    asagidaki gibi once 3 veya 5'i kontrol edersek
                    onlar 30'u yakalar
                    ve 30 icin super yazdirma ihtimali kalmaz

        if (sayi % 3 == 0) {
            System.out.println("Sayı, 3'ün katıdır.");
        }

        else if (sayi % 5 == 0) {
            System.out.println("Sayı, 5'in katıdır.");
        }

        else if (sayi % 3 == 0 && sayi % 5 == 0){
            System.out.println("Super");
        }
        */

    }
}
