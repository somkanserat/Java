package calisma03_dataCasting_WrapperClasses;

public class C06_WrapperClasses {

    public static void main(String[] args) {

        String str = "Java Candır";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        int sayi = 20;

        /*
        primitive'lerin hazır metotları olmaz. Java, primitive data türlerinin bazı hazır metotları kullanabilmeleri
        için aynı isimlerde Wrapper Class oluşturmuştur.

        boolean, char, byte, short, int, long, float, double
        Boolean, Character, Byte, Short, Integer, Long, Float, Double
         */

        byte byt1 = 24;

        int sayi1 = byt1; //Auto Widening(Otomatik genişletme)

        //short shr1 = (short)sayi1; //Explicit Narrowing(Zorla Daraltma)

        // sayi barindiran primitive data türleri arasında casting mümkün
        // aynı isimdeki primitive ile wrapper classlar arasında geçiş mümkündür.
        // ANCAK farklı wrapper classları ya da farklı isimdeki bir primitive ile Wrapper Class arasında casting mümkün
        // değildir.

        int sayi2 = 45;
        Integer sayi3 = sayi2;

        Boolean bl1 = true;
        boolean bl2 = bl1;

        Integer sayi4 = 45;
        //Double sayi5 = sayi4; //Double <-- Integer(X)

        int sayi7 = sayi4; //int<--Integer(Yapılır)

        //short sayi8 = sayi4; // short <-- Integer(X)


    }

}
