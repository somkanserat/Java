package ornekler3_For_While_Ifelse_StringManipulation;

import java.util.Scanner;

public class Q6_SesliHarfKontrolu {

    public static void main(String[] args) {

        /*6----
            Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
            değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

            Sesli harfler: a,e,i,o,u

            Test Data:
            a
            Beklenen Çıktı:
            a harfi sesli harfdir.

            Test Data:
            d
            Beklenen Çıktı:
            d harfi sesiz harftir.

            Test Data:
            we  yada %
            Beklenen Çıktı:
            Yanlis karakter girdiniz!

    */
        Scanner scan = new Scanner(System.in);

        String[] sesliHarf = {"a","e","i","o","u"};

        System.out.print("Lütfen bir harf giriniz:");
        String arananHarf = scan.next().toLowerCase();


        if (arananHarf.length()==1 && Character.isLetter(arananHarf.charAt(0)) ){

            for (int i=0; i<=sesliHarf.length-1;i++){

                if (sesliHarf[i].equals(arananHarf)){
                    System.out.print(sesliHarf[i]+" harfi, sesli harftir.");
                    break;
                }
                else {
                    System.out.println(arananHarf+" harfi sessiz harftir.");
                    break;
                }
            }
        }
        else {
            System.out.println("Yanlış değer girdiniz.");
        }
    }
}
