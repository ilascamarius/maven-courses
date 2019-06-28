package ro.itschool.Curs7.bottle;

public class Main {

    public static void main (String[] args){

        LiquidLevel liquidLevel=new LiquidLevel();


        showTheLevel(liquidLevel);
    }

    private static void showTheLevel(Bottle bottle){System.out.println(bottle.isOpened());}
}
