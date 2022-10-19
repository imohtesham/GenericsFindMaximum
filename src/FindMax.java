import java.util.Scanner;

public class FindMax {
    static Scanner sc = new Scanner(System.in);

    public int findMaxInt(Integer num1, Integer num2, Integer num3){
        if(num1.compareTo(num2) > 0  && num1.compareTo(num3) > 0)
            return num1;
        else if(num2.compareTo(num3) > 0)
            return num2;
        else return num3;
    }

    public float findMaxFloat(Float num4, Float num5, Float num6){
        if(num4.compareTo(num5) > 0  && num4.compareTo(num6) > 0)
            return num4;
        else if(num5.compareTo(num6) > 0)
            return num5;
        else return num6;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Find Maximum Program");
        FindMax findMax = new FindMax();

        System.out.println("Enter the three numbers : ");
        Integer num1 = sc.nextInt();
        Integer num2 = sc.nextInt();
        Integer num3 = sc.nextInt();
        System.out.println("Max Integer : " + findMax.findMaxInt(num1, num2, num3));

        System.out.println("Enter the three numbers : ");
        Float num4 = sc.nextFloat();
        Float num5 = sc.nextFloat();
        Float num6 = sc.nextFloat();
        System.out.println("Max Float value : " + findMax.findMaxFloat(num4, num5, num6));

    }
}