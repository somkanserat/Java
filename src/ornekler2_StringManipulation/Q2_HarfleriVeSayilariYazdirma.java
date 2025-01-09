package ornekler2_StringManipulation;

public class Q2_HarfleriVeSayilariYazdirma {

    public static void main(String[] args) {

        //0-255 e kadar olan harflerin , sayı ve harf değerini konsola yazdırınız

        char x = 'A';
        char y = 'z';

        int i;
        for (i=x; i<=y;i++){

            System.out.println("Harf:"+x);
            x++;
            System.out.println("Harfin sayı değeri:"+i);
        }


    }
}
