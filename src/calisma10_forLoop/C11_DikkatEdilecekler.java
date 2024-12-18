package calisma10_forLoop;

import java.util.Scanner;

public class C11_DikkatEdilecekler {

    public static void main(String[] args) {

        // Soru 7- Kullanicidan pozitif bir tamsayi alip,
        //         rakamlar toplamini yazdirin.
        //         Ilk islem bittikten sonra
        //         1'den verilen sayiya kadar 17 ile bolunebilen sayilari yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen pozitif bir tamsayi giriniz: ");
        int girilenSayi= scan.nextInt();

        int sayi = girilenSayi;

        System.out.println("Girmiş olduğunuz sayi: "+sayi); //45861

        int basamakSayisi = (sayi+"").length();
        int rakamlarToplami = 0;


        for (int i = 1; i <=basamakSayisi ; i++) {

            rakamlarToplami += sayi % 10;
            sayi /= 10;
        }

        System.out.println("Sayinin rakamlar toplami : "+rakamlarToplami);


        // 1'den verilen sayiya kadar 17 ile bolunebilen sayilari yazdirin

        for (int i = 1; i <=girilenSayi ; i++) {

            if (i%17 == 0){
                System.out.print(i + " ");
            }
        }

    }
}
