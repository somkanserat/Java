package calisma36_mapsMetotlari;

import java.util.*;

public class P03_kullanimSayilari {

    // Verilen harfler listesinde
    // herbir harfi ve kacar defa kullanildigini bir map olarak yazdirin

    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>(Arrays.asList("a","b","b","z","k","z","k","b","k"));

        // a=1, b=3, z=2, k=3

        Map<String,Integer> kullanimSayilariMap = new TreeMap<>();

        for (String each : harfler){

            //varsa
            if (kullanimSayilariMap.containsKey(each)){
                kullanimSayilariMap.put(each,kullanimSayilariMap.get(each)+1);
            }
            //yoksa
            kullanimSayilariMap.putIfAbsent(each,1); // .putIfAbsent -> yoksa ekle
        }
        System.out.println(kullanimSayilariMap); //{a=1, b=3, k=3, z=2}
    }
}
