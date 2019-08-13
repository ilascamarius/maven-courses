package ro.itschool.JavaYourself;

public class Primitive {
    public static void main(String[] args) {
        char a = 'a';
        char b = (char) ((int) a + 1);
        System.out.println(((int) b));
        System.out.println(1.0f / 3.0f);
        byte value1 = 127;
        System.out.println(value1++);
        System.out.println((byte) 128);

        String value2 = "127";
        value2 += 1;
        System.out.println(value2);
        System.out.println(3 % 2);
    }
}
