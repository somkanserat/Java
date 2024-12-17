package calisma07_ternary_switchStatement_stringManipulations;

import java.util.Locale;

public class C07_StringManipulations {

    public static void main(String[] args) {

        String str = "Java Candir";

        //buyuk harfe çevirme

        System.out.println(str.toUpperCase()); //JAVA CANDİR

        System.out.println(str); //Java Candir --> kalıcı olarak değiştirmez.

        System.out.println(str.toLowerCase()); //java candir --> kalıcı olarak değiştirmez.

        //str'i küçük harfe çevir ve kalıcı olarak kaydet.
        //***NOT***Bir string'in değerini kalıcı olarak değiştirmek istiyorsak, atama yapmalıyız.

        str = str.toLowerCase();
        System.out.println(str);

        //Kalıcı olarak büyük harfe çevir.

        str = str.toUpperCase();
        System.out.println(str); //JAVA CANDIR
        System.out.println(str.toLowerCase()); //java candir
        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr")) ); //java candır(yazdırmadı)
    }
}
