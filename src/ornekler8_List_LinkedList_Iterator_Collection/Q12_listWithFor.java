package ornekler8_List_LinkedList_Iterator_Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q12_listWithFor {

    // Bir öğretmenden girmek istediği kadar notu alınız, ve
    // ortalamayı geçen öğrenci sayısını bulunuz.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Girilecek notların adedini giriniz:");
        int notSayisi = scan.nextInt();

        List<Integer> notlar = new ArrayList<>();

        for (int j=1;j<=notSayisi; j++){
            System.out.println(j+". notu giriniz:");
            int not = scan.nextInt();
            notlar.add(not);
        }
        System.out.println("Girilen Notlar:"+notlar+"\n----");

        int toplamNot=0;
        double ortalama=0;
        for (int i=0; i<notlar.size(); i++){
            toplamNot+=notlar.get(i);
        }

        ortalama=(double) toplamNot/(double) notSayisi;
        System.out.println("***Ortalama:"+ortalama);

        System.out.print("\n***Ortalamayı geçen notlar:");
        for (int k=0; k<notSayisi;k++){
            if (notlar.get(k)>ortalama){
                System.out.print(notlar.get(k)+" ");
            }
        }

    }
}
