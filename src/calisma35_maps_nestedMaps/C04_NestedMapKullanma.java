package calisma35_maps_nestedMaps;

public class C04_NestedMapKullanma extends NestedMapDepo {

    public static void main(String[] args) {

        System.out.println(ogrenciMap);
        /*
            {
              101={sinif=11, şube=K, soyisim=Cem, isim=Ali, bölüm=TM},
              102={sinif=10, şube=M, soyisim=Can, isim=Ipek, bölüm=MF},
              103={sinif=11, şube=L, soyisim=Can, isim=Esra, bölüm=MF},
              104={sinif=10, şube=L, soyisim=Cem, isim=Maya, bölüm=TM},
              105={sinif=12, şube=K, soyisim=Kaya, isim=Hamza, bölüm=Soz},
              106={sinif=9, şube=M, soyisim=Kaya, isim=Dilan, bölüm=Soz}
            }
         */

        NestedMapDepo.ogrenciyiMapeEkle(107,"Serat","Somkan","11","C","MF");
        System.out.println(ogrenciMap);
        /*
        {
              101={sinif=11, şube=K, soyisim=Cem, isim=Ali, bölüm=TM},
              102={sinif=10, şube=M, soyisim=Can, isim=Ipek, bölüm=MF},
              103={sinif=11, şube=L, soyisim=Can, isim=Esra, bölüm=MF},
              104={sinif=10, şube=L, soyisim=Cem, isim=Maya, bölüm=TM},
              105={sinif=12, şube=K, soyisim=Kaya, isim=Hamza, bölüm=Soz},
              106={sinif=9, şube=M, soyisim=Kaya, isim=Dilan, bölüm=Soz}
              107={sinif=11, şube=C, soyisim=Somkan, isim=Serat, bölüm=MF}}
            }
         */

        // 103 no'lu öğrencinin sınıfını yazdırın

        System.out.println(ogrenciMap.get(103).get("sinif")); //11

        // 105 no'lu ögr'nin soyismini "Han" yapın

        ogrenciMap.get(105).put("soyisim","Han");

        // 106 no'lu ogr'nin sınıfı 9 ise 11 olarak düzelt

        ogrenciMap.get(106).replace("sinif","9","11");
        System.out.println(ogrenciMap);

        // 101 no'lu ogr'nin soyismi Can ise Han olarak düzelt

        ogrenciMap.get(101).replace("soyisim","Can","Han");
        System.out.println(ogrenciMap);

        // 104 no'lu ogr'nin sınıfı 11 veya daha küçükse
        // sınıfını 1 arttır

        int eskiSinif = Integer.parseInt(ogrenciMap.get(104).get("sinif"));

        int yeniSinif = eskiSinif<=11? ++eskiSinif : eskiSinif;

        ogrenciMap.get(104).put("sinif",yeniSinif+"");
        System.out.println(ogrenciMap);

    }
}
