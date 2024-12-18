package calisma11_NestedForLoop_MethoduOlusturma;

import java.util.Scanner;

public class C17_Soru {

    public static void main(String[] args) {

        // Kullanicidan bir sifre isteyin
        // C16'daki method'u kullanarak sifreyi kontrol edin
        // ve sifre uygun oluncaya kadar islemi tekrar edin
        // sifre uygun oldugunda kac denemede uygun sifre yazabildigini soyleyin
        Scanner input = new Scanner(System.in);

        int a =-1;
        int deneme=0;
        for (int i=0;a<i;){
            System.out.print("Şifre Giriniz:");
            String sifre = input.nextLine();
            deneme++;

            if(sifreDogruMu(sifre) == 0){
                System.out.println("Şifreniz sisteme kaydedilmiştir.");
                System.out.println("Toplam deneme sayısı:"+deneme);
                a++;
            }

        }
    }

    public static int sifreDogruMu(String sifre){

        int sayac = 0;


        //         - ilk harf kucuk harf olmali

        if ( ! Character.isLowerCase( sifre.charAt(0)) ){
            System.out.println("*İlk harf kucuk harf olmali");
            sayac++;
        }


        //         - son karakter rakam olmali

        if (  ! Character.isDigit( sifre.charAt(sifre.length()-1) )){

            System.out.println("*Son karakter rakam olmali");
            sayac++;
        }

        //         - sifre bosluk icermemeli

        if (sifre.contains(" ")){
            System.out.println("*Şifre bosluk icermemeli");
            sayac++;
        }

        //         - uzunlugu en az 10 karakter olmali

        if ( !(sifre.length() >=10) ){

            System.out.println("*Şifrenin uzunlugu en az 10 karakter olmali");
            sayac++;
        }


        // sayac 0 - 4 arasi olabilir
        // eger 0'sa ==> hic hata yok hepsi uygun
        // eger 4'se ==> hepsi hatali

        if (sayac == 0) {
            return sayac;
        }
        else{
            System.out.print("****Hatalı girdiniz. Lütfen Yeniden \n");
            return sayac;
        }
    }



}
