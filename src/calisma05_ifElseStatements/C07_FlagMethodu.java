package calisma05_ifElseStatements;

import java.util.Scanner;

public class C07_FlagMethodu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Soru: Kullanıcıdan 2 tam sayı isteyin
        // girilen sayilara gore asagidaki degerlendirmeleri yazdirin
        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk"
        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk"
        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk"
        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati"
        // 5- EGER konsolda yukardakilerden hicbiri yazdirilmazsa
        //    "Nasil sayi sectiniz , hicbir sarti saglamiyor" yazdirin

        System.out.print("1.sayi:");
        int sayi1 = input.nextInt();
        System.out.print("2.sayi:");
        int sayi2 = input.nextInt();

        int flag = 47;

        if(sayi1 < sayi2){
            System.out.println("1.Sayı daha küçüktür.");
            flag = 72;
        }

        if(sayi1 > 0){
            System.out.println("1.Sayı 0'dan büyüktür.");
            flag = 72;
        }

        if(sayi2 > 50){
            System.out.println("2.Sayı 50'den büyüktür.");
            flag = 72;
        }

        if(sayi2 % 5 == 0){
            System.out.println("2.Sayı 5'in katıdır.");
            flag = 72;
        }

        // 5- EGER konsolda yukardakilerden hicbiri yazdirilmazsa
        //    "Nasil sayi sectiniz , hicbir sarti saglamiyor" yazdirin

        //sona gelindiğinde flag için 2 ihtimal vardır. flag baştaki değere (47) eşitse, hiçbir şart sağlanmadı
        //flag if bodylerin içindeki sayıya (72) eşitse, en az bir if body'si çalışmıştır.
        //ama kaç tanesi çalıştığını bilmiyoruz.

        if( flag == 47 ){
            System.out.println("Hiçbir şartı sağlamadı");
        }

    }
}
