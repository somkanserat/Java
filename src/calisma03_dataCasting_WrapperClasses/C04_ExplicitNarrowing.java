package calisma03_dataCasting_WrapperClasses;

public class C04_ExplicitNarrowing {

    public static void main(String[] args) {
        /*

        Explicit narrowing yaptığımızda, daha kapsamlı bir degeri, daha kucuk kapsamlı bir variable'a atama yapıyoruz

        Deger variable'in sinirlari içinde ise explicit narrowing yaptıgımızda aynı degere sahip olur

        ANCAK eger deger variable'in sinirlarindan buyuk ise bu durumda deger farkli bir sonuca donusebilir.
        */


        int sayi1 = 43;
        int sayi2 = 130;
        int sayi3 = 150;
        int sayi4 = 262;
        int sayi5 = 520;

        double dbl1 = 34.1;
        double dbl2 = 45.92;

        byte byt = 25;

        sayi1 = (int)dbl1;
        System.out.println("34.1'in int'a cast edilmiş hali: " +sayi1);

        sayi1 = (int)dbl2;
        System.out.println("45.92'nin int'a cast edilmiş hali: " +sayi1); //45.92'nin int'a cast edilmiş hali:45

        sayi1 = 43;
        byt = (byte)sayi1;
        System.out.println("43'ün byte'a cast edilmiş hali : " +byt); //43'ün byte'a cast edilmiş hali : 43

        byt = (byte)sayi2;
        System.out.println("130'ün byte'a cast edilmiş hali : " +byt); //130'un byte'a cast edilmiş hali : -126. Çünkü 127'den sonra eksiye dönmekte

        byt = (byte)sayi2;
        System.out.println("130'ün byte'a cast edilmiş hali : " +byt); //150'nin byte'a cast edilmiş hali : -106

        byt = (byte)sayi4;
        System.out.println("262'ün byte'a cast edilmiş hali : " +byt); //262 nin byte'a cast edilmiş hali : 6

        byt = (byte)sayi5;
        System.out.println("520'ün byte'a cast edilmiş hali : " +byt); //520 nin byte'a cast edilmiş hali : 8

    }

}
