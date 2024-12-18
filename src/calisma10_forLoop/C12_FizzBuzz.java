package calisma10_forLoop;

import java.util.Scanner;

public class C12_FizzBuzz {

    public static void main(String[] args) {
        /*
        Kullanicidan pozitif bir sayi alin, 1’den baslayarak o sayiya kadar tum tamsayilari yazdirin, sira
        - 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        - 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz yazdirin
        */

        Scanner input = new Scanner(System.in);

        System.out.print("Bir tam sayı değeri girin:");
        int sayi = input.nextInt();

        for (int i=1;i<=sayi;i++){

            if (i%5==0 && i%3==0){
                System.out.println("fizzBuzz");

            }
            else if (i%3==0) {
                System.out.println("fizz");

            }
            else if (i%5==0) {
                System.out.println("buzz");

            }
            else {
                System.out.println(i);

            }
        }
    }
}
