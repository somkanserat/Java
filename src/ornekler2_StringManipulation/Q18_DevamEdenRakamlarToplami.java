package ornekler2_StringManipulation;

import java.util.Scanner;

public class Q18_DevamEdenRakamlarToplami {

    public static void main(String[] args) {
        /*
        addDigits isminde bir method create ediniz.
        Parametresi int
        Return tipi de int
        Pozitif int değerler ver ve en son sonuç tek basamaklı çıkana kadar basamakları birbiriyle topla.
        Tek basamaklı çıktığında, return etsin
        Örnek1:
        Girdi 38
        Çıktı: 2
        Açıklama: İşlemler şöyle olacak: 3 + 8 = 11, 1 + 1 = 2.
                     2 , tek basamaklı olduğundan, bunu döndürün.
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Pozitif bir tam sayı değeri giriniz:");
        int sayi = input.nextInt();

        addDigit(sayi);
    }
    public static void addDigit(int sayi){

        while (sayi>=10){
            int rakamlarToplami = 0;
            int basamakSayisi = (sayi +"").length();

            for (int i=1; i<=basamakSayisi; i++){
                rakamlarToplami+=sayi%10;
                sayi/=10;
            }
            sayi=rakamlarToplami;
        }
        System.out.println("Çıktı:"+sayi);
    }
}

