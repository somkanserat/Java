package calismam_SporSalonu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SporSalonuIndirimliFiyatHesaplama extends UyeBilgileri{

    /*
    Bir spor salonu üyeligi için;
        Input olarak verilen satis fiyatı, müsteri kartı var mı?
        ve üyeligi kaç yıllık? bilgileri degerlendirip
        -üye değilse %5 indirim
        -üye ise ama 5 yıldan az ise %10
        -üye ise ve 5 ve 5 yıldan fazla ise %15 indirim uygula
        asıl fiyatı,indirim miktarını ve indirimli fiyatı yazdırın
     */

    static Scanner scan = new Scanner(System.in);
    static int kursFiyati;
    static boolean uyelikBilgisi;
    static int mevcutYil=2024;
    static int kayitYili;
    static String isim;
    static String soyisim;

    public static void main(String[] args) throws InterruptedException {

        System.out.println("*****       MERHABA BLUE SPOR SALONU'NA HOŞGELDİNİZ       *****");

        System.out.print("İsminizi Giriniz:");
        isim = scan.nextLine();
        System.out.print("Soyisminizi Giriniz:");
        soyisim = scan.nextLine();

        System.out.println(UyeBilgileri.uyeler);

        uyelikKontrol(isim,soyisim);
        paketSecimi();
        indirimliFiyatHesaplama();

    }

    static void uyelikKontrol(String isim,String soyisim) throws InterruptedException {

        for (int i=1;i<= uyeler.size();i++){

            if (  isim.equalsIgnoreCase(uyeler.get(i).get("Üye İsmi")) && soyisim.equalsIgnoreCase(uyeler.get(i).get("Üye Soyismi"))){

                System.out.println(uyeler.get(i));
                System.out.print("Yukarıdaki bilgiler size ait ise 'E', değilse 'H' harfini tuşlayınız:");
                String secim = scan.next();

                if (secim.equalsIgnoreCase("E")){
                    uyelikBilgisi=true;
                    kayitYili = Integer.parseInt(uyeler.get(i).get("Üyelik Yılı"));
                    System.out.println("Bilgiler Alındı. Paket Seçim Ekranına Yönlendiriliyorsunuz...");

                   Thread.sleep(3000);
                    break;

                }

                else if (secim.equalsIgnoreCase("H")) {

                    uyelikBilgisi=false;
                    System.out.println("Kaydınız bulunmamaktadır. Kaydınız Oluşturuluyor...");
                    uyeKayitOlusturma();
                    break;
                }

                else {
                    System.out.println("Yanlış Tuşlama Yaptınız. Yeniden Deneyin...");
                    uyelikKontrol(isim,soyisim);
                }
            }
            else {

                System.out.println("Kaydınız bulunmamaktadır. Kaydınız Oluşturuluyor...");
                uyeKayitOlusturma();
                break;
            }
        }
    }

    static void uyeKayitOlusturma() throws InterruptedException {

        Set<Integer> uyeNolar = uyeler.keySet();
        Integer yeniUyeNo = uyeNolar.size()+1;

        Map<String,String> yeniKayit = new HashMap<>();
        yeniKayit.put("Üye İsmi",isim);
        yeniKayit.put("Üye Soyismi",soyisim);
        yeniKayit.put("Üyelik Yılı","2024");
        uyeler.put(yeniUyeNo,yeniKayit);

        System.out.println("Üye Kayıt Numarası:"+yeniUyeNo+" | Yeni Üye Bilgileri:"+yeniKayit);
        System.out.println("Paket Seçim Ekranına Yönlendiriliyorsunuz...");

        Thread.sleep(2000);

    }

    static void paketSecimi(){

        System.out.println("KURS BİLGİLERİ AŞAĞIDA YER ALMAKTADIR:");
        System.out.println("1.Paket: 1 yıllık --> 5000TL\n2.Paket: 6 Aylık --> 6000TL\n3.Paket: 1 Aylık --> 7500TL");
        System.out.print("Lütfen Paket Seçimi Yapınız:");
        int secim = scan.nextInt();

        switch (secim){
            case 1:
                System.out.println("Paket seçiminiz: 1 yıllık --> 5000TL");
                kursFiyati =5000;
                break;
            case 2:
                System.out.println("Paket seçiminiz: 6 Aylık --> 6000TL");
                kursFiyati =6000;
                break;
            case 3:
                System.out.println("Paket seçiminiz: 1 Aylık --> 7500TL");
                kursFiyati =7500;
                break;
            default:
                System.out.println("Yanlış seçim yapıldı. Yeniden deneyin.");
                paketSecimi();
                break;
        }
    }

    static void indirimliFiyatHesaplama(){


        if (uyelikBilgisi){

            if (mevcutYil-(kayitYili) >= 5){
                kursFiyati = kursFiyati-kursFiyati*15/100;
                System.out.println("İndirimli Kurs Ücretiniz:"+kursFiyati);
            }
            else {
                kursFiyati = kursFiyati-kursFiyati*10/100;
                System.out.println("İndirimli Kurs Ücretiniz:"+kursFiyati);
            }
        }
        else {

            kursFiyati = kursFiyati-kursFiyati*5/100;
            System.out.println("İndirimli Kurs Ücretiniz:"+kursFiyati);
        }
    }
}
