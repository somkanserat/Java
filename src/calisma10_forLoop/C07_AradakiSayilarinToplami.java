package calisma10_forLoop;

import java.util.Scanner;

public class C07_AradakiSayilarinToplami {

    public static void main(String[] args) {

        //Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar dahil olarak aralarindaki
        //tum sayilarin toplamini yazdirin. Bitis degeri baslangic degerinden kucuk olsa da program calissin

        Scanner input = new Scanner(System.in);

        System.out.print("Başlangıç için bir tamsayı giriniz:");
        int baslangic = input.nextInt();

        System.out.print("Bitiş için bir tam sayı giriniz:");
        int bitis = input.nextInt();

        int toplam=0;

        if (baslangic<bitis){
            for (int i=baslangic; i<=bitis; i++){
                toplam+=i;
            }
        }
        else {
            for (int i=baslangic; i>=bitis; i--){
                toplam+=i;
            }
        }
        System.out.println("Toplam:"+toplam);
    }
}
