package calismam_FutbolTakimiInheritanceMethod;

public class Fenerbahçe extends FutbolTakimlari{

    public void takimBaskani(){
        System.out.println("Fenerbahçenin başkanı Ali Koçtur.");
    }
    public void teknikDirektor(){
        System.out.println("Fenerbahçenin teknik direktörü Jose M.");
    }
    public void oynananMacSayisi(){
        System.out.println("Fenerbahçe 1 sezonda toplam 55 maç oynamaktadır");
    }

    public static void main(String[] args) {

       Fenerbahçe fb = new Fenerbahçe();
        fb.lig();              //Ligin ismi Süper Ligfb.ligBaskani();       //Ligin başkanı Hacıosmanoğludur.
        fb.takimBaskani();     //Fenerbahçenin başkanı Ali Koçtur.
        fb.teknikDirektor();   //Fenerbahçenin teknik direktörü Jose M.
        fb.oynananMacSayisi(); //Fenerbahçe 1 sezonda toplam 55 maç oynamaktadır
        System.out.println("----");

        FutbolTakimlari FenerveTr = new Fenerbahçe();
        FenerveTr.lig();              //Ligin ismi Süper Lig
        FenerveTr.ligBaskani();       //Ligin başkanı Hacıosmanoğludur.
        FenerveTr.oynananMacSayisi(); //Fenerbahçe 1 sezonda toplam 55 maç oynamaktadır.
        System.out.println("----");

        FutbolTakimlari turkligi = new FutbolTakimlari();
        turkligi.lig();                   //Ligin ismi Süper Lig
        turkligi.ligBaskani();            //Ligin başkanı Hacıosmanoğludur.
        turkligi.oynananMacSayisi();      //Süper ligte takımlar 38 maç yapar.
    }
}
