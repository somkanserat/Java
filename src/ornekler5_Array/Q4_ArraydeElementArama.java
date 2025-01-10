package ornekler5_Array;

import java.util.Scanner;

public class Q4_ArraydeElementArama {

    /*
        Yazılan değerin array içerisinde arayan Java Kodu yazınız.

        Array: [1551,1223,1443,1267,1789,1023,2020]

        Aranan Değer:2020
        Beklenen Çıktı:True

        Aranan Değer:2010
        Beklenen Çıktı :False
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Aranacak sayıyı girin:");
        int aranacakSayi = scan.nextInt();

        int [] array = {1551,1223,1443,1267,1789,1023,2020};

        boolean found = false;

        for (int i=0; i<array.length;i++){

            if (aranacakSayi == array[i]){
                System.out.println(aranacakSayi+", array içerisinde var.");
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println(aranacakSayi+", array içerisinde bulunmamaktadır.");
        }
    }
}
