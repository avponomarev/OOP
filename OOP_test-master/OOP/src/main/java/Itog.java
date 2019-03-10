import java.util.Scanner;

public class Itog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calc iCalc = null;
        {
            System.out.println("Выберете действие: 1-Сложение, 2 - Вычитание, 3-Умножение, 4 - Деление");
            int choose = 0;

            try {
                choose = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Вы ввели не корректное значение");
            }
            switch (choose) {
                case 1:
                    iCalc = new Summa();
                    break;
                case 2:
                    iCalc = new Minus();
                    break;
                case 3:
                    iCalc = new Umnozenie();
                    break;
                case 4:
                    iCalc = new Delenie();
                    break;
                default:
                    System.out.println("Нет такой операции. По умолчанию выполняем сложение");
                    iCalc = new Summa();

            }
        }
        iCalc.inputNumber1();
        iCalc.inputNumber2();
        iCalc.calculateResult();
        System.out.println(iCalc.toString());
    }
}