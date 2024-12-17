package calisma08_StringManipulation;

public class C02_Concatenation {

    public static void main(String[] args) {

        String str1 = "Have";
        String str2 = "a";
        String str3 = "nice";
        String str4 = "day";

        System.out.println(str1+str2+str3+str4); //Haveaniceday
        System.out.println(str1+" "+str2+" "+str3+" "+str4); //Have a nice day

        System.out.println(str1.concat(str2).concat(str3).concat(str4)); //Haveaniceday
        System.out.println(str1.concat(" "+str2+" ").concat(str3+" ").concat(str4+" ")); //Have a nice day
    }
}
