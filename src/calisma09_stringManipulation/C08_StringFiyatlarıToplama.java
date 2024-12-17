package calisma09_stringManipulation;

public class C08_StringFiyatlarıToplama {

    public static void main(String[] args) {
        /*
             Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
                input1 : “15.30 €” , input2 : “11.45 €”
                output : 26.70 €
        */

        String fiyatStr1 = "15.30 €";
        String fiyatStr2 = "11.45 €";

        //sondaki para birimini dinamik olarak almak istersek
        //space'den sonraki kısım diyebiliriz
        //space'in index'ini bulalım.

        int spaceIndex = fiyatStr1.indexOf(" ");
        String paraBirimi = fiyatStr1.substring(spaceIndex+1);

        //System.out.println(fiyatStr1+fiyatStr2); //15.30 €11.40 €

        //parse() kullanabilmek için, önce digit olmayan her şeyi yok edelim.

        fiyatStr1 = fiyatStr1.replaceAll("\\D","");
        fiyatStr2 = fiyatStr2.replaceAll("\\D","");

        double fiyat1 = Double.parseDouble(fiyatStr1)/100;
        double fiyat2 = Double.parseDouble(fiyatStr2)/100;

        System.out.println("Fiyatların Toplamı:" +(fiyat1+fiyat2)+ " " +paraBirimi);
        /*

        ********İKİNCİ YOL**********
        //Sadece sayı kısmını al ve Double.parsedouble() kullan.

        fiyatStr1 = fiyatStr1.substring(0,5); //15.30(String)
        double fiyat1 = Double.parseDouble(fiyatStr1);
        System.out.println(fiyat1); //15.30(double)

        fiyatStr2 = fiyatStr2.substring(0,5); //11.45(String)
        double fiyat2 = Double.parseDouble(fiyatStr2);
        System.out.println(fiyat2); //11.45(double)

        double toplam = fiyat1+fiyat2;
        System.out.println(toplam);

         */
    }
}
