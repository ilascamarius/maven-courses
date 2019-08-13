package ro.itschool.Curs20.generics;

public class MainMyList {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("rffefe");
        System.out.println(myList.get(0));
    }
}
