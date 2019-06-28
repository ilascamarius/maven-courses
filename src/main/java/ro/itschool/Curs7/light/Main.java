package ro.itschool.Curs7.light;

public class Main {

    public static void main (String[] args){

        OilLamp oillamp=new OilLamp();
       // oillamp.gennieHello();

        LightBulb lightBulb=new LightBulb();

        showTheLight(lightBulb);
        showTheLight(oillamp);



    }

    private static void showTheLight(Lumineers lumineer){System.out.println(lumineer.isLit());}
}
