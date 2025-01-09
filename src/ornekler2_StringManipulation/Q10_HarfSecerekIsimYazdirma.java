package ornekler2_StringManipulation;

public class Q10_HarfSecerekIsimYazdirma {

    public static void main(String[] args) {

        /*
        Q10 -Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
        String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         */

        String  pickName = "ABCDEFGHİJKLMNOPQRSTUVWXYZ";

        System.out.println(

                pickName.substring(0,1)+" "+pickName.substring(11,12)+" "+pickName.toLowerCase().substring(8,9)
        );

        /*

        ****IKINCI YOL****

        System.out.println(pickName.substring(pickName.indexOf("A"),pickName.indexOf("A")+1)+" "+
                pickName.substring(pickName.indexOf("L"),pickName.indexOf("L")+1)+" "+
                pickName.substring(pickName.indexOf("İ"),pickName.indexOf("İ")+1)+" "
        );
        */




    }
}
