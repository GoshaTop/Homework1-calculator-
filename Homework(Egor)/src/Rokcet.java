

import java.util.Scanner;

    public class Rokcet
    {

        public static void main(String[] args) {
            System.out.println("Ведите операцию");
            System.out.println("1.Сложение");
            System.out.println("2.Вычетание");
            System.out.println("3.Умножение");
            System.out.println("4.Деление");
            while (true) {
                Scanner scanner = new Scanner(System.in);
                int operation = scanner.nextInt();
                if (operation > 4) {
                    System.out.println("Вы ввели неверное число, попробуйте ещё раз:");
                } else if (operation < 1) {
                    System.out.println("Вы ввели неверное число, попробуйте ещё раз:");
                } else {


                    System.out.println("Ведите первое число: ");
                    int a = scanner.nextInt();
                    System.out.println("Ведите второе число: ");
                    int b = scanner.nextInt();
                    int result;
                    if (operation == 1) {
                        result = a + b;
                    } else if (operation == 2) {
                        result = a - b;
                    } else if (operation == 3) {
                        result = a * b;
                    } else {
                        result = a / b;
                    }

                    System.out.println("Результат = " + result);
                    scanner.close();
                    break;
                }
            }
        }
    }





