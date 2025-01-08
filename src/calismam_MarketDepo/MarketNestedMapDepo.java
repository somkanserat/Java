package calismam_MarketDepo;

import java.util.HashMap;
import java.util.Map;

public class MarketNestedMapDepo {

    // Ürünlerin Barkod no'su olacak, barkod numarasına göre bize
    // ürün bilgisi getirecek --> ürün ismi, ürün fiyatı, stok miktarı

    protected static Map< Integer, Map<String,String> > urunMap = new HashMap<>();

    static {
        Map<String,String> urun1 = new HashMap<>();
        urun1.put("Ürün İsmi","Çikolata");
        urun1.put("Ürün Fiyatı","30");
        urun1.put("Ürün Stok Miktarı","85");
        urunMap.put(1,urun1);

        Map<String,String> urun2 = new HashMap<>();
        urun2.put("Ürün İsmi","Un");
        urun2.put("Ürün Fiyatı","65");
        urun2.put("Ürün Stok Miktarı","40");
        urunMap.put(2,urun2);

        Map<String,String> urun3 = new HashMap<>();
        urun3.put("Ürün İsmi","Kola");
        urun3.put("Ürün Fiyatı","60");
        urun3.put("Ürün Stok Miktarı","80");
        urunMap.put(3,urun3);

        Map<String,String> urun4 = new HashMap<>();
        urun4.put("Ürün İsmi","Makarna");
        urun4.put("Ürün Fiyatı","35");
        urun4.put("Ürün Stok Miktarı","110");
        urunMap.put(4,urun4);
    }


}
