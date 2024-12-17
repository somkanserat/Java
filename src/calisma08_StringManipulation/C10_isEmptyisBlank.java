package calisma08_StringManipulation;

public class C10_isEmptyisBlank {

    public static void main(String[] args) {

        /*

            isEmpty: verilen string'in içinin boş olup olmadığını kontrol eder.
                     hiçlikleri boş derken space ile boşluk bırakılırsa boş değil der.

            isBlank: isEmpty'den farklı olarak sadece hiçlik için değil
                     space ile bırakılan boşlukları da boş olarak kabul eder.
        */

        String str1 = "Java çok güzel";
        String str2 ="";
        String str3 ="       ";

        System.out.println(str1.isEmpty()); //false
        System.out.println(str2.isEmpty()); //true
        System.out.println(str3.isEmpty()); //false
        System.out.println("-----------------");
        System.out.println(str1.isBlank()); //false
        System.out.println(str2.isBlank()); //true
        System.out.println(str3.isBlank()); //true
    }
}
