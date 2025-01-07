package calisma36_mapsMetotlari;

import java.util.Map;
import java.util.TreeMap;

public class P04_mapsMetotlari {

    public static void main(String[] args) {

        Map<String,Integer> map = new TreeMap<>();

        map.put("W",10);
        map.put("I",10);
        map.put("S",10);
        map.put("E",10);
        System.out.println("İlk map:"+map); //İlk map:{E=10, I=10, S=10, W=10}

        map.replace("I",60);
        System.out.println(map); //{E=10, I=60, S=10, W=10}

        map.put("S",30);
        // var olan key'lerde put ile replace arasında bir fark yoktur
        System.out.println(map); //{E=10, I=60, S=30, W=10}

        map.replace("E",10,120);
        System.out.println(map); //{E=120, I=60, S=30, W=10}

        System.out.println(map.getOrDefault("X", 500)); //500

        System.out.println(map.remove("S")); //30 -> S'nin silinen değerini verdi
        System.out.println(map); //{E=120, I=60, W=10}

    }
}
