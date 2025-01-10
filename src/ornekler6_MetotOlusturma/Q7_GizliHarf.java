package ornekler6_MetotOlusturma;

import java.util.Scanner;

public class Q7_GizliHarf {

    /*37-----
        Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.

        Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
        s -> 5
        a -> 4
        e -> 3
        i -> 1
        o -> 0

        Test data
        hackerDili("javayı severim")
        j4v4yı 53v3r1m

        İpucu harfleri değiştirin ve ekrana yazdırın.
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir metin giriniz:");
        String metin = scan.nextLine().toLowerCase();


        System.out.println(hackerDili(metin));

    }

    public static String hackerDili(String metin){

        for (int i=0; i<metin.length()-1;i++){

            if (metin.contains("s")) {
                metin=metin.replaceAll("s","5");
            }
            if (metin.contains("a")) {
                metin=metin.replaceAll("a","4");
            }
            if (metin.contains("e")) {
                metin=metin.replaceAll("e", "3");
            }
            if (metin.contains("i")) {
                metin=metin.replaceAll("i","1");
            }
            if (metin.contains("o")) {
                metin=metin.replaceAll("o","0");
            }
        }
        return metin;
    }
}
