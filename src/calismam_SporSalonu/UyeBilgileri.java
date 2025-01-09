package calismam_SporSalonu;

import java.util.HashMap;
import java.util.Map;

public class UyeBilgileri {

    public static Map< Integer, Map<String,String> > uyeler = new HashMap<>();

    static {

        Map<String,String> uye1 = new HashMap<>();
        uye1.put("Üye İsmi","Serat");
        uye1.put("Üye Soyismi","Somkan");
        uye1.put("Üyelik Yılı","2020");
        uyeler.put(1,uye1);


    }

}
