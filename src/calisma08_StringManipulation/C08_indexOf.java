package calisma08_StringManipulation;

public class C08_indexOf {

    public static void main(String[] args) {

        //indexof metodu tek parametre ile yazılırsa, o parametrenin ilk bulunduğu index'i
        //iki parametre olarak yazılırsa da verilen indexten sonraki ilk kullanımın indexini verir.(DİKKAT)

        String str = "Çok çalışmam gerekiyor çok";

        //a harfi str'da ilk olarak hangi indexte
        System.out.println(str.indexOf('a')); //5
        //çalış kelimesi hangi indexten itibaren başlıyor
        System.out.println(str.indexOf("çalış")); //4 --> nerden itibaren başlıyorsa o değeri verir

        //5.indexten sonra aradığımda ilk o harfi hangi indextedir.
        System.out.println(str.indexOf('o',5)); //20
        //DİKKAT: Aramaya verilen indexten başlar fakat index yazarken baştan sayar.

        //metin içinde olmayan bir harf ya da kelime aranırsa
        System.out.println(str.indexOf('x'));
        System.out.println(str.indexOf("murat"));
        //sonuç -1 çıkmışsa, aranan şey metinde yoktur.

        /*

        //ÖDEV: Kullanıcıdan bir metin alıp, metinde birden fazla a harfi var ise, a harfinin hangi indexte olduğunu yazdırın.
        //Bir tane varsa "bir tane" var yazdırın.

         */



    }
}
