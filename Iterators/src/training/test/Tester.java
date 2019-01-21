package training.test;

import java.util.Map;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Calc myTester = (x, y) -> x * y;

        int result = myTester.calculate(a,b);

        System.out.println("Multiply Result = " + result);

        myTester = (int x, int y) -> {
            return Integer.compare(x, y);
        };

        int comp = myTester.calculate(a, b);

        System.out.println("Comparision Result = " + comp);

    }

}

interface Calc{
    int calculate(int a, int b);
}
