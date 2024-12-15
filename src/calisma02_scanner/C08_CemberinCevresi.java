package calisma02_scanner;

import java.util.Scanner;

public class C08_CemberinCevresi {

    public static void main(String[] args) {

        //Soru-Kullanıcıdan cemberin yaricapini alıp, çevresi ve alanını hesaplayınız

        Scanner input = new Scanner(System.in);

        System.out.println("Yarıçapı Giriniz:");
        double yaricap = input.nextDouble();

        double pi = 3.14;

        System.out.println("Çemberin Çevresi: " + (2 * pi * yaricap));
        System.out.println("Dairenin Alanı: " + pi * yaricap*yaricap);

    }

}
