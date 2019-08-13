package ro.itschool.Curs16.Homework.Exercise30;

public class IntToolsMain {
    public static void main(String[] args) throws InvalidPositionException {
        IntTools intTools = new IntTools();
        System.out.println(intTools.digitSum(9999));
        System.out.println(intTools.lastDigit(1453));
        System.out.println(intTools.digitAt(3245, 0));
    }
}
