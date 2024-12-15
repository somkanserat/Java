package calisma03_dataCasting_WrapperClasses;

public class C02_ExplicitNarrowing {

    public static void main(String[] args) {

        /*
            1-Daha dar kapsamlı bir değeri, daha geniş kapsamlı variable'a atamak istersek;
              Java bu işlemi otomatik yapar, buna Auto-widening denir.

            2- Daha geniş kapsamlı bir degeri, daha dar kapsamli bir variable'a atamak istersek;
               Java bu işlemi otomatik olarak yapmaz. Bizden sorumluluk almamızı bekler. Sorumluluk almak için
               degerin onune () içinde cevrimek istedigimiz data türünü yazarız. Bu işleme

        */



        char chr = 'a';
        byte byt = 24;
        short shrt = 23;
        int sayiInt = 30;
        long lng = 40;
        float flt = 3.5F;
        double dbl = 4.5;

        //Compile time'da java degerlerle ilgilenmez, data türlerini kontrol eder.
        //Bu yüzden java, alt degerdeki değişken türüne atayamaz. Bunu kabul ettirmek için türün önüne
        //parantez içine dönüştürülecek tür yazılır.

        byt = (byte)shrt;
        byt = (byte) sayiInt;
        byt = (byte) lng; // 40
        byt = (byte)flt; // 3.5F
        byt = (byte)dbl; // 4.5

        shrt = byt;
        shrt = (short) sayiInt;
        shrt = (short) lng;
        shrt = (short) flt;
        shrt = (short)dbl;

        sayiInt = byt;
        sayiInt = shrt;
        sayiInt = (int) lng;
        sayiInt = (int) flt;
        sayiInt = (int) dbl;

        lng = byt;
        lng = shrt;
        lng = sayiInt;
        lng = (long) flt;
        lng = (long) dbl;

        flt = byt;
        flt = shrt;
        flt = sayiInt;
        flt = lng;
        flt = (float) dbl;

        dbl = byt;
        dbl = shrt;
        dbl = sayiInt;
        dbl = lng;
        dbl = flt;

    }
}
