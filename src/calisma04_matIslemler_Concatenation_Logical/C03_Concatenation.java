package calisma04_matIslemler_Concatenation_Logical;

public class C03_Concatenation {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Candır";
        String str3 = " ";
        String str4 = "";

        int a=2;
        int b=3;

        System.out.println(str1+str3+str2+str3+str4+a+b); //Java Candır 23
        System.out.println(str1+str3+str2+str3+str4+(a+b)); //Java Candır 5

        int TCKN = 111111111;
        System.out.println(TCKN+str4); //string olur. str4(hiçlik) eklediğimiz için, int değeri, stringe döndü

        //Bir kaç variable System.out.println ile yazdırılmak istenilince concatenaton yapılır. Bu işlem yapılırken
        //matematiksel işlem önceliğine dikkat etmek şartıyla String bir değer var ise string diğer değerleri
        //string'e çevirerek concat eder.
    }
}
