package calisma08_StringManipulation;

public class C05_StartsWith {

    public static void main(String[] args) {

        /*
            Bir string'in, başka bir string ile başlayıp başlamadığını kontrol eder. İki kullanımı vardır;
            ilkinde baştan bakar.
            ikinci kullanımda istediğiniz index'in istediğiniz bir string ile başlayıp başlamadığını kontrol eder.
         */

        String str = "Java Öğrenmek çok güzel, çok";

        System.out.println(str.startsWith("J")); //true --> j
        System.out.println(str.startsWith("Java")); //true --> Java
        System.out.println(str.startsWith("Java Öğrenmek çok güzel, çok")); //true --> Java Öğrenmek çok güzel, çok

        System.out.println(str.startsWith("Öğrenmek", 5)); //true --> 5.index, öğrenmek ile mi başlıyor?


    }
}
