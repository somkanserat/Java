package ornekler2_StringManipulation;

import java.util.Scanner;

public class Q13_IsimlerinTekMiCiftMiKontrolu {

    public static void main(String[] args) {

        /*
            Q13 -name1 ve name2 degiskenlerini olusturun.
            name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
            name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik"
            yazdirinan bir method oluşturun
                  e.g:
                 name1= mehmet
                 name2= ahmet
                 Print ==> mehahmetmet
         */
        Scanner input = new Scanner(System.in);

        String name1 = "MAHMUT";
        String name2 = "ahmet";

        if (name1.length()%2==0){

            System.out.println(
                    name1.substring(0,name1.length()/2)+
                            name2+
                            name1.substring(name1.length()/2)
            );
        }
        else {
            tekKarakter(name1);

        }

    }

    public static void tekKarakter(String name1){
        System.out.println(name1+" cift sayili olmadigi icin ortasina yerlestiremedik");
    }


}
