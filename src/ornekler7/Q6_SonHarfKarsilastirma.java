package ornekler7;

import java.util.Scanner;

public class Q6_SonHarfKarsilastirma {

    /*46----
    Yazılan iki String'den ikincisi, birincisinin son harflerine eşitse, true, diğer durumda false dönderen bir program yazınız.

    Örnekler:
    kontrolEt("abc", "bc") ➞ true
    kontrolEt("abc", "d") ➞ false
    kontrolEt("samurai", "zi") ➞ false
    kontrolEt("feminine", "nine") ➞ true
    kontrolEt("convention", "tio") ➞ false
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir kelime girin:");
        String kelime = scan.next();
        System.out.print("Kontrol edilecek kelime:");
        String kontrolKelime = scan.next();

        if (kelime.endsWith(kontrolKelime)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
