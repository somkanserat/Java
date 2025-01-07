package calismam_FutbolTakimiGetterSetter;

public class Stadyum {

    private String stadyumIsmi = "Kadoköy";
    private int stadyumKapasitesi=55000;

    public String getStadyumIsmi() {

        return stadyumIsmi;
    }

    public void setStadyumKapasitesi(int stadyumKapasitesi) {

        this.stadyumKapasitesi=stadyumKapasitesi;
        System.out.println(stadyumKapasitesi);
    }
}
