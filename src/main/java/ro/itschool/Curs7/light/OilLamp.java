package ro.itschool.Curs7.light;

public class OilLamp implements Lumineers{

    private boolean fire;

    @Override
    public void on(){this.fire=true;}

    @Override
    public void off(){this.fire=false;}

    @Override
    public boolean isLit(){return fire;}

    public void addOil(int liters){}

  //  @Override
   // public String gennieHello(){return "Hello Will!";}
}
