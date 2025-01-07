package calismam_FutbolTakimiConstructor;

public class Takim {

    String takimIsmi = "Atanmadı";
    String takimSembolu = "Atanmadı";
    String takimRenkleri ="";
    int takimYili;

    Takim(String takimIsmi, String takimSembolu, String takimRenkleri, int takimYili){
        this.takimIsmi=takimIsmi;
        this.takimSembolu=takimSembolu;
        this.takimRenkleri=takimRenkleri;
        this.takimYili=takimYili;
    }

    @Override
    public String toString() {
        return "Takım İsmi:" +takimIsmi +
                "\nTakım Yılı:" + takimYili +
                "\nTakım Sembolü:" + takimSembolu +
                "\nTakım Renkleri:" + takimRenkleri;
    }
}
