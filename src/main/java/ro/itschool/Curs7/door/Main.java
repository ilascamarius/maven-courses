package ro.itschool.Curs7.door;

public class Main {

    public static void main(String[] args) {
        Door door = new Door();
        door.closeDoor();
        System.out.println("Door is closed?" + !door.isOpen());
        door.openDoor();
        System.out.println("Door is open ?" + !door.isOpen());

        Door door2 = new Door(true, false);
        System.out.println(door2);

        Main main = new Main();
        System.out.println(main.toString());
    }
}
