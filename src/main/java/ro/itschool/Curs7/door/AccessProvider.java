package ro.itschool.Curs7.door;

public interface AccessProvider {

    void open(int distance);

    void close();

    void lock();
}
