package ro.itschool.Curs7.door;

import ro.itschool.Curs7.door.AccessProvider;

public class Door implements AccessProvider {

    private boolean open;
    private boolean locked;

   Door(){

       open=true;
   }

   Door (boolean open){
       this.open=open;
   }

   Door(boolean open, boolean locked){
       this.open=open;
       this.locked=locked;

   }

   public void open (int distance){

       locked=false;
       open=true;
   }

    void openDoor(){
        locked=false;
        open=true;
    }

    void closeDoor(){
        locked = false;
        open= false;
    }

    void lockDoor(){
        locked=true;
    }

    void unlockDoor(){
        locked=false;

    }

    boolean isLocked(){

    return locked;}

    boolean isOpen(){
        return open;
    }

    public String toString(){

     //  if(isOpen()){

       //}
       return "Door is opened?"+open+"and is locked?"+locked;
    }
}
