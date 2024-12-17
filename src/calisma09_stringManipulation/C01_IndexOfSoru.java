package calisma09_stringManipulation;

import java.util.Scanner;

public class C01_IndexOfSoru {

    public static void main(String[] args) {
    /*
      Kullanicidan bir String ve aranacak metin alin. Aranan metnin String icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini yazdirin
       -String aranan metni icermiyor
        -Aranan metin String’de sadece 1 kere kullanilmis
        -Aranan metin String’de sadece 1’den fazla kullanilmis
    */

        Scanner input = new Scanner(System.in);

        System.out.print("Arama yapılacak metni girin:");
        String anametin = input.nextLine();

        System.out.print("Aranacak kelime veya metni girin:");
        String aranacakMetin = input.nextLine();

        //anaMetin = "javayi çok sevdik, hem de çok çok sevdik."
        //aranacakMetin = "java"

        int ilkKullanimIndexi = anametin.indexOf(aranacakMetin);
        System.out.println(ilkKullanimIndexi);
        int sonKullanimIndexi = anametin.lastIndexOf(aranacakMetin);
        System.out.println(sonKullanimIndexi);

        if (ilkKullanimIndexi == -1){
            System.out.println("Ana metin aranacak metni içermiyor.");
        }
        else if (ilkKullanimIndexi == sonKullanimIndexi) {
            System.out.println("Ana metinde, aranacak metin sadece 1 kere kullanılmış.");
        }
        else {
            System.out.println("Ana metinde, aranacak kelime birden fazla kullanılmıştır.");
        }

    }
}
