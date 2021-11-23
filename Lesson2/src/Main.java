

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваша задача угадать число!");
        int range = 10;
        int number = (int)(Math.random() * range);

        while (true) {
            System.out.println("угадайте число от 0 до " + range );
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы угадали!!");
                break;
            }else if(input_number > number){
                System.out.println("Загаданое число меньше. Попробуйте ещё раз.");
            }else {
                System.out.println("Загаданое число больше. Попробуйте ещё раз.");
            }
        }
        scanner.close();
    }
}
