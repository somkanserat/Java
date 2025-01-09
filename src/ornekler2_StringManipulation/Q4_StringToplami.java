package ornekler2_StringManipulation;

public class Q4_StringToplami {

    public static void main(String[] args) {

        /*
            String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
            String  str 1= %13.99
            String str 2= %10.55
         */

        String str1 = "%13.99";
        String str2 = "%10.55";

        //öncelikle sayı dışında olan karakterlerden kurtulduk.
        str1 = str1.replaceAll("\\%","");
        str2 = str2.replaceAll("\\%","");

        //şimdi string'i sayıya çevirelim.
        double sayi1 = Double.parseDouble(str1);
        double sayi2 = Double.parseDouble(str2);
        System.out.println("Toplam:"+(sayi1+sayi2));



    }
}
