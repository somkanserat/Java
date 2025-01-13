package ornekler7;

import java.util.Scanner;

public class Q7_OrtadakiHarfiBulma {

    /*47----
    Ortadaki harfi alabileceğimiz bir program yazın.
    Eğer harf sayısı 2 nin katına eşitse,
    ortadaki 2 harfi alın, diğer durumda ortadaki 1 harfi alın.

    Examples

    ortadakiHarf("test")
    Çıktı : es
    ortadakiHarf("testing")
    Çıktı : t
    ortadakiHarf("middle")
    Çıktı : dd
    ortadakiHarf("A")
    Çıktı : A
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir cümle veya kelime giriniz:");
        String cumle = scan.nextLine();
        ortadakiHarf(cumle);
    }
    public static void ortadakiHarf(String cumle){

        if (cumle.length()%2==1){
            System.out.println(cumle.substring(cumle.length()/2,cumle.length()/2+1));
        }
        else {
            System.out.println(cumle.substring(cumle.length()/2-1,cumle.length()/2+1));
        }
    }
}
