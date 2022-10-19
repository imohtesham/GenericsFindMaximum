import java.util.Scanner;

public class FindMaxInt {
    static Scanner sc = new Scanner(System.in);

    public int findMaxInt(Integer num1, Integer num2, Integer num3){
        if(num1.compareTo(num2) > 0  && num1.compareTo(num3) > 0)
            return num1;
        else if(num2.compareTo(num3) > 0)
            return num2;
        else return num3;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Find Maximum Program");
        FindMaxInt findMax = new FindMaxInt();

        System.out.println("Enter the three numbers : ");
        Integer num1 = sc.nextInt();
        Integer num2 = sc.nextInt();
        Integer num3 = sc.nextInt();
        System.out.println("Max Integer : " + findMax.findMaxInt(num1, num2, num3));

    }
}