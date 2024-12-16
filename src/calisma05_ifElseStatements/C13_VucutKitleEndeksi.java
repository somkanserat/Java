package calisma05_ifElseStatements;

import java.util.Scanner;

public class C13_VucutKitleEndeksi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Kilonuzu Giriniz:");
        double kilo = input.nextDouble();

        System.out.print("Boyunuzu Giriniz(cm cinsinden):");
        double boy = input.nextDouble();


        double vke = ( (kilo*10000) / (boy*boy));

        if ( !(kilo < 30 || boy <50) ){
            System.out.println("Vücüt Kitle Endeksiniz:" +vke);
        }

        if (kilo < 30 || boy <50){
            System.out.println("Verilen değerler için Vücut Kitle Endeksi hesaplanamaz.");
        }

        else if (vke > 30){
            System.out.println("Obezsiniz.");
        }

        else if (vke <= 30 && vke > 25) {
            System.out.println("Kilolusunuz.");
        }

        else if (vke <= 25 && vke > 20) {
            System.out.println("Normalsiniz.");
        }

        else {
            System.out.println("Zayıfsınız.");
        }
    }
}
