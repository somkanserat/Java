package calisma35_maps_nestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C07_DahaKarmasikNestedMap {

    public static void main(String[] args) {

        /*
                asagidaki rezervasyon map'ini olusturun
           {
                "firstname" : "Ahmet",
                "lastname" : "Bulut",
                "totalprice" : 500,
                "depositpaid" : false,
                "bookingdates" : {
                       "checkin" : "2024-07-21",
                       "checkout" : "2024-08-10"
                          },
                "additionalneeds" : "wi-fi"
            }
         */

        Map<String, Object> rezervasyonMap = new HashMap<>();

        //once içerdeki innermap'i oluşturalım
        Map<String,String> bookingdatesValueMap = new HashMap<>();
        bookingdatesValueMap.put("checkin","2024-07-21");
        bookingdatesValueMap.put("checkout","2024-08-10");

        //ana rezervasyon map'ine tüm değerleri ekleyelim
        rezervasyonMap.put("firstname","Ahmet");
        rezervasyonMap.put("lastname","Bulut");
        rezervasyonMap.put("totalprice",500);
        rezervasyonMap.put("depositpaid",false);
        rezervasyonMap.put("bookingdates",bookingdatesValueMap);
        rezervasyonMap.put("additionalneeds","wi-fi");

        System.out.println(rezervasyonMap);
        /*
            {
            firstname=Ahmet,
            additionalneeds=wi-fi,

            bookingdates=  {
                checkin=2024-07-21,
                checkout=2024-08-10
              },

            totalprice=500,
            depositpaid=false,
            lastname=Bulut}
         */

        // rezervasyonda fiyat 300'den büyük mü?

        int fiyat = (Integer) rezervasyonMap.get("totalprice");

        System.out.println(fiyat>300); // true

        // rezervasyonda fiyat 400'den büyük ise %10 indirim yapın

        if (fiyat > 400){

            fiyat=fiyat*90/100;
            rezervasyonMap.put("totalprice", fiyat);
        }
        System.out.println(rezervasyonMap);
        /*
            {firstname=Ahmet,
            additionalneeds=wi-fi,
            bookingdates={checkin=2024-07-21,
            checkout=2024-08-10},
            totalprice=450,
            depositpaid=false,
            lastname=Bulut}
         */

        // Kullanıcının ismi A ile başlıyorsa
        // fiyatta %10 indirim yap

        if ( ((String)rezervasyonMap.get("firstname")).startsWith("A")  ){

            fiyat=fiyat*90/100;
            rezervasyonMap.put("totalprice",fiyat);
        }
        System.out.println(rezervasyonMap);
        /*
            {firstname=Ahmet,
            additionalneeds=wi-fi,
            bookingdates={checkin=2024-07-21,
            checkout=2024-08-10},
            totalprice=405,
            depositpaid=false,
            lastname=Bulut}
         */

        // additionalneeds "breakfast" değilse 20$ daha indirim yapın.

        if ( !((String)rezervasyonMap.get("additionalneeds")).equalsIgnoreCase("breakfast")  ){

            fiyat=fiyat-20;
            rezervasyonMap.put("totalprice",fiyat);
        }
        System.out.println(rezervasyonMap);

        /*
            {firstname=Ahmet,
            additionalneeds=wi-fi,
            bookingdates={checkin=2024-07-21,
            checkout=2024-08-10},
            totalprice=385,
            depositpaid=false,
            lastname=Bulut}
         */

        // checkin tarihini yazdırın

        System.out.println(rezervasyonMap.get("checkin")); //null
        // rezervasyon map'inin içinde direkt checkin yoktur.
        // checkin "bookingdates" key'ine ait value olan map'in içinde

        System.out.println( ( (Map<String, String>) rezervasyonMap.get("bookingdates") ).get("checkin")  ); // 2024-07-21
        //System.out.println( ( (Map<String, String>) rezervasyonMap.get("bookingdates") ).get("checkout") ); // 2024-08-10

        System.out.println(((Map<?, ?>) rezervasyonMap.get("bookingdates")).get("checkout")); // 2024-08-10

    }
}
