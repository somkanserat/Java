package calisma17_ListOlusturma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C08_KullaniciyaListeOlusturtma {

    public static void main(String[] args) {

        System.out.println(stringListelustur());
    }

    /*
        Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi
        isimleri bize liste olarak dondurecek bir method olusturun.
     */

    public static List<String> stringListelustur(){

        List<String> isimler = new ArrayList<>();

        Scanner scan= new Scanner(System.in);

        String girilenIsim ="";

        do {
            System.out.print("Listeye eklemek için isim giriniz:\nBitirmek için Q'ya basınız:");
            girilenIsim = scan.nextLine();

            if (! girilenIsim.equalsIgnoreCase("q")){
                isimler.add(girilenIsim);
            }
        }
        while (! girilenIsim.equalsIgnoreCase("q") );

        return isimler;
    }
}
