package calismam_FutbolTakimiGetterSetter;

public class Takim {

    private String takimIsmi = "Fenerbahçe";
    private int takimYili=1907;

    public void setTakimYili(int takimYili){
        this.takimYili=takimYili;
        System.out.println(takimYili);
    }
    public String getTakimIsmi() {

        return takimIsmi;
    }
}
