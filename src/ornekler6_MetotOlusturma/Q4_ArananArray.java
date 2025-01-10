package ornekler6_MetotOlusturma;

public class Q4_ArananArray {

    /*34-----
    String array dizisindeli 4 harfli kelimeleri return eden methodu yazınız.


    Test Data:
    isFourLetters(["Tomato", "Potato", "Pair"])

     ["Pair"]
    */

    public static void main(String[] args) {

        String [] sebzeler = {"Patates","Roka","Domates","Brokoli","Turp","Ispanak"};
        System.out.println(harfBulma(sebzeler).substring(0,harfBulma(sebzeler).length()-1));

    }

    public static String harfBulma(String[] sebzeler){

        String dortHarf="";

        for (int i=0;i<sebzeler.length;i++){

            if (sebzeler[i].length()==4){
                dortHarf+=sebzeler[i]+",";
            }
        }
        return dortHarf;
    }
}
