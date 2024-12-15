package calisma03_dataCasting_WrapperClasses;

public class C05_CharDataTuruileCasting {

    public static void main(String[] args) {

        /*
        Char data türü özeldir. Matematiksel işlemlerde kullanılırsa, ASCII Table'deki değerleri ile işlem yapar.

        Char data türündeki değerler ve variable'ler <,> gibi math. işlemlerde kullanılabilir. Bu durumda Java
        ASCII değerlerine bakar.
         */

        String str1 = "Java";
        String str2 = " Candir";
        System.out.println( str1 + str2); //Java Candır

        char chr1 = 'a';
        char chr2 = 'b';
        char chr3 = 'c';

        System.out.println(chr1 + chr2 + chr3); //97+98+98 = 294(ASCI TABLEDEN KONTROL EDEBİLİRSİN)

        int sayi1 = 'c';
        System.out.println("Sayi1'in değeri: " +sayi1); //99 --> İnt tanımlandığı için, sayısal ifadeyi çıkarttı.

        System.out.println('a' < 'e'); //97 < 101 --> true çıktısı alınır.

        System.out.println('g' < 't');

        char verilenharf = 'S';
        //verilen harften sonraki 3 harfi yazdır.
        System.out.println( (char) (verilenharf + 1)); //T. 83+1 = 84(char eklemezsek matematiksel ifadeyi yazardı)
        System.out.println( (char) (verilenharf + 2)); //U
        System.out.println( (char) (verilenharf + 3)); //V
    }

}
