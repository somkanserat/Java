package ornekler1_Ifelse_SwitchCase;

import java.util.Scanner;

public class Q15_VizeNotu_IFelse {

    public static void main(String[] args) {
        /*
        1.Kullanıcıya    "Vize sınav sonucunuzu giriniz :"
        2.vize notu double değerinde girilecek.
        3. Kullanıcıya  "Vize sınavı yüzdesini giriniz". ->> double olmalı ->> 0,40 etkiliyor   !!Yüzde kaç etkilediğini Sisteme siz giriyorsunuz.!!
        4.Kullanıcıya    "Final sınav sonucunuzu giriniz.
        5. final notu double değerinde olmalı. (örn: 65,5)
        6.Kullanıcıya    "Final sınavı yüzdesini giriniz"-->> double olmalı ->> 0,60 etkiliyor.
        7. Vize final ortalamasını bulmak için, vize nin yüzde40 ı, finalin yüzde60 ı alınmalı ve çıkan sonuçlar toplanmalıdır.
        8. Çıkan sonucu (dersin not ortalamasını)   double toplam  ' a eşitleyebilirsiniz.
                                        eğer ortalaması 90(90 dahil) 'dan büyük ise, harf notu olarak AA,
                                                                        80(80dahil)   ile 90 arasında ise  BA,
                                                                        70(70 dahil)   ile 80 arasında ise BB,
                                                                        60(60dahil) ile 70 arasında ise CB,
                                                                        50(50 dahil) ile 60 arasında ise CC,
                                                                     40(40 dahil) ile 50 arasında ise DC,
                                                                     30(30 dahil) ile 40 arasında ise DD,
                                                                     30 'dan düşük ise FF            gelmeli.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Vize Notunuzu Girin:");
        double vize = input.nextDouble();
        System.out.print("Vize Sınavının Yüzdesini Giriniz:");
        double vizeyuzde = input.nextDouble();

        System.out.print("Final Notunuzu Girin:");
        double fnl = input.nextDouble();
        System.out.print("Final Sınavının Yüzdesini Giriniz:");
        double fnlyuzde = input.nextDouble();

        double ort = (vize*vizeyuzde)+(fnl*fnlyuzde);
        System.out.println("Ortalamanız:"+ort);

        if (ort>=90){
            System.out.println("Harf Notunuz:AA");
        }
        else if (ort>=80) {
            System.out.println("Harf Notunuz:BA");
        }
        else if (ort>=70 ) {
            System.out.println("Harf Notunuz:BB");
        }
        else if (ort>=60) {
            System.out.println("Harf Notunuz:CB");
        }
        else if (ort>=50) {
            System.out.println("Harf Notunuz:CC");
        }
        else if (ort>=40) {
            System.out.println("Harf Notunuz:DC");
        }
        else if (ort>=30) {
            System.out.println("Harf Notunuz:DD");
        }
        else if (ort<30) {
            System.out.println("Harf Notunuz:FF");
        }

    }
}
