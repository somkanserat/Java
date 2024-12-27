package calisma26_inheritance;

public class C06_GrandParent {

    C06_GrandParent(){

        System.out.println("GP parametresiz constructor calisti");
    }

    C06_GrandParent(String s){
        this(4);
        System.out.println("GP String parametreli constructor calisti");
    }

    C06_GrandParent(int a){

        System.out.println("GP int parametreli constructor calisti");
    }
}
