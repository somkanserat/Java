package calisma18_ArrayList_forEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class C05_HarfKullanimSayisiniBulun {

    public static void main(String[] args) {

        // Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir cümle giriniz:");
        String cumle = scan.nextLine();

        System.out.print("Aranacak harfi giriniz:");
        String harf = scan.nextLine().substring(0,1);

        String[] karakterlerArr = cumle.split("");
        System.out.println(Arrays.toString(karakterlerArr));

        int sayac=0;

        for ( String each:karakterlerArr){

            if (each.contains(harf)){
                sayac++;
            }
        }

        if (sayac==0){
            System.out.println(harf+", cümlede kullanılmamıştır.");
        }
        else {
            System.out.println(harf+", cümlede "+sayac+" kez kullanılmıştır.");
        }
    }
}
