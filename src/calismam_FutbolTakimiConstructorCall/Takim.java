package calismam_FutbolTakimiConstructorCall;

public class Takim {

    String takimIsmi = "Atanmadı";
    String takimSembolu = "Atanmadı";
    String takimRenkleri ="Atanmadı";
    int takimYili;

    Takim(String takimIsmi, String takimSembolu, String takimRenkleri, int takimYili){
        this("Sarı Beyaz","Kanarya");
        this.takimIsmi=takimIsmi;
        this.takimSembolu=takimSembolu;
        this.takimRenkleri=takimRenkleri;
        this.takimYili=takimYili;
    }

    public String toString() {
        return "Güncel Takım İsmi:" +takimIsmi +
                "\nGüncel Takım Yılı:" + takimYili +
                "\nGüncel Takım Sembolü:" + takimSembolu +
                "\nGüncel Takım Renkleri:" + takimRenkleri;
    }

    Takim(String takimRenkleri, String takimSembolu){

        this.takimRenkleri=takimRenkleri;
        System.out.println("Takımın ilk renkleri:"+takimRenkleri);

        this.takimSembolu=takimSembolu;
        System.out.println("Takımın ilk sembolü:"+takimSembolu);
    }
}
