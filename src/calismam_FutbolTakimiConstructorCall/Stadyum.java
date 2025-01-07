package calismam_FutbolTakimiConstructorCall;

public class Stadyum {

    String stadyumIsmi = "Atanmamış";
    int stadyumKapasitesi;
    String koltukRenkleri = "Atanmamış";
    String cimTuru ="";

    Stadyum(String stadyumIsmi, String koltukRenkleri, String cimTuru, int stadyumKapasitesi){

        this("Kadıköy","Mavi",10000);
        this.stadyumIsmi=stadyumIsmi;
        this.koltukRenkleri=koltukRenkleri;
        this.cimTuru=cimTuru;
        this.stadyumKapasitesi=stadyumKapasitesi;
    }

    public String toString() {
        return "Stadyum İsmi:" +stadyumIsmi+
                "\nGüncel Stadyum Kapasitesi:" +stadyumKapasitesi+
                "\nGüncel Stadyum Koltuk Rengi:" +koltukRenkleri +
                "\nGüncel Stadyum Çim Türü:" +cimTuru;
    }

    Stadyum(String stadyumIsmi, String koltukRenkleri, int stadyumKapasitesi){
        System.out.println("Stadyumun ilk İsmi:"+stadyumIsmi);
        System.out.println("Stadyumun ilk koltuk rengi:"+koltukRenkleri);
        System.out.println("Stadyumun ilk kapasitesi:"+stadyumKapasitesi);
    }
}
