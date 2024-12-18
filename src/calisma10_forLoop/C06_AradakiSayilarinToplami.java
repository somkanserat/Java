package calisma10_forLoop;

import java.util.Scanner;

public class C06_AradakiSayilarinToplami {

    public static void main(String[] args) {

       //Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar dahil olarak aralarindaki
        //tum sayilarin toplamini yazdirin. Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner input = new Scanner(System.in);

        System.out.println("Başlangıç için bir tamsayı giriniz:");
        int baslangic = input.nextInt();

        System.out.println("Bitiş için bir tam sayı giriniz:");
        int bitis = input.nextInt();

        int toplam=0;

        if (bitis<baslangic){
            System.out.println("Bitis değeri, başlangıçtan büyük olmalıdır.");
        }
        else {
            for (int i =baslangic; i<=bitis; i++){
                toplam +=i;

            }
        }

        System.out.println("Toplam:" +toplam);

    }
}
