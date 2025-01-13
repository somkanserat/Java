package ornekler7;

import java.util.Scanner;

public class Q3_SiraliHarfBulma {

    /*43----
    Girilen kelimedeki alfabeye göre ard arda gelmeyen harfleri bulunuz. (İngilizce alfabeye göre).
    Eğer herhangi atlanan bir harf yoksa "Sıralı Harfler" yazdıralım.

    Örnekler
    kayipHarfler("abdefg")
    Çıktı : c

    kayipHarfler("mnopqs")
    Çıktı : r

    kayipHarfler("abcdefgh")
    Çıktı : Sıralı Harfler

    ilk örnekte :  /// b harfinden sonra c gelmemiş
    ikinci örnekte : /// p harfinden sonra r gelmemiş
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] alfabe = {"a","b","c","d","e","f","g","h",
                "i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        System.out.print("Sıralı harfleri giriniz:");
        String metin = scan.next(); //bc

        int sayac=0;

        for (int i=0; i<alfabe.length;i++){

            if (metin.substring(0,1).equals(alfabe[i])){ //i=0 -> b==a F i=1 -> b==b T

                for (int j=0;j<metin.length();j++){

                    if (metin.substring(j,j+1).equals(alfabe[i])){ // j=1 -> b==b T / j=2-> c=c T

                        sayac++;//+1 / +1 =2
                        if (sayac == metin.length()){ // 2 == 2
                            System.out.println("Sıralı harfler");
                            break;
                        }
                        i++;
                    }
                    else {
                        System.out.println(metin.charAt(j-1)+" harfinden sonra "+alfabe[i]+" gelmelidir.");
                        break;
                    }
                }
            }
        }
    }
}
