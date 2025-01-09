package ornekler2_StringManipulation;

import java.util.Scanner;

public class Q9_KrediKArtı {

    public static void main(String[] args) {

        /*
            * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
            * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
            * input : John White 1234234534561478
            output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)

         */

        Scanner input = new Scanner(System.in);

        System.out.print("İsminizi Giriniz:");
        String isim = input.nextLine();
        System.out.print("Soyisminizi Giriniz:");
        String soyisim = input.nextLine();
        System.out.print("16 haneli kredi kart nonuzu girin:");
        String kkno = input.nextLine();

        if (kkno.length() == 16 ){
            System.out.print(isim.substring(0,1).toUpperCase());
            System.out.println(isim.substring(1).replaceAll("\\w","*"));

            System.out.print(soyisim.substring(0,1).toUpperCase());
            System.out.println(soyisim.substring(1).replaceAll("\\w","*"));

            System.out.println("**** **** **** "+kkno.substring(12,16));
        }
        else {
            System.out.println("Geçersiz kredi kartı numarası");
        }
    }
}
