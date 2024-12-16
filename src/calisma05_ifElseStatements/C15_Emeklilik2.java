package calisma05_ifElseStatements;

import java.util.Scanner;

public class C15_Emeklilik2 {

    public static void main(String[] args) {

        //Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        //Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir”
        //yazdirin.

        Scanner input = new Scanner(System.in);

        /*-****************CHAR İLE YAPILAN YÖNTEM******************

        System.out.print("Cinsiyet: E/K\nCinsiyetinizi Girin:");
        char cinsiyet = input.next().charAt(0);

        System.out.print("Yaşınızı Giriniz:");
        int yas = input.nextInt();


        if (cinsiyet == 'E') {
            if (yas >= 65) {
                System.out.println("Emekli olabilirsiniz.");
            }
            else if (yas < 65) {
                System.out.println("Emekli olmanız için " + (65 - yas) + " yıl daha çalışmanız gerekmektedir.");
            }
        }

        else if (cinsiyet == 'K') {
            if (yas >= 60){
                System.out.println("Emekli olabilirsiniz.");
            }
            else if (yas<60) {
                System.out.println("Emekli olmanız için " +(60-yas) +" yıl daha çalışmanız gerekmektedir.");
            }
        }
         */

        //-***********STRİNG İLE YAPILAN YÖNTEM*************

        System.out.print("Cinsiyet: Erkek/Kadın\nCinsiyetinizi Giriniz:");
        String cinsiyet = input.nextLine();

        System.out.print("Yaşınızı Giriniz:");
        int yas = input.nextInt();

        if(cinsiyet.equals("Erkek")){

            if (yas>=65){
                System.out.println("Emekli olabilirsiniz.");
            }
            else if (yas<65) {
                System.out.println("Emekli olabilmek için "+(65-yas) +" yıl daha çalışmanız gerekmektedir.");

            }
        }

        else if (cinsiyet.equals("Kadın")) {

            if (yas>=60){
                System.out.println("Emekli olabilirsiniz.");
            }
            else if (yas<60) {
                System.out.println("Emekli olabilmek için "+(60-yas) +" yıl daha çalışmanız gerekmektedir.");
            }
        }

        else{
            System.out.println("Geçerli Cinsiyet Değeri Girmediniz.");
        }



        /*

        //********** && kullanılarak yazılan kod**********
        System.out.print("Cinsiyet: Erkek/Kadın\nCinsiyetinizi Giriniz:");
        String cinsiyet = input.nextLine();

        System.out.print("Yaşınızı Giriniz:");
        int yas = input.nextInt();

        if(cinsiyet.equals("Erkek") && (yas>=65)){
                System.out.println("Emekli olabilirsiniz.");
        }

        else if(cinsiyet.equals("Erkek") && (yas<65)){
            System.out.println("Emekli olabilmek için "+(65-yas) +" yıl daha çalışmanız gerekmektedir.");
        }

        else if (cinsiyet.equals("Kadın") && (yas>=60)) {
            System.out.println("Emekli olabilirsiniz.");
        }

        else if (cinsiyet.equals("Kadın") && (yas<60)){
            System.out.println("Emekli olabilmek için "+(60-yas) +" yıl daha çalışmanız gerekmektedir.");
        }
        else {
            System.out.println("Yanlış değerler girilmiştir.");
        }
         */


    }
}
