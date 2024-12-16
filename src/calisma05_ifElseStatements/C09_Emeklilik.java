package calisma05_ifElseStatements;

import java.util.Scanner;

public class C09_Emeklilik {

    public static void main(String[] args) {

        //Kullanıcıdan yaşını isteyin, 65 yas ve üzeri ise "Emekli olabilirsiniz" yazdırın.
        //Değilse şu kadar yıl çalışmanız lazım deyin

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen yaşınızı Giriniz:");
        double yas = input.nextDouble();

        if(yas >=65){
            System.out.println("Emekli Olabilirsiniz.");
        }

        else {
            System.out.println("Emekli olabilmek için " +(65-yas) + " yıl çalışman gereklidir.");
        }

    }
}
