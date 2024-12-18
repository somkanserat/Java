package calisma11_NestedForLoop_MethoduOlusturma;

public class C15_SifreKontrol {

    public static void main(String[] args) {

        //Soru 4 : verilen sifre icin
        //         asagidaki sartlari kontrol edip
        //         kullaniciya duzeltmesi gereken tum eksikleri soyleyen,
        //         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdiran
        //         bir method olusturun
        //         - ilk harf kucuk harf olmali
        //         - son karakter rakam olmali
        //         - sifre bosluk icermemeli
        //         - uzunlugu en az 10 karakter olmali

        sifreDogruMuYazdir("Java iyi calisiyor.");
        //İlk harfi küçük harf olarak girmelisiniz!
        //Son harfi büyük harf olarak girmelisiniz!
        //Şifre, boşluk içermemelidir!

        sifreDogruMuYazdir("JavaYapmis");
        //İlk harfi küçük harf olarak girmelisiniz!
        //Son harfi büyük harf olarak girmelisiniz!
    }

    public static void sifreDogruMuYazdir(String sifre){

        int sayac=0;

        if ( ! Character.isLowerCase(sifre.charAt(0)) ){
            System.out.println("İlk harfi küçük harf olarak girmelisiniz!");
            sayac++;
        }
        if ( ! Character.isUpperCase(sifre.charAt(sifre.length()-1))){
            System.out.println("Son harfi büyük harf olarak girmelisiniz!");
            sayac++;
        }
        if (sifre.contains(" ")){
            System.out.println("Şifre, boşluk içermemelidir!");
            sayac++;
        }
        if (sifre.length()<10){
            System.out.println("Şifre karakter uzunluğu yeterli değildir!");
            sayac++;
        }
        if (sayac == 0){
            System.out.println("Şifre başarıyla kaydedildi.");
        }
    }



}
