package calisma11_NestedForLoop_MethoduOlusturma;

public class C08_KendiSubstringMethodumuz {

    public static void main(String[] args) {

        String str = "Java Candır";

        int basIndex = 2;
        int bitIndex = 7;

        /*
            Kullanicidan alinan bir metinden
            kullanicinin girdigi baslangic ve bitis indexleri arasindaki kismi yazdirin

            Kurallar :
            1- eger baslangic veya bitis index'i metnin sinirlari disinda ise hata verin
            2- baslangic index'i bitis index'inden buyukse hata mesaji verin
            3- baslangic indexindeki karakter dahil, bitis indexindeki karakter haric olmalidir

         */

        if (basIndex>str.length() || bitIndex>str.length()){
            System.out.println("Verilen index'ler metnin sınırları dışındadır.");
        }
        else if (basIndex>bitIndex) {
            System.out.println("Baslangıç index'i, bitiş index'inden büyük olamaz.");
        }
        else {
            for (int i=basIndex; i<bitIndex; i++){
                System.out.print(str.charAt(i));
            }
        }

        //***********2.yol***********
        System.out.println("");
        System.out.println(str.substring(basIndex,bitIndex));

        /*
        Burada; 2.yol daha kolay görünmekte fakat, yukarıda oluşturulan
        method daha anlaşılır bir hale gelmektedir.

         "substring" methoduna CTRL+sağclick yaparsak,
         Java bizi bu methodun içerisine götürecek;
         */


        str = "Ali can";

        System.out.println(str.replace("A", "a")); // ali can

        str.substring(2); // calisir - ne goruruz - ne de sonradan kullanabiliriz
        System.out.println(str.substring(4)); // goruruz - sonradan kullanamayiz
        String sonuc = str.substring(5); // goremeyiz - sonradan kullanabiliriz

        /*
            Bize bir sonuc getiren method'lar da
            o sonuc ile ilgili biz de bir islem yapmaliyiz
            52.satirdaki method CALISIR, bize "i can" dondurur
            ama biz yazdirmadigimiz veya kaydetmedigimiz icin "i Can" havaya gider

            53.satirdaki method CALISIR ve bize "can" getirir
            yazdirma islemi yapildigi icin konsolda "can" yazisini goruruz
            ama dondurulen "can" yazisini sonraki satirlarda yeniden kod
            yazmadan kullanamayiz

            54.satirdaki method CALISIR ve bize "an" getirir
            yazdirma islemi yapilmadigi icin konsolda "an" yazisini GOREMEYIZ
            amma bir variable'a kaydettigimiz icin
            54.satirdan sonra ne zaman "an" degerine ihtiyacimiz olsa sonuc variable'ini kullanabiliriz
         */

    }
}
