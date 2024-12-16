package calisma06_nestedIfElseStatements_ternary;

import java.util.Scanner;

public class C06_NestedIfElse_Indirim2 {

    public static void main(String[] args) {

        // Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin, kullaniciya musteri karti olup olmadigini
        // sorun.Musteri karti varsa 10 urunden fazla alirsa %20, az alirsa %15 indirim yapin, Musteri karti yoksa
        // 10 urunden fazla alirsa %15, az alirsa %10 indirim yapin

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Aldığınız Ürün Adedini Giriniz:");
        int urunAdedi = input.nextInt();

        System.out.print("Lütfen Ürünün İndirimsiz Fiyatını Giriniz:");
        double urunFiyati = input.nextDouble();

        double indirimsizToplamFiyat = urunAdedi * urunFiyati;

        System.out.println("Müşterinin Kartı Var Mı? E:Evet H:Hayır");
        char kartVarMi = input.next().toUpperCase().charAt(0); //küçük harf girilse bile, toUpperCase komutu ile büyük harf yapılır.

        //Temel Değişken urunAdedi olsun

        if(urunAdedi<=0){
            System.out.println("Ürün adedi girişi yanlıştır.");
        }

        else if (urunAdedi<=10) {
            //0-10 urun alanlar için karta göre degerlendirme yapabiliriz.
            if (kartVarMi == 'E'){
                System.out.println("%15 indirimli toplam fiyat:" + indirimsizToplamFiyat * 85 / 100);
            }

            else if (kartVarMi == 'H') {
                System.out.println("%10 indirimli toplam fiyat:" + indirimsizToplamFiyat * 90 / 100);
            }
            else {
                System.out.println("Kart bilgisi için E veya H seçilmelidir...");
            }
        }

        else {
            //10'dan fazla ürün alanlar için karta göre degerlendirme yapabiliriz.

            if (kartVarMi == 'E'){
                System.out.println("%20 indirimli toplam fiyat:" + indirimsizToplamFiyat * 80 / 100);
            }

            else if (kartVarMi == 'H') {
                System.out.println("%15 indirimli toplam fiyat:" + indirimsizToplamFiyat * 85 / 100);
            }
            else {
                System.out.println("Kart bilgisi için E veya H seçilmelidir...");
            }
        }
    }
}
