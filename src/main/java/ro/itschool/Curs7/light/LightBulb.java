package ro.itschool.Curs7.light;

public class LightBulb implements Lumineers {

    private boolean electricity;

    @Override
    public void on(){
        this.electricity=true;
    }

    @Override
    public void off(){
        this.electricity=false;
    }

    @Override
    public boolean isLit(){return electricity;}
}
