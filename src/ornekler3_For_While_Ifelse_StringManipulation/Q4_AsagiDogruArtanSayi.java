package ornekler3_For_While_Ifelse_StringManipulation;

public class Q4_AsagiDogruArtanSayi {

    /*4----
        1 den 10 a kadar her satırda bir artırarak aşağıdaki şekli oluşturan Java kodunu yazınız.

        Beklenen çıktı:

        1
        12
        123
        1234
        12345
        123456
        1234567
        12345678
        123456789
        12345678910
    */

    public static void main(String[] args) {

        for (int i=1; i<=10; i++){

            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }

}
