package calismam_MarketProjesi;

import java.time.LocalDateTime;
import java.util.Scanner;

public class SomkanMarket {
    static Scanner scan=new Scanner(System.in);
    static int urunKodu;
    static int urunFiyati;
    static int urunAdedi;
    static int urunKg;
    static String urunAdi;
    static double toplam;
    static boolean ekUrun;
    static String sepet="";
    static int subeSecimi;
    static String sube="";



/*
   ====================PROJEMIZ===================================
 ilk programa girildiginde bizi bir menu karsilasin bu secenekler
   1 ŞARKÜTERİ ÜRÜNLERİ
   2 MANAV ÜRÜNLERİ
   3 MARKET ÜRÜNLERİ
   secime göre;
   4-urunleri listele ve
   5-fiyatlari gelsin
   6-Alışveriş bitince fiş yazdırsın.
   7- Fiş yazdırdıktan sonra da çıkış yapılsın.
*/
public static void main(String[] args) {
    System.out.println("       SOMKAN MARKETE HOŞGELDİNİZ.");
    adres();
    girisEkrani();
}


public static void adres(){

    System.out.println("Hangi şehirde olduğunuzu giriniz.");
    System.out.println("1:İstanbul\n2:Ankara\n3:İzmir\nSeçiminiz:");
    subeSecimi= scan.nextInt();
    switch (subeSecimi){

        case 1:
            sube+="               İstanbul";
            break;
        case 2:
            sube+="               Ankara";
            break;
        case 3:
            sube+="               İzmir";
            break;
        default:
            System.out.println("Yanlış seçim yaptınız. Sadecebu illerimizde şubelerimiz mevcuttur.");
            adres();
    }

}


    public static void girisEkrani(){
        System.out.println("============= WISE MARKET ===========");
        System.out.println("              Hoş geldiniz           ");
        System.out.println(sube);
        System.out.println();

        System.out.println("------ Menü -------");
        System.out.println("1-Şarküteri Reyonu\n2-Manav Reyonu\n3-Market Reyonu\n4-Fiş yazdır\n5-Çıkış");
        System.out.print("Lütfen İşlem Seçimi Yapınız.\nSeçiminiz:");
        int secim=scan.nextInt();
        if (secim>=1 && secim<=5){
            switch (secim){
                case 1: sarkuteri(); break;
                case 2: manav(); break;
                case 3: market(); break;
                case 4: fisYazdir(); break;
                case 5: cikis(); break;
            }

            }else{
            System.out.println("Geçersiz bir seçim yaptınız");
            girisEkrani();
        }


    }

    public static void sarkuteri(){
        System.out.println("\n====== Şarküteri Reyonuna Hoşgeldiniz ======");
        System.out.println("********  Ürün Listesi    ********");
        System.out.println("101-Peynir --> 200₺\n102-Kaymak --> 150₺\n103-Sucuk --> 300₺\n104-Pastırma --> 250₺\n105-Kavurma --> 275₺");

        System.out.print("Satın almak istediğiniz ürün kodunu giriniz.\nSeçiminiz:");
        while (!ekUrun){
            urunKodu= scan.nextInt();
            if (urunKodu>=101 && urunKodu<=105){
                System.out.print("Almak istediğiniz paket adedini giriniz:");
                urunAdedi= scan.nextInt();
                switch (urunKodu){
                    case 101: urunAdi="Peynir";
                        urunFiyati=200;
                        System.out.println(urunAdedi+" paket "+urunAdi+" fiyatı:"+(urunFiyati*urunAdedi)+"₺");
                        break;

                    case 102: urunAdi="Kaymak";
                        urunFiyati=150;
                        System.out.println(urunAdedi+" paket "+urunAdi+" fiyatı:"+(urunFiyati*urunAdedi)+"₺");
                        break;

                    case 103: urunAdi="Sucuk";
                        urunFiyati=300;
                        System.out.println(urunAdedi+" paket "+urunAdi+" fiyatı:"+(urunFiyati*urunAdedi)+"₺");
                        break;

                    case 104: urunAdi="Pastırma";
                        urunFiyati=250;
                        System.out.println(urunAdedi+" paket "+urunAdi+" fiyatı:"+(urunFiyati*urunAdedi)+"₺");
                        break;

                    case 105: urunAdi="Kavurma";
                        urunFiyati=275;
                        System.out.println(urunAdedi+" paket"+urunAdi+" fiyatı:"+(urunFiyati*urunAdedi)+"₺");
                        break;
                /*
                default:
                    System.out.println("Geçersiz giriş. Yeniden deneyin.");
                    sarkuteri();

                 */
                }
                urunFiyati=urunAdedi*urunFiyati;
                toplam+=urunFiyati;
                System.out.println("*Toplam Tutar:"+toplam+"₺*");
                sepet+=urunAdi+"="+urunFiyati+"₺ & ";
                System.out.println("-Başka ürün almak için ürün kodunu giriniz veya Ana Menüye dönmek için 0 tuşuna basınız.");
                System.out.print("Seçiminiz:");
            }

            else if (urunKodu==0){
                girisEkrani();
            }

            else {
                sarkuteri();
            }
        }
        //girisEkrani();
    }

    public static void manav(){
        System.out.println("====== Manav Reyonuna Hoşgeldiniz ======");
        System.out.println("********  Ürün Listesi    ********");
        System.out.println("201-Yerli Muz --> 59₺\n202-Portakal --> 49₺\n203-Elma  39₺\n204-Patates  35₺\n205-Soğan  25₺");

        System.out.print("Satın almak istediğiniz ürün kodunu giriniz.\nSeçiminiz:");
        while (!ekUrun){
            urunKodu= scan.nextInt();
            if (urunKodu>=201 && urunKodu<=205){
                System.out.print("Kaç kg alacaksınız:");
                urunKg= scan.nextInt();
                switch (urunKodu){
                    case 201: urunAdi="Yerli Muz";
                        urunFiyati=59;
                        System.out.println(urunKg+" kg "+urunAdi+" fiyatı:"+(urunFiyati*urunKg)+"₺");
                        break;

                    case 202: urunAdi="Portakal";
                        urunFiyati=49;
                        System.out.println(urunKg+" kg "+urunAdi+" fiyatı:"+(urunFiyati*urunKg)+"₺");
                        break;

                    case 203: urunAdi="Elma";
                        urunFiyati=39;
                        System.out.println(urunKg+" kg "+urunAdi+" fiyatı:"+(urunFiyati*urunKg)+"₺");
                        break;

                    case 204: urunAdi="Patates";
                        urunFiyati=35;
                        System.out.println(urunKg+" kg "+urunAdi+" fiyatı:"+(urunFiyati*urunKg)+"₺");
                        break;

                    case 205: urunAdi="Soğan";
                        urunFiyati=25;
                        System.out.println(urunKg+" kg "+urunAdi+" fiyatı:"+(urunFiyati*urunKg)+"₺");
                        break;
                /*
                default:
                    System.out.println("Geçersiz giriş. Yeniden deneyin.");
                    manav();

                 */
                }
                urunFiyati=urunKg*urunFiyati;
                toplam+=urunFiyati;
                System.out.println("*Toplam Tutar:"+toplam+"₺*");
                sepet+=urunAdi+"="+urunFiyati+"₺ & ";
                System.out.println("Başka ürün almak için ürün kodunu giriniz:\nAna menüye dönmek için 0 tuşuna basınız.");
                System.out.print("Seçiminiz:");
            }

            else if (urunKodu==0){
                girisEkrani();
            }
            else {
                manav();
            }
        }
        //girisEkrani();
    }

    public static void market(){
        System.out.println("====== Market Reyonuna Hoşgeldiniz ======");
        System.out.println("********  Ürün Listesi    ********");
        System.out.println("301-Çikolata --> 50₺\n302-Peçete --> 25\n303-5 lt. Su --> 30₺\n304-Nutella --> 180₺\n305-Tuvalet Kağıdı --> 189₺");

        System.out.print("Satın almak istediğiniz ürün kodunu giriniz.\nSeçiminiz:");
        while (!ekUrun){
            urunKodu= scan.nextInt();
            if (urunKodu>=301 && urunKodu<=305){
                System.out.print("Almak istediğiniz paket adedini giriniz:");
                urunAdedi= scan.nextInt();
                switch (urunKodu){
                    case 301: urunAdi="Çikolata";
                        urunFiyati=50;
                        System.out.println(urunAdedi+" paket "+urunAdi+" fiyatı:"+(urunFiyati*urunAdedi)+"₺");
                        break;

                    case 302: urunAdi="Peçete";
                        urunFiyati=25;
                        System.out.println(urunAdedi+" paket "+urunAdi+" fiyatı:"+(urunFiyati*urunAdedi)+"₺");
                        break;

                    case 303: urunAdi="5 lt. Su";
                        urunFiyati=30;
                        System.out.println(urunAdedi+" paket "+urunAdi+" fiyatı:"+(urunFiyati*urunAdedi)+"₺");
                        break;

                    case 304: urunAdi="Nutella";
                        urunFiyati=180;
                        System.out.println(urunAdedi+" paket "+urunAdi+" fiyatı:"+(urunFiyati*urunAdedi)+"₺");
                        break;

                    case 305: urunAdi="Tuvalet Kağıdı";
                        urunFiyati=189;
                        System.out.println(urunAdedi+" paket "+urunAdi+" fiyatı:"+(urunFiyati*urunAdedi)+"₺");
                        break;
                /*
                default:
                    System.out.println("Geçersiz giriş. Yeniden deneyin.");
                    market();

                 */
                }
                urunFiyati=urunAdedi*urunFiyati;
                toplam+=urunFiyati;
                System.out.println("*Toplam Tutar:"+toplam+"₺*");
                sepet+=urunAdi+"="+urunFiyati+"₺ & ";
                System.out.println("Başka ürün almak için ürün kodunu giriniz:\nAna menüye dönmek için 0 tuşuna basınız.");
                System.out.print("Seçiminiz:");
            }

            else if (urunKodu==0){
                girisEkrani();
            }

            else {
                market();
            }
        }


        //girisEkrani();
    }

    public static void fisYazdir(){
        System.out.println("============ Alışveriş Fişi ===========");
        System.out.println("               Wise Market         ");
        System.out.println(sube);
        System.out.println(sepet.substring(0, sepet.length() - 2)); //sondaki "&" işaretinden kurtulmak için
        System.out.println("Toplam Tutar:"+toplam);
        System.out.println("KDV %8: " +toplam*0.08);
        double kdvliToplam = toplam + toplam*0.08;
        System.out.print("Ödenecek Tutar:");
        System.out.println(kdvliToplam);
        System.out.print("Ödemenizi tuşlayın:");
        int odenen = scan.nextInt();
        if (odenen<kdvliToplam){
            System.out.println("Ödenen tutar yeterli değildir. "+(kdvliToplam-odenen)+"₺ eksik ödeme yaptınız. Paranız iade ediliyor...");
            System.out.println("Ödeme işlemini tekrardan gerçekleştirin.\n");
            fisYazdir();
        }
        else {
            System.out.println("Ödeme Başarıyla Gerçekleşmiştir.\nPara Üstü:"+(odenen-kdvliToplam));
        }
        System.out.println("Bizi Tercih Ettiğiniz İçin Teşekkür Ederiz.");
        LocalDateTime nowTime = LocalDateTime.now();
        System.out.println(nowTime);
        cikis();
    }

    public static void cikis() {
    System.out.print("Çıkış Yapılıyor");

    scan.close();           // Giriş yapmak için açılan tarayıcı kapatılır
    System.exit(0);  // çalışan Kodu durdurur. Bu satırdan sonrası çalışmaz
    }

}
