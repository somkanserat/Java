package calismam_ATM;

import java.util.Scanner;

public class ATM {

    /*
      ATM EKRANI VE ISLEMLER
      -Kullanicidan giriş için kart numarasi ve şifresini isteyin,
        eger herhangi birini yanlis girerse tekrar girmesini isteyin.
      -Kart numarasini boşluk ile girerse, eger numara doğruysa kabul edin.
      -Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri (Menu listesi) ekrana yazdirin.
      -Menu listesinde;
        Bakiye sorgulama, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis
        islemleri olacaktır.
     -Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez ve gönderilemez.
     -Para gönderme işleminde istenen iban TR ile baslamali ve toplam 10 karakter olmali,
     eger iban bu kriterlere uygun değilse menü ekranina geri donmelidir.
     - Sifre değiştirme işlemini yapmadan önce mevcut şifreyi teyit etmelidir.
  */

    static Scanner scan = new Scanner(System.in);
    static String kayitlikartNo="123456";
    static String kayitlisifre ="1234";
    static double bakiye=1000;

    public static void main(String[] args) {

    girisEkrani();


    }

    public static void girisEkrani(){

        System.out.println(" ****X BANKASINA HOŞGELDİNİZ****");
        System.out.print("Kart Numaranızı Giriniz:");
        String kartNo = scan.nextLine();
        kartNo=kartNo.replaceAll("\\s", "");


        System.out.print("Şifrenizi Giriniz:");
        String sifre = scan.nextLine();

        if (kartNo.equals(kayitlikartNo) && sifre.equals(kayitlisifre)){

            menu();
        }
        else {

            System.out.println("Yanlış değer girdiniz. Giriş ekranına yönlendiriliyorsunuz...\n");
            girisEkrani();
        }
    }

    public static void menu(){
        System.out.println(" ****X BANKASI ****"+"\n   ****MENU****");
        System.out.print("Yapmak istediginiz islemin numarasini tuslayiniz: \n" +
                "1.BAKIYE SORGULAMA\n" +
                "2.PARA YATIRMA\n" +
                "3.PARA CEKME\n" +
                "4.PARA GÖNDERME\n" +
                "5.SIFRE DEGISTIRME\n" +
                "6.CIKIS\n" +
                "Seciminiz:");

        int secim = scan.nextInt();

        switch (secim){

            case 1:
                bakiyeSorgulama();
                break;
            case 2:
                paraYatirma();
                break;
            case 3:
                paraCekme();
                break;
            case 4:
                paraGonderme();
                break;
            case 5:
                sifreDegistirme();
                break;
            case 6:
                System.out.println("İYİ GÜNLER");
                System.exit(0);
                break;
            default:
                System.out.println("Yanlış seçim yaptınız. Ana Menüye aktarılıyorsunuz...");
                menu();
                break;
        }
    }

    private static void bakiyeSorgulama(){

        System.out.println("Bakiyeniz:"+bakiye);
        menu();
    }

    private static void paraYatirma(){

        System.out.println("Yatırmak istediğiniz miktarı giriniz:");
        double miktar = scan.nextDouble();
        bakiye+=miktar;
        System.out.println("Güncel Bakiyeniz:"+bakiye);
        menu();
    }

    private static void paraCekme(){

        System.out.print("Çekmek istediğiniz miktarı giriniz:");
        double miktar = scan.nextDouble();

        if (miktar <=bakiye){
            bakiye-=miktar;
            System.out.println("Güncel Bakiyeniz:"+bakiye);
            menu();
        }
        else {

            System.out.println("Bakiyeniz yetersiz. Farklı bir değer giriniz.");
            paraCekme();
        }
    }

    private static void paraGonderme(){

        scan.nextLine(); //bu kod olmazsa, iban değerini almadan diğer komuta atlayacak.

        System.out.print("TR ile başlayan ve 10 karakter uzunluğu olan IBAN değerini giriniz:");
        String iban = scan.nextLine().toUpperCase().replaceAll("\\s","");


        if (iban.length()==10 && iban.substring(0,2).contains("TR")){

            System.out.print("Göndermek istediğiniz miktarı giriniz:");
            double miktar = scan.nextDouble();

            if (miktar <=bakiye){
                bakiye-=miktar;
                System.out.println("Güncel Bakiyeniz:"+bakiye);
                menu();
            }
            else {

                System.out.println("Bakiyeniz yetersiz. Farklı bir değer giriniz.");

            }
        }
        else {
            System.out.print("Yanlış iban girildi. Para Gönderme ekranına yönlendiriliyorsunuz...Devam etmek için herhangi bir tuşa basınız:");
            paraGonderme();
        }
    }

    private static void sifreDegistirme(){

        scan.nextLine(); //bu kod olmazsa, mevcutSifre değerini almadan değerini almadan diğer komuta atlayacak.

        System.out.print("Yeni şifre oluşturabilmek için, mevcut şifrenizi giriniz:");
        String mevcutSifre = scan.nextLine();


        if (mevcutSifre.equals(kayitlisifre)){

            System.out.print("Lütfen oluşturmak istediğiniz 4 haneli şifrenizi giriniz(Şifreniz sadece sayı içermelidir):");
            String yeniSifre = scan.nextLine();

            if (yeniSifre.length() == 4){

                for (int i=0; i<yeniSifre.length();i++){

                    if (Character.isDigit(yeniSifre.charAt(i))){

                        kayitlisifre=yeniSifre;
                        System.out.println("İşlem başarıyla gerçekleştirilmiştir. Yeni Şifreniz:"+kayitlisifre);
                        girisEkrani();
                    }
                    else {
                        System.out.println("Yanlış değer girdiniz. Şifre Değiştirme ekranına yönlendiriliyorsunuz...Devam etmek için bir tuşa basınız.");
                        sifreDegistirme();
                    }
                }
            }
            else {

                System.out.println("4 haneli şifre girmelisiniz. Şifre Değiştirme ekranına yönlendiriliyorsunuz...Devam etmek için bir tuşa basınız.");
                sifreDegistirme();
            }
        }
        else {

            System.out.println("Sistemde kayıtlı olan şifrenizi yanlış girdiniz. Şifre Değiştirme ekranına yönlendiriliyorsunuz...Devam etmek için bir tuşa basınız.");
            sifreDegistirme();
        }
    }
}
