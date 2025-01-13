package ornekler8_List_LinkedList_Iterator_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q11_list {

    /*
        * Input olarak verilen listteki isimlerden
        * icinde 'a' harfi bulunanlari silen bir program yaziniz
        *
        * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
        * OUTPUT : [Veli,Omer]
     */

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));

        System.out.println(isimler);
        System.out.println("---------");

        List<String> newList = new ArrayList<>();

        for (String eleman: isimler){
            if (! eleman.toLowerCase().contains("a")) {
                newList.add(eleman);
            }
        }
        System.out.println(newList);
    }
}
