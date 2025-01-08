package calismam_OgrenciBilgiSistemi;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        OgrenciYonetimSistemi admin = new OgrenciYonetimSistemi();

        while (true){

            System.out.println("****  OGR OGRENCİ BİLGİ SİSTEMİ  ****");

            System.out.println("1: Öğrenci Ekleme\n2: Öğrenci Listeleme\n3: Öğrenci Bilgi Güncelleme\n4: Öğrenci Bilgisi Silme\n5: Çıkış");

            System.out.println("Seçim Değeri:");
            int secim = scan.nextInt();
            scan.nextLine();

            switch (secim){
                case 1:
                    System.out.println("** ÖĞRENCİ EKLEME **");

                    System.out.print("Öğrenci Adı:");
                    String isim = scan.nextLine();

                    System.out.println("Öğrenci Soyismi:");
                    String soyisim = scan.nextLine();

                    System.out.println("Öğrenci Email:");
                    String email = scan.nextLine();

                    admin.ogrenciEkleme(isim,soyisim,email);
                    break;

                case 2:
                    admin.ogrenciListeleme();
                    break;

                case 3:
                    System.out.print("Güncellenecek Öğrenci ID No'yu Giriniz:");
                    int guncellenecekID = scan.nextInt();
                    scan.nextLine();

                    System.out.println("Yeni isim:");
                    String yeniIsim = scan.nextLine();

                    System.out.println("Yeni Soyisim:");
                    String yeniSoyisim = scan.nextLine();

                    System.out.println("Yeni Mail Adresi:");
                    String yeniEmail = scan.nextLine();

                    admin.ogrenciGBilgisiGuncelle(guncellenecekID,yeniIsim,yeniSoyisim,yeniEmail);
                    break;

                case 4:
                    System.out.println("Silinecek Öğrencinin ID No'su:");
                    int silinecekID = scan.nextInt();

                    admin.ogrenciBilgisiSilme(silinecekID);
                    break;

                case 5:
                    System.out.println("Çıkış Yapılıyor...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Yanlış Tuşlama Yapıldı. Tekrar Deneyin...");
                    break;
            }
        }
    }
}
