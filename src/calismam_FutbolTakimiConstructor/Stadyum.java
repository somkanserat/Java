package calismam_FutbolTakimiConstructor;

public class Stadyum {

    String stadyumIsmi = "Atanmamış";
    int stadyumKapasitesi;
    String koltukRenkleri = "Atanmamış";
    String cimTuru ="";

    Stadyum(String stadyumIsmi, String koltukRenkleri, String cimTuru, int stadyumKapasitesi){

        this.stadyumIsmi=stadyumIsmi;
        this.koltukRenkleri=koltukRenkleri;
        this.cimTuru=cimTuru;
        this.stadyumKapasitesi=stadyumKapasitesi;
    }

    @Override
    public String toString() {
        return "Stadyum İsmi:" +stadyumIsmi+
                "\nStadyum Kapasitesi:" +stadyumKapasitesi+
                "\nStadyum Koltuk Rengi:" +koltukRenkleri +
                "\nStadyum Çim Türü:" +cimTuru;
    }
}
