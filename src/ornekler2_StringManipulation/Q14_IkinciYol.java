package ornekler2_StringManipulation;

import java.util.Scanner;

public class Q14_IkinciYol {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Çevirim yapmak istediğiniz işlemi yazın: ");
        String secim = input.next();
        secim = secim.toLowerCase();

        System.out.print("Çevirim miktarını giriniz:");
        double miktar = input.nextDouble();

        donustur(secim,miktar);

    }

    public static void donustur(String secim, double miktar){

        switch (secim){
            case "saat":
                double saniye = miktar*3600;
                System.out.println(miktar +" saat = "+saniye+" saniyedir.");
                break;

            case "mil":
                double kilometre = miktar*1.609344;
                System.out.println(miktar+" mil = "+kilometre+" kilometredir.");
                break;

            case "kilogram":
                double gram = miktar*1000;
                System.out.println(miktar+" kilogram = "+gram+" gramdır.");
                break;

            default:
                System.out.println("Yanlış seçim yaptınız.");
                break;
        }

    }
}
