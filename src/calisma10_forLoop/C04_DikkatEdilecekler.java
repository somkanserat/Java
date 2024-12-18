package calisma10_forLoop;

public class C04_DikkatEdilecekler {

    public static void main(String[] args) {

        //ilk değer için boolean şart false olursa for body'si hiç devreye girmez.
        //Bu durumda KOD ÇALIŞMAZ diyemeyiz ama KOD ÇALIŞIR ve değerler şartı sağlamadığı için LOOP BODY çalışmaz

        for (int i=50; i<40; i++){
            System.out.println(i);
        }

        //artış veya azalış ile boolean şart SÜREKLİ TRUE olursa

        for (int i=10; i>0; i++){
            System.out.println(i+" ");
        }


    }
}
