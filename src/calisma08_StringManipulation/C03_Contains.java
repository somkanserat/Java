package calisma08_StringManipulation;

public class C03_Contains {

    public static void main(String[] args) {

       //Verilen bir string variable içinde, başka bir string variable olup olmadığını kontrol eder.
       //Kontrol edip, sonuç olarak kaç tane olduğunun bilgisini vermez. Varsa "true", yoksa "false" bilgisi verir.
       //Yani boolean sonuç döner.
       //Contains, case sensitive'dir. Buna göre arama yapar.
       //Parametre olarak sadece string değeri kabul eder.

       String str = "Ne güzel 1 gün";
       int sayi=1;

        System.out.println(str.contains("e")); //true
        System.out.println(str.contains("ne")); //false
        System.out.println(str.contains("güzel")); //true
        System.out.println(str.contains("üz")); //true

        System.out.println(str.contains(1+"")); //contains metodu string dışında parametre kabul etmez. Bu nedenle
        //int olan 1 değerini string'e çevirmek gerekir. yanına string bir hiçlik koyduğumuzda bu bizim içerdeki tüm
        //değerlerin string algılanmasını sağlar.
        System.out.println(str.contains("1"));
        System.out.println(str.contains(sayi+""));


        System.out.println(str.contains("Ne  güze")); //false çünkü fazladan boşluk var




    }
}
