package calisma06_nestedIfElseStatements_ternary;

import java.util.Scanner;

public class C04_NestedIfElse_Emeklilik {

    public static void main(String[] args) {

        //EĞER karar vermek için birden fazla degiskeni değerlendirmek gerekiyorsa NESTED IF ELSE kullanılır.
        //Bunun için once değişkenlerden birini temel değişken seçip, SADECE temel değişkene bağlı olarak if else
        //oluşturalım

        Scanner input = new Scanner(System.in);

        System.out.print("Cinsiyet: E:Erkek & K:Kadın\nCinsiyetinizi Girin:");
        char cinsiyet = input.next().toUpperCase().charAt(0); //küçük harf girilse bile, toUpperCase komutu ile büyük harf yapılır.

        System.out.print("Yaşınızı Giriniz:");
        int yas = input.nextInt();

        if (cinsiyet == 'E') {
            if (yas<20 ||yas > 80){
                System.out.println("Yanlış değer girdiniz.");
            }
            else if (yas>=65) {
                System.out.println("Erkekler 65 yaşından büyük olduğu için emekli olabilir.");
            }
            else {
                System.out.println("Emekli olmanız için " +(65-yas) +" yıl daha çalışmanız gerekmektedir.");
            }
        }

        else if (cinsiyet == 'K') {
            if (yas<20 ||yas > 80){
                System.out.println("Yanlış değer girdiniz.");
            }
            else if (yas>=60) {
                System.out.println("Kadınlar 60 yaşından büyük olduğu için emekli olabilir.");
            }
            else {
                System.out.println("Emekli olmanız için " +(60-yas) +" yıl daha çalışmanız gerekmektedir.");
            }
        }

        else {
            System.out.println("Yanlış değer girdiniz.");
        }

    }
}
