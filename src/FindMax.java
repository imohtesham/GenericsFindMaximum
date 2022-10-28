import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FindMax <E extends Comparable> {
    E e1, e2, e3;
    static Scanner sc = new Scanner(System.in);

    public FindMax(E e1, E e2, E e3){
        this.e1 = e1;
        this.e2 = e2;
        this.e3 = e3;
    }

    public E testMaximum(){
        return testMaximum(e1, e2, e3);
    }

    public static <E extends  Comparable> E testMaximum(E...e1){
        if(e1 == null) {
            System.out.println("There are no elements.");
            return null;
        }else {
            Collections.sort(Arrays.asList(e1));
            return e1[e1.length -1];
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Find Maximum Program");
        FindMax findMax;

        System.out.println("Enter the three numbers : ");
        Integer num1 = sc.nextInt();
        Integer num2 = sc.nextInt();
        Integer num3 = sc.nextInt();
        findMax = new FindMax(num1, num2, num3);
        System.out.println("Max Integer : " + findMax.testMaximum());

        System.out.println("Enter the three numbers : ");
        Float num4 = sc.nextFloat();
        Float num5 = sc.nextFloat();
        Float num6 = sc.nextFloat();
        findMax = new FindMax(num4, num5, num6);
        System.out.println("Max Float value : " + findMax.testMaximum());

        System.out.println("Enter the three strings : ");
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        findMax = new FindMax(str1, str2, str3);
        System.out.println("Max String value : " + findMax.testMaximum());
    }
}