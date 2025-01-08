package calismam_SekilHesaplama;

import java.util.Scanner;

public class Menu {

    static Scanner scan = new Scanner(System.in);

    static void menu() {

        System.out.println("****   ŞEKİL HESAPLAMA PROGRAMINA HOŞGELSİNİZ   ****");
        System.out.println("1:Çember\n2:Dikdörtgen\n3:Kare\n4:Çıkış");
        System.out.print("Oluşturmak istediğiniz şekilin numarasını tuşlayın:");
        char secim= scan.next().charAt(0);

        switch (secim){

            case '1':
                cemberBilgileri();
                break;
            case '2':
                dikdortgenBilgileri();
                break;
            case '3':
                kareBilgileri();
                break;
            case '4':
                System.out.println("Sistemden çıkılıyor...");
                break;
            default:
                System.out.println("Geçersiz tuşlama yaptınız.");
                menu();
                break;
        }
    }

    private static void kareBilgileri() {

        System.out.print("Karenin kenarını giriniz:");
        double kareKenar = scan.nextDouble();

        Kare kare = new Kare(kareKenar,kareKenar);
        System.out.println(kare);
        menu();
    }

    private static void dikdortgenBilgileri() {

        System.out.print("Uzun kenarı giriniz:");
        double uzunKenar= scan.nextDouble();
        System.out.print("Kısa kenarı giriniz:");
        double kisaKenar= scan.nextDouble();

        Dikdortgen dikdortgen = new Dikdortgen(uzunKenar,kisaKenar);
        System.out.println(dikdortgen);
        menu();
    }

    private static void cemberBilgileri() {

        System.out.print("Çemberin yarıçapını giriniz:");
        double yaricap= scan.nextDouble();

        Cember cember = new Cember(yaricap);
        System.out.println(cember);
        menu();
    }
}
