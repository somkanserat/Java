package calisma12_methodOverloding_WhileLoop;

public class P06_Soru {

    public static void main(String[] args) {

        /*
            While loop kullanarak verilen bir String’i terse cevirip,
            bu halini bize donduren bir method olusturun.
         */

        String str = "Java Candir";
        int a = str.length();
        int i=0;

        while (a>i){
            System.out.print(str.charAt(a-1));
            a--;
        }
    }
}
