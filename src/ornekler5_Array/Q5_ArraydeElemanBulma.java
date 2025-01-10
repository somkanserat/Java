package ornekler5_Array;

import java.util.Scanner;

public class Q5_ArraydeElemanBulma {

    /*
        Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.

        Array: [12,15,43,23,56,76,78,90,77,43]

        Aranan değer:56

        Beklenen Çıktı:
        56 sayısı arrayin 4. elemanı
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] array = {12,15,43,23,56,76,78,90,77,43};

        System.out.print("Aranacak sayıyı girin:");
        int aranacakSayi = scan.nextInt();

        boolean x = false;

        for (int i=0; i<array.length; i++){

            if (aranacakSayi == array[i]){
                System.out.println(aranacakSayi+"'nın index'i: "+i);
                x = true;
                break;
            }
        }
        if (! x){
            System.out.println(aranacakSayi+", arrayde bulunmamaktadır.");
        }

    }

}
