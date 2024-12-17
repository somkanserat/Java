package calisma08_StringManipulation;

public class C01_substring {

    public static void main(String[] args) {

        String str = "Java gün geçtikçe güzelleşiyor";
        System.out.println(str.length()); //30
        System.out.println(str.charAt(19)); // ü - bu harfi charAt kullanarak, büyük yazdıramayız.
                                            // char değerlerde String metotları çalışmaz.

        System.out.println(str.substring(19,20).toUpperCase()); //Ü --> 19'dan 20'ye kadar gidecek ve harfi büyültecek

        //10.karakterden başla, sona kadar yazdır.
        System.out.println(str.substring(10)); //eçtikçe güzelleşiyor

        //10.karakter ile 10. index farklıdır. Index 0'dan başladığı için, 10.karakter, 9.indexteki karakterdir.

        //ilk kelime hariç kalanı yazdır.
        System.out.println(str.substring(5)); //gün geçtikçe güzelleşiyor

        //son 6 karakteri yazdır.
        System.out.println(str.substring(str.length()-6)); //eşiyor

        //son harfi yazdır.
        System.out.println(str.substring(str.length()-1)); //r
        System.out.println(str.substring(29));              //r

        System.out.println(" ");    //boşluk çıktısı
        System.out.println(str.substring(str.length())); //hiçlik çıktısı
        //System.out.println(str.substring(str.length()+1)); //StringIndexOutOfBoundsExpection
        //System.out.println(str.substring(5,2)); //5'ten 'ye kadar gidilmediği için hata verdi.

        //ilk 10 karakter yazdırın.
        System.out.println(str.substring(0,10)); //Java gün g

        System.out.println(str.substring(12,12));
    }
}
