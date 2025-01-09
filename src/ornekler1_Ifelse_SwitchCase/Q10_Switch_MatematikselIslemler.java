package ornekler1_Ifelse_SwitchCase;

import java.util.Scanner;

public class Q10_Switch_MatematikselIslemler {

    public static void main(String[] args) {

        //Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
        //Dort islemden biri ile isleme koyup sonucun yazdiriniz

        Scanner input = new Scanner(System.in);

        System.out.println("İki tane tam sayı değeri giriniz:");
        System.out.print("Sayi 1:");
        int sayi1 = input.nextInt();
        System.out.print("Sayi 2:");
        int sayi2 = input.nextInt();

        System.out.print("Yapmak istediğiniz işlemi seçiniz:\n1:Toplama\n2:Çıkarma\n3:Çarpma\n4:Bölme\nSeçiminiz:");
        int secim = input.nextInt();

        switch (secim){

            case 1:
                System.out.println("Toplama işlemini seçtiniz.");
                int toplam = sayi1 + sayi2;
                System.out.println("Sonuç:"+toplam);
                break;

            case 2:
                System.out.println("Çıkarma işlemini seçtiniz.");
                int cikarma = sayi1 - sayi2;
                System.out.println("Sonuç:"+cikarma);
                break;

            case 3:
                System.out.println("Çarpma işlemini seçtiniz.");
                int carpma = sayi1 * sayi2;
                System.out.println("Sonuç:" +carpma);
                break;
            case 4:
                System.out.println("Bölme işlemini seçtiniz.");
                float bolme = (float)sayi1/(float)sayi2;
                System.out.println("Sonuç:"+bolme);
                break;
            default:
                System.out.println("Yanlış seçim yaptınız.");
        }







    }
}
