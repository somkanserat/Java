package calisma34_maps;

public class C08_NumaraIleSoyisimUpdate extends MapDepo {

    public static void main(String[] args) {

        // Öğrenci map'inde numarası ve yeni soyismi verilen öğrencinin
        // eski soyisminin yerine yeni soyismi kaydedin

        int ogrenciNo = 102;
        String yeniSoyisim = "Kaya";

        // önce öğrencinin eski value'sunu alalım.

        String eskiValue = ogrenciMap.get(ogrenciNo); // "Veli-Cem-10-K-TM"

        // Value birleşik bilgilerden oluşur.
        // soyisme ulaşmak ve update etmek için eski value'yu split etmemiz gerekir.

        String[] eskiValueArr = eskiValue.split("-"); // [Veli, Cem, 10, K, TM]

        //artık atama yapılabilir.

        eskiValueArr[1]=yeniSoyisim; // [Veli, Kaya, 10, K, TM]

        String yeniValue = String.join("-",eskiValueArr); // "Veli-Kaya-10-K-TM"

        ogrenciMap.put(ogrenciNo,yeniValue);

        System.out.println(ogrenciMap);

    }
}
