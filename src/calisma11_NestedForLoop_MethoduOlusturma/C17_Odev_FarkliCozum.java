package calisma11_NestedForLoop_MethoduOlusturma;

import java.util.Scanner;

public class C17_Odev_FarkliCozum {

    public static void main(String[] args) {

        // Kullanicidan bir sifre isteyin
        // C16'daki method'u kullanarak sifreyi kontrol edin
        // ve sifre uygun oluncaya kadar islemi tekrar edin
        // sifre uygun oldugunda kac denemede uygun sifre yazabildigini soyleyin

        Scanner input = new Scanner(System.in);

        boolean sormayaDevamEdeyimMi = false;

        while (sormayaDevamEdeyimMi){ //==false
            System.out.print("Şifre Giriniz:");
            String sifre = input.nextLine();

            if(C16_sifreDogruMuDondur.sifreDogruMu(sifre)){
                sormayaDevamEdeyimMi=true; //işlem sağlandığında true yapacak ve while bitecek
                System.out.println("Şifreniz başarı ile kaydedilmiştir.");
            }

        }




    }


}
