package ornekler2_StringManipulation;

import java.util.Scanner;

public class Q14_DegerCevirme {

    public static void main(String[] args) {

        /*
            Q14 -    Saati saniyeye, mil'i kilometreye, kilogrami gram'a
            ceviren bir method yaziniz.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Saat değeri girin:");
        double saat = input.nextDouble();

        System.out.print("Mil değeri girin:");
        double milDegeri = input.nextDouble();

        System.out.print("Kilogram değeri girin:");
        double kilogram = input.nextDouble();


        time(saat);
        mil(milDegeri);
        kg(kilogram);

    }

    public static void time(double saat) {
        double saniye = saat*3600;
        System.out.println(saat +" saat = "+saniye+" saniyedir.");
    }

    public static void mil(double milDegeri){
        double kilometre = milDegeri*1.609344;
        System.out.println(milDegeri+" mil = "+kilometre+" kilometredir.");
    }
    public static void kg(double kilogram){
        double gram = kilogram*1000;
        System.out.println(kilogram+" kilogram = "+gram+" gramdır.");
    }

}
