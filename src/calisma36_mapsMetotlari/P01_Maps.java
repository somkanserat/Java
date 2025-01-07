package calisma36_mapsMetotlari;

import java.util.HashMap;
import java.util.Map;

public class P01_Maps {

    //Soru : Verilen bir array’de kullanilan sayilari
    //   ve kacar defa kullanildigini yazdirin.
    // Input : {1,2,4,4,5,3,4,1,5,1,4,2,4,1}
    // output :
    // 1 kullanimi : 4 adet
    // 2 kullanimi : 2 adet
    // 3 kullanimi : 1 adet
    // 4 kullanimi : 5 adet
    // 5 kullanimi : 2 adet

    public static void main(String[] args) {

        Map<Integer,Integer> kullanimSayilariMap = new HashMap<>();

        int[] arr = {1,2,4,4,5,3,4,1,5,1,4,2,4,1};

        System.out.println(kullanimSayilariMap);

        for (int each : arr){
            //eğer baktığı eleman map'de yoksa ekleyecek ve value'sunu 1 yapacak
            if(!kullanimSayilariMap.containsKey(each)){
                kullanimSayilariMap.put(each,1);
            }else{
                //eğer eleman varsa onun da value değerini bir arttırsın
                //int oldValue=kullanimSayilariMap.get(each);
                kullanimSayilariMap.put(each,kullanimSayilariMap.get(each)+1);
            }
        }
        System.out.println(kullanimSayilariMap);
    }
}

