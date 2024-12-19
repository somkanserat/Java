package calisma13_doWhileLoop_scope;

import java.util.Scanner;

public class C04_DoWhileLoop {

    public static void main(String[] args) {

        //Kullanıcıdan pozitif bir tam sayı alın.
        //sayıdan baslayarak, 0'a kadar olan tam sayıları yazdırın
        /*
            Artı Özellikleri;
            -   kontrolden önce loop body'si bir kere çalışır.
                böylece, ilk atamada hata yapma riskini giderir.
            -   loop body çalışma sayısı ile kontrol sayısı aynı

            Eksi Özellikleri;
            -   Kontrolden önce loop body'si bir kere çalışır.
                eğer kullanıcı istenmeyen bir değer girmişse
                o değer bir defa loop'da çalışır.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Pozitif bir tam sayı giriniz:");
        int girilenSayi = input.nextInt();

        do {
            System.out.println(girilenSayi + " ");
            girilenSayi--;
        }while (girilenSayi>0);
    }
}
