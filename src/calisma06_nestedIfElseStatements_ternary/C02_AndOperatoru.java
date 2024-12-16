package calisma06_nestedIfElseStatements_ternary;

public class C02_AndOperatoru {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        //&& operatorü sonuç odaklıdır. Gerekli bilgiyi aldıktan sonra diğer işlemleri yapmaz.

        System.out.println(a < b && a % 2 == 0 && b < 0 && (b & 3) == 0 && b > a + 5); //false

        //& operatörü işlem odaklıdır.Parantez içindeki tüm işlemleri yapar.
        System.out.println(a < b & a % 2 == 0 & b < 0 & (b & 3) == 0 & b > a + 5);  //false

        // EGER And ile birleştirilen işlemlerde atama yapılıyorsa, && bazı işlemleri yapmadığı için atamalar
        // yapılmamış olabilir.



    }
}
