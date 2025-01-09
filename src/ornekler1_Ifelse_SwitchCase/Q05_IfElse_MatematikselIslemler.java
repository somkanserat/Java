package ornekler1_Ifelse_SwitchCase;

import java.util.Scanner;

public class Q05_IfElse_MatematikselIslemler {

    public static void main(String[] args) {

        //Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
        //Dort islemden biri ile isleme koyup sonucun yazdiriniz

        Scanner input =new Scanner(System.in);

        System.out.println("Lütfen İki Tam Sayı Giriniz:");
        System.out.print("1.Sayı:");
        int sayi1 = input.nextInt(); //Kullanıcıdan alınan 1.sayı
        System.out.print("2.Sayı:");
        int sayi2 = input.nextInt(); //Kullanıcıdan alınan 2.sayı

        System.out.print("Yapmak İstediğiniz İşlemi Seçin:\n1:Bölme\n2:Çıkarma\n3:Toplama\n4:Çarpma\nSeçim:");

        int secim = input.nextInt();

        if (secim == 1){         //1:Bölme
            System.out.println("Bölme İşlemini Seçtiniz.");
            double bolme = (double) sayi1 / sayi2;
            // int girilen sayıların, bölme işlemini ondalıklı alabilmek için casting yaptık.
            System.out.println("Bölme İşleminin Sonucu:" +bolme);
        }

        else if (secim == 2) {   //2:Çıkarma
            System.out.println("Çıkarma İşlemini Seçtiniz.");
            int cikarma = sayi1 - sayi2;
            System.out.println("Çıkarma İşleminin Sonucu:" + cikarma);
        }

        else if (secim == 3) {   //3:Toplama
            System.out.println("Toplama İşlemini Seçtiniz.");
            int toplama = sayi1 + sayi2;
            System.out.println("Toplama İşleminin Sonucu:" +toplama);
        }

        else if (secim == 4) {   //4:Çarpma
            System.out.println("Çarpma İşlemini Seçtiniz.");
            int carpma = sayi1 * sayi2;
            System.out.println("Çarpma İşleminin Sonucu:" +carpma);
        }
        else { //1-4 dışında
            System.out.println("Yanlış Seçim Yaptınız.");
        }

    }
}
