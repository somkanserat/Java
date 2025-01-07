package calisma36_mapsMetotlari;

import java.util.TreeMap;

public class P05_TreeMapMetotlari {

    public static void main(String[] args) {

        /*
            Map<String,Integer> map = TreeMap<>();
            biz bu gösterimde objeyi treeMap yapmamıza rağmen
            data türü map seçildiği için
            bütün map özelliklerine ulaşabiliriz.

            Ama data türü TreeMap seçilirse
            sadece treeMap'e özgü  metotlar kullanılabilir.

         */

        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("H",40);
        treeMap.put("T",10);
        treeMap.put("M",50);
        treeMap.put("L",65);
        treeMap.put("C",45);
        treeMap.put("SS",25);

        System.out.println(treeMap); //{C=45, H=40, L=65, M=50, SS=25, T=10}
        //doğal sıralama yapar

        System.out.println(treeMap.firstKey()); //C
        System.out.println(treeMap.lastKey());  //T
        System.out.println(treeMap.firstEntry()); //C=45
        System.out.println(treeMap.lastEntry());  //T=10

        System.out.println(treeMap.tailMap("M")); // {M=50, SS=25, T=10}
        // verilen elemandan sonra doğru yazdır(verilen eleman dahil)

        System.out.println(treeMap.tailMap("L", true)); //{L=65, M=50, SS=25, T=10}
        // true ise başlangıcı dahil et
        System.out.println(treeMap.tailMap("L", false)); //{M=50, SS=25, T=10}
        // false ise başlangıcı dahil etme
        // yukardaki gibi default yazılırsa, true çalışır.

        System.out.println(treeMap.headMap("L")); //{C=45, H=40}
        // verilen elemandan öncekileri yazdırır.(verilen eleman dahil değil)
        System.out.println(treeMap.headMap("L", true)); // {C=45, H=40, L=65}
        // true ise verilen elemanı da dahil etti
        System.out.println(treeMap.headMap("L", false)); // {C=45, H=40}

        System.out.println(treeMap.higherEntry("H")); //L=65
        // kendinden büyük elementi getirir
        System.out.println(treeMap.ceilingEntry("T")); //H=40
        // kendinden küçük elementi getirir ??

        System.out.println(treeMap.descendingMap()); // {T=10, SS=25, M=50, L=65, H=40, C=45}
        //sıralamayı tersine çevirir
        System.out.println(treeMap.pollFirstEntry()); // C=45
        //en küçük değeri yazdırdı ve sildi
        System.out.println(treeMap); //{H=40, L=65, M=50, SS=25, T=10}
    }
}
