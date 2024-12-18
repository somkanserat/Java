package calisma10_forLoop;

import java.util.Scanner;

public class C15_AsalSayi {

    public static void main(String[] args) {

        //Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.

        Scanner input = new Scanner(System.in);

        System.out.print("Pozitif bir sayı girin:");
        int sayi= input.nextInt();

        int flag=20; //değerin önemi yok

        for (int i=2; i<sayi;i++){
            if (sayi%i==0){
                System.out.println("Girilen sayı asal sayı değildir.");
                flag=42;
                break;
            }
            if (flag == 20){
                System.out.println("Girilen sayı ASALdır");
                break;
            }
        }

    }
}
