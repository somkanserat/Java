package calisma34_maps;

import java.util.*;

public class MapDepo {

    protected static Map<Integer,String> ogrenciMap = new HashMap<>();

    static { //önce çalışır.

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");
    }

    public static void isimdenListeYazdir(String istenenIsim){
        // 1- ismi görebilmek için value'lere ihtiyacımız var.

        Collection<String> valueCollection = ogrenciMap.values();

        System.out.println("Ismi "+istenenIsim+" olan öğrenci listesi:");

        // 2- her bir value'yu elden geçirip, bilgileri kontrol etmek için for each loop kullanalım

        for (String eachValue : valueCollection){
            // ornegin each bize "Ali-Can-11-H-MF" getirdi

            // 3- value içindeki isim bilgisine ulaşmak için split edelim.

            String[] eachValueArr = eachValue.split("-");
            // [Ali, Can, 11, H, MF]

            // 4- ARTIK istediğimiz bilgiye ulaşabiliriz.
            // istenilen görevi yerine getirelim.

            // verilen isme sahip olan ogrencilerin
            // isim, soyisim, sınıf ve şubeleri yazdırın

            if (eachValueArr[0].equalsIgnoreCase(istenenIsim)){

                System.out.println(
                        eachValueArr[0]+" " +
                                eachValueArr[1]+" " +
                                eachValueArr[2]+" " +
                                eachValueArr[3]
                );
            }
        }
    }

    public static void sinifSubeListesiYazdir(int istenenSinif, String istenenSube){

        System.out.println(istenenSinif+"/"+istenenSube+" sınıfı öğrenci listesi:");

        // 1- sınıf ve subeyi görebilmek için value'lere ihtiyacımız var.

        Collection<String> valueCollection = ogrenciMap.values();

        // 2- her bir value'yu elden geçirip, bilgileri kontrol etmek için for each loop kullanalım

        for (String eachValue : valueCollection){
            // ornegin each bize "Ali-Can-11-H-MF" getirdi
            // 3- value içindeki isim bilgisine ulaşmak için split edelim.

            String[] eachValueArr = eachValue.split("-");
            // [Ali, Can, 11, H, MF]

            // 4- ARTIK istediğimiz bilgiye ulaşabiliriz.
            // istenilen görevi yerine getirelim.

            // sınıf ve şubedeki tüm öğrencilerin isim ve soyisimlerini yazdırın.

            if ((istenenSinif+"").equalsIgnoreCase(eachValueArr[2])
                    && istenenSube.equalsIgnoreCase(eachValueArr[3])){

                System.out.println(eachValueArr[0] + " " + eachValueArr[1]);
            }
        }
    }

    public static void soyisimdenListeYazdir(String istenenSoyisim) {

        Collection<String> valueCollection = ogrenciMap.values();
        System.out.println("Soyismi " + istenenSoyisim + " olan ogrenci listesi");

        for (String eachValue : valueCollection) {
            // ornegin each bize "Ali-Can-11-H-MF" getirdi

            // 3- value icindeki isim bilgisine ulasmak icin split edelim

            String[] eachValueArr = eachValue.split("-");
            //  [Ali, Can, 11, H, MF]

            // 4- ARTIK istedigimiz bilgiye ulasabiliriz
            //    bizden istenen gorevi yapalim

            // Verilen soyisme sahip ogrencilerin
            // Isim, sinif ve subelerini liste olarak yazdirin
            if (eachValueArr[1].equalsIgnoreCase(istenenSoyisim)) {
                System.out.println(
                        eachValueArr[0] + " " +
                                eachValueArr[2] + " " +
                                eachValueArr[3]
                );
            }
        }
    }

    public static void bolumListesiYazdir(String istenenBolum){

        System.out.println(istenenBolum+" Bölümündeki Öğrenci Listesi:");

        // 1- Tum key'leri kaydedelim

        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        // 2- Her bir key'i ele almak için for each loop yapalım

        for (Integer eachKey : ogrenciKeySeti){

            //ornek eachKey : 101

            // foreach loop, her bir key'i bize getirecek
            // ama aradığımız bilgiler key'de değil, value'de

            String eachValue = ogrenciMap.get(eachKey); // Ali-Can-11-H-MF

            // 3- istenen bilgilere ulaşmak için eachValue'yu split edelim

            String[] eachValueArr = eachValue.split("-");
            // [Ali, Can, 11, H, MF]

            // 4- artık istenen bilgilere ulaşabiliyoruz
            //    verilen görevleri yapalım

            // verilen bolumdeki tum öğrencilerin
            // numara, isim, soyisim ve subelerini yazdırın

            if (eachValueArr[4].equalsIgnoreCase(istenenBolum)){

                System.out.println(
                        eachKey + " "+
                                eachValueArr[0]+" "+
                                eachValueArr[1]+" "+
                                eachValueArr[3]+" "
                );
            }
        }
    }

    public static void numaraAraligindakiOgrenciListesi(int basNo, int bitNo){

        System.out.println(basNo+" ile "+bitNo+" numaraları arasındaki öğrenci listesi:");
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        for (Integer eachKey : ogrenciKeySeti){

            //bu defa kontrol value'de değil, key'de

            if (eachKey >=basNo && eachKey<=bitNo){
                //isim ve soyisimlere ulaşmak için value'ya ihtiyac
                String eachValue = ogrenciMap.get(eachKey);

                //value'deki bilgilere ulaşmak için split yapmalıyız
                String[] eachValueArr = eachValue.split("-");

                System.out.println(
                        eachKey + " "+
                                eachValueArr[0]+" "+
                                eachValueArr[1]+" "
                );
            }
        }
    }

    public static void kullaniciyaYeniOgrenciOlusturma(){

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen öğrenci no giriniz:");
        int key = scan.nextInt();

        String value = "";
        scan.nextLine();

        System.out.print("Öğrenci ismi?");
        value+=scan.nextLine();
        value+="-";

        System.out.print("Öğrenci soyismi?");
        value+=scan.nextLine();
        value+="-";

        System.out.print("Öğrenci sınıfı?");
        value+=scan.nextLine();
        value+="-";

        System.out.print("Öğrenci şubesi?");
        value+=scan.nextLine().toUpperCase();
        value+="-";

        System.out.print("Öğrenci bölümü?");
        value+=scan.nextLine().toUpperCase();

        ogrenciMap.put(key,value);

    }

    public static void numaraIleSoyisimUpdate(int ogrenciNo, String yeniSoyisim) {

        // önce öğrencinin eski value'sunu alalım.

        String eskiValue = ogrenciMap.get(102); // "Veli-Cem-10-K-TM"

        // Value birleşik bilgilerden oluşur.
        // soyisme ulaşmak ve update etmek için eski value'yu split etmemiz gerekir.

        String[] eskiValueArr = eskiValue.split("-"); // [Veli, Cem, 10, K, TM]

        //artık atama yapılabilir.

        eskiValueArr[1]=yeniSoyisim; // [Veli, Kaya, 10, K, TM]

        String yeniValue = String.join("-",eskiValueArr); // "Veli-Kaya-10-K-TM"

        ogrenciMap.put(ogrenciNo,yeniValue);

        System.out.println(ogrenciMap);
    }

    public static void bolumGuncelle(String eskiBolum, String yeniBolum){

        //Tüm öğrencilerin key ve value'larını gözden geçirmemiz gerekiyor

        // 1- key'leri Set olarak kaydedelim.

        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        // 2- tüm key'leri elden geçirmek için for-each loop lazım

        for (Integer eachKey : ogrenciKeySeti){

            // biz key'leri elden geçiriyoruz ama bölüm bilgisi value'de
            // eachKey'i kullanarak eskiValue'yu kaydedelim

            String eskiValue = ogrenciMap.get(eachKey); //
            String[] eskiValueArr = eskiValue.split("-"); // [Veli, Cem, 10, K, TM]

            if (eskiValueArr[4].equalsIgnoreCase(eskiBolum)){

                eskiValueArr[4] = yeniBolum; // [Veli, Cem, 10, K, Say]
            }

            String yeniValue = String.join("-",eskiValueArr);
            ogrenciMap.put(eachKey,yeniValue);
        }
        System.out.println(ogrenciMap);
    }

    public static void yilSonuSinifArtir(){

        //update varsa, mutlaka key olmalı

        // 1-tüm key'leri kaydedin

        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        // 2- tüm key'leri gözden geçirmemiz lazım

        for (Integer eachKey : ogrenciKeySeti){

            // 3- sınıf update etmek için value'ye ihtiyacımız var

            String eachValue = ogrenciMap.get(eachKey);

            // 4- bilgilere ulaşmak ve update için split edelim

            String[] eachValueArr = eachValue.split("-"); // [Sevgi, Can, 10, K, MF]

            // 5- Array'de istenen update yapılır

            switch (eachValueArr[2]){

                case "9":
                    eachValueArr[2]="10";
                    break;
                case "10":
                    eachValueArr[2]="11";
                    break;
                case "11":
                    eachValueArr[2]="12";
                    break;
                case "12":
                    eachValueArr[2]="Mezun";
                    break;
            }

            // 6- arrey'de yapılan değişikliği kaydetmek için yeniValue'yu oluşturalım

            String yeniValue = String.join("-",eachValueArr);

            // 7- güncel value var, key = eachKey

            ogrenciMap.put(eachKey,yeniValue);
        }
    }
}
