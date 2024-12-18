package calisma10_forLoop;

import java.util.Scanner;

public class C05_soru {

    public static void main(String[] args) {

        //Kullanıcıdan pozitif tam sayı alın.
        //1'den girilen sayiya(girilen sayı dahil) 7 ile bölünebilen sayıları yazdır.

        Scanner input = new Scanner(System.in);

        System.out.print("Pozitif Tam Sayı Girin:");
        int sayi = input.nextInt();

        for (int i=1; i<=sayi; i++){
            if (i%7==0){
                System.out.println(i+" ");
            }
        }

    }
}
