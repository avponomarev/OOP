import java.util.Scanner;


public abstract class Operation implements Calc {
    double a=10;
    double b=5;

    Scanner scanner = new Scanner(System.in);

    @Override
    public double inputNumber1() {

        System.out.println("Введите первое число = ");
        a = scanner.nextDouble();
        return a;
    }

    @Override
    public double inputNumber2() {

        System.out.println("Введите второе число = ");
        b = scanner.nextDouble();
        return b;
    }
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    @Override
    public String toString() {
        return a + " " + getOperator() + " " + b + " = " + calculateResult();
    }

}