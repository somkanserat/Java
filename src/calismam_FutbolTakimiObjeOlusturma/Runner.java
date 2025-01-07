package calismam_FutbolTakimiObjeOlusturma;

public class Runner {

    public static void main(String[] args) {

        FutbolTakimi takimim = new FutbolTakimi(); //Futbol takımımızın objesini Futbol Takımı class'ında oluşturduk
        takimim.takimIsmi="Fenerbahçe";
        takimim.takimSembolu = "Boğa";
        takimim.takimRenkleri = "Sarı-Lacivert";

        Stadyum stadyumumum = new Stadyum(); //Futbol takımımızın stadyum objesini oluşturduk.
        stadyumumum.koltukRenkleri = "Sarı";
        stadyumumum.stadyumIsmi = "Şükrü Saraçoğlu";
        stadyumumum.stadyumKapasitesi = 55000;
        stadyumumum.cimTuru = "Suni çim";

        System.out.println("Takım İsmi:"+takimim.takimIsmi);
        System.out.println("Takım Sembolü:"+takimim.takimSembolu);
        System.out.println("Takım Renkleri:"+takimim.takimRenkleri);
        System.out.println("Stadyum İsmi:"+stadyumumum.stadyumIsmi);
        System.out.println("Kapasite:"+stadyumumum.stadyumKapasitesi);
        System.out.println("Stadyum Koltuk Rengi:"+stadyumumum.koltukRenkleri);
        System.out.println("Stadyum Çim Türü:"+stadyumumum.cimTuru);
    }
}
