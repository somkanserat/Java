package ornekler7;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_BuyukHarfYapmaIkinciYol {

    /*41-----
        Girilen metindeki tüm kelimelerin ilk harflerini büyük yapınız.(diğer harflereb dokunmayın, üyükse büyük,
        küçükse küçük kalsın).

        Örnek
        makeTitle("Bu bir başlıktır")
        Bu Bir Başlıktır

        makeTitle("tüm ilk harfler büyük olacak")
        Tüm İlk Harfler Büyük Olacak
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen bir metin giriniz:");
        String metin = scan.nextLine();

        String[] harfler = metin.split("");
        System.out.println(Arrays.toString(harfler));

        String yeniMetin = "";

        for (int i=0;i< harfler.length; i++){

            if (harfler[i].contains(" ")){

                yeniMetin+=harfler[i];
                yeniMetin+=harfler[i+1].toUpperCase();
                i++;
            }
            else {
                yeniMetin+=harfler[i];
            }

        }
        if (!Character.isUpperCase(yeniMetin.charAt(0))){
            System.out.println(yeniMetin.substring(0, 1).toUpperCase()+yeniMetin.substring(1));
        }
        else {
            System.out.println(yeniMetin);
        }
    }
}
