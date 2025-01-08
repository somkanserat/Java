package calismam_OgrenciBilgiSistemi;

import java.util.ArrayList;

public class OgrenciYonetimSistemi {

    private ArrayList<Ogrenci> ogrenciler; // ogrenciler adında boş array oluşturuldu

    private int yeniID=1; // ogrenci id no

    public OgrenciYonetimSistemi(){ //constructor

        ogrenciler = new ArrayList<>();
    }

    public void ogrenciEkleme(String isim, String soyisim, String email){

        Ogrenci yeniOgrenci = new Ogrenci(yeniID,isim,soyisim,email);
        ogrenciler.add(yeniOgrenci);
        System.out.println("Öğrenci Kaydı Oluşturulmuştur:"+yeniOgrenci);
        yeniID++; // Bir sonraki eklenecek öğrenci için, ID arttırdık
    }

    public void ogrenciListeleme(){

        if (ogrenciler.isEmpty()){

            System.out.println("Sistemde kayıtlı öğrenci bulunmamaktadır.");

        }
        else {

            System.out.println(ogrenciler);
        }
    }

    public void ogrenciGBilgisiGuncelle(int id, String isim, String soyisim, String email){

        for (Ogrenci ogrenci : ogrenciler){

            if (ogrenci.getId() == id){
                ogrenci.setIsim(isim);
                ogrenci.setSoyisim(soyisim);
                ogrenci.setEmail(email);
                System.out.println(id +" ID numaralı Öğrencinin bilgileri güncellenmiştir."+ogrenci);
                break;
            }
        }
        System.out.println("Öğrenci bulunamadı!");
    }

    public void ogrenciBilgisiSilme(int id){

        for (Ogrenci ogrenci : ogrenciler){

            if (ogrenci.getId() == id){
                ogrenciler.remove(ogrenci);
                System.out.println("Silme işlemi tamamlandı. Silinen Öğrenci:"+ogrenci);
                break;
            }
            System.out.println("Öğrenci Bulunamadı!");
        }
    }
}
