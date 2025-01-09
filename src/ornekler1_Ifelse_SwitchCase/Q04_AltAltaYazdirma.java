package ornekler1_Ifelse_SwitchCase;

public class Q04_AltAltaYazdirma {

    public static void main(String[] args) {

        //verilen 12345 sayısının rakamlarını yukarıdan aşağıya doğru yazdırınız

        int sayi = 12345;

        int onbinler = (sayi/10000)%10;
        System.out.println(onbinler);
        int binler = (sayi/1000)%10;
        System.out.println(binler);
        int yuzler = (sayi/100)%10;
        System.out.println(yuzler);
        int onlar = (sayi/10)%10;
        System.out.println(onlar);
        int birler = sayi%10;
        System.out.println(birler);
    }
}
