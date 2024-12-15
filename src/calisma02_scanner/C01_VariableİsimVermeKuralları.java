package calisma02_scanner;

public class C01_VariableİsimVermeKuralları {

    public static void main(String[] args) {

        //kural 1: deklarasyon 1 kere olur ama istediğiniz kadar deger ataması yapabilirsiniz.

        int sayi = 10;

        int not;

        not = 90;

        //double not = 56.7; //Variable 'not'  is already defined in the Scope

        //Kural 2: Java'da variable isimleri kucuk harfle baslar ama buyuk harf kullanılsa da Java itiraz etmez
        //Onemli: Java case sensitive'dir. Yani kucuk buyuk harfe duyarlıdır.

        int nOT = 56;
        int noT = 45;
        int Not = 23;
        System.out.println(not); //90
        System.out.println(Not); //23

        int not_ = 23;
        int no$t = 74;

        //int no&t = 65; //java isimde _ ve $ dısında ozel karaktere izin vermez

        //int 2not = 32; isim sayı ile baslamaz.

        //int int =58; //isim olarak keywordler kullanılamaz.
        //int class = 60;

        //slayttaki kural 5

        char ismin_ilk_harfi = 'a';

        char isminIlkHarfi = 'a';

        double sinifinYasOrtalamasi = 12.4;


    }

}
