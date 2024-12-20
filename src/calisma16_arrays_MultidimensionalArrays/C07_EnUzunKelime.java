package calisma16_arrays_MultidimensionalArrays;

public class C07_EnUzunKelime {

    public static void main(String[] args) {

        //İki katlı array'deki en uzun kelimeyi yazdırın

        String[][] arr = { {"Ali","okula","git"},{"Merhaba","arkadaslar"},{"Bu","is","olacak"}};

        //Tum elementleri kontrol etmeli miyiz?

        String enUzunKelime= arr[0][0]; //Ali

        for (int i=0; i<arr.length; i++){

            for (int j=0; j<arr[i].length;j++){

                if (arr[i][j].length()>enUzunKelime.length()){

                    enUzunKelime = arr[i][j];

                }
            }
        }
        System.out.println("En uzun kelimemiz:"+enUzunKelime);
    }
}
