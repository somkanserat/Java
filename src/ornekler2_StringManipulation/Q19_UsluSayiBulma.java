package ornekler2_StringManipulation;

import java.util.Scanner;

public class Q19_UsluSayiBulma {

    /*
    powerOfThree isminde bir Parametre olarak int Return tipi boolean method create edin.
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını kontrol edin. 3'ün üssü(kuvveti) ise true, değilse false return edin.
        Örnek 1:
        input: 27
        output: true
        Örnek 2:
        Girdi: 0
        Çıktı: false

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı değeri giriniz:");
        int sayi = input.nextInt();
        System.out.println(powerOfThree(sayi));

    }

    public static boolean powerOfThree(int sayi){

        boolean b = false;
        int carpim = 1;
        for (int i = 1; i < sayi; i++) { //num/3 olmadan direk num da yazılabilir
            carpim *= 3;

            if (carpim == sayi) {
                b = true;
                break;
            }

        }
        return b;
    }

    /*
        public static void main(String[] args) {

            Scanner scanner =new Scanner(System.in);
            System.out.println("Lütfen bir tamsayi giriniz");
            int sayi= scanner.nextInt();

            System.out.println(powerOfThree(sayi));
        }
        public static boolean powerOfThree(int sayi) {

            if (sayi <= 0) {
                return false;
            }

        while (sayi % 3 == 0) {
            sayi /= 3;
            }
            return sayi == 1;
    }
     */
}


