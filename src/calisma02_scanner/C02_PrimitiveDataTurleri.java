package calisma02_scanner;

public class C02_PrimitiveDataTurleri {

    public static void main(String[] args) {

        boolean gozlukluMu = true;
        boolean emekliMi = false;
        boolean saliMi = true;

        //boolean evliMi = 'false'; //too many characters in character literal

        char chr1 = 'a';
        char chr2 = '5';
        char chr3 = '#';
        //char chr4 = "y";
        char chr5 = ' '; //boşluk dabir karakterdir.
        //char chr6 = 'ab'; //to many characters in character literal(string kullanılır)


        //Lisedeki öğrencilerin yaslarini tutan bir variable dusunelim

        byte yas1 = 17;    // hafızada 8 bit yer kaplarken
        short yas2 = 15;   // hafızada 16 bit yer kaplarken
        int yas3 = 16;     // hafızada 32 bit yer kaplarken
        long yas4 = 15;     // hafızada 64 bit yer kaplarken

        //primitive data turleri barindirdiklari degere göre degil, data turune gore hafızada yer kaplarlar.

        int sayi1 = 1;     //hafızada 32 bit yer kaplar.
        int sayi2 = 100;     //hafızada 32 bit yer kaplar.
        int sayi3 = 10000;     //hafızada 32 bit yer kaplar.
        int sayi4 = 100000000;   //hafızada 32 bit yer kaplar.

        //Ondalikli sayi tutan primitive

        double sayi6 = 24.8;
        float sayi7 = 32.7f;
        float sayi8 = 87.8F;

        float flt1 = 20f;
        float flt2 = 6f;

        System.out.println(flt1 / flt2);

        double dbl1 = 20;
        double dbl2 = 6;
        System.out.println(dbl1 / dbl2);

        //UYARI: double sayilari ustel olarak tuttugu icin, virgülden sonra ilerleyen basamaklarda hata olabilir.

    }
}
