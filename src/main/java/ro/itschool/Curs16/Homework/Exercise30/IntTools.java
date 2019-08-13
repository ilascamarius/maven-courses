package ro.itschool.Curs16.Homework.Exercise30;

public class IntTools {
    private int aDigit;


    public int digitSum(int aDigit) {

        int sum;
        for (sum = 0; aDigit > 0; sum += aDigit % 10, aDigit /= 10) ;
        return sum;
    }

    public int lastDigit(int aDigit) {
        return (aDigit % 10);
    }

    public int digitAt(int aDigit, int position) throws InvalidPositionException {
       /* int i, dig=1;
        for(i=position-1; i>0; i++)
            dig=dig*10;
            dig=(aDigit/dig)%10;

        return dig;*/
        double calcDigit = (int) (aDigit / Math.pow(10, position)) % 10;
        double calcDigit1 = (int) aDigit / (Math.pow(10, position));
        //   System.out.println(calcDigit1);

        while (calcDigit1 <= 1) {
            throw new InvalidPositionException();
        }

        return (int) calcDigit;
    }

}
