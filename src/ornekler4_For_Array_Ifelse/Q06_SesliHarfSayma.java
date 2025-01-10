package ornekler4_For_Array_Ifelse;

import java.util.Scanner;

public class Q06_SesliHarfSayma {

    /*18----
        Girilen Stringdeki tüm sesli harfleri saymak için bir Java Methodu yazınız.

        Test Data:
        java is fun

        Beklenen Çıktı:

        Stringdeki sesli harf sayısı: 4
    */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] sesliHarf = {"a","e","ı","i","o","ö","u","ü"};

        System.out.print("Cümle giriniz:");
        String cumle = scan.nextLine();

        int sayac=0;

        for (int i=0;i<cumle.length();i++){
            String bastanYazdir = cumle.substring(i,i+1);

            for (int j=0;j<sesliHarf.length;j++){

                if (bastanYazdir.contains(sesliHarf[j])){
                    sayac++;
                }
            }
        }
        System.out.println(sayac);
    }
}
