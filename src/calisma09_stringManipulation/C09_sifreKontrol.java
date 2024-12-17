package calisma09_stringManipulation;

import java.util.Scanner;

public class C09_sifreKontrol {

    public static void main(String[] args) {

        /*
        Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
                 eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
                    - ilk harf kucuk harf olmali
                    - son karakter rakam olmali
                    - sifre bosluk icermemeli
                    - uzunlugu en az 10 karakter olmali
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Şifrenizi Giriniz:");
        String sifre = input.nextLine();

        int sayac = 0;

        if (!Character.isLowerCase(sifre.charAt(0))){
            System.out.println("İlk harf, küçük harf olmalıdır.");
            sayac++;
        }

        if ( !Character.isDigit(sifre.charAt(sifre.length()-1) )){ //son index'i char olarak aldık ve sayı olup olmadığını sorduk
            System.out.println("Son karakter, rakam olmalıdır.");
            sayac++;
        }

        if (sifre.contains(" ")){
            System.out.println("Şifre boşluk içermemelidir.");
            sayac++;
        }

        if (!(sifre.length()>=10)){
            System.out.println("Şifrenin uzunluğu en az 10 karakter olmalıdır");
            sayac++;
        }

        //sayac 0-4 arası olabilir.
        //eğer 0'sa --> hata yok
        //eğer 4'se --> hepsi hatalı

        if (sayac == 0){
            System.out.println("Şifre başarıyla kaydedildi.");
        }
    }
}
