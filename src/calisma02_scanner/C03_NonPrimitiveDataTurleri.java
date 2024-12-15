package calisma02_scanner;

public class C03_NonPrimitiveDataTurleri {

    public static void main(String[] args) {

        String metin1 = "Java candir."; //Non Primitive variable, klastan oluşturulmuştur. Bu yüzden büyük harfle başlar.

        int sayi1 = 10;
        boolean bl = true;
        char chr = 'k';
        double dbl = 34.7;

        System.out.println(metin1.toUpperCase()); //Büyük harfe çevirdi.'JAVA CANDİR'
        System.out.println(metin1.toLowerCase()); //Küçük harfe çevirdi. 'java candir.'

        //indeksteki harfleri seçer. 0'dan başlar.

        System.out.println(metin1.charAt(0)); // J
        System.out.println(metin1.charAt(2)); // v
        System.out.println(metin1.charAt(6)); // a
        System.out.println(metin1.charAt(8)); // d
    }
}
