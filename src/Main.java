//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. if...else с проверкой диапазона 0-100 и циклом повторного ввода
        int score;
        do {
            System.out.print("Please enter your score: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Введено некорректное значение");
                scanner.next(); // пропускаем нечисловой ввод
            }
            score = scanner.nextInt();
            if (score < 0 || score > 100) {
                System.out.println("Введено некорректное значение");
            }
        } while (score < 0 || score > 100);
               if (score >= 90) {
            System.out.println("Your grade is A!");
        } else if (score >= 80) {
            System.out.println("Your grade is B!");
        } else if (score >= 70) {
            System.out.println("Your grade is C!");
        } else if (score >= 60) {
            System.out.println("Your grade is D!");
        } else if (score >= 50) {
            System.out.println("Your grade is E!");
        } else {
            System.out.println("Your grade is F!");
        }

        // 2. Цикл while, выход по строке "Exit"
        scanner.nextLine(); // очистка буфера
        String userInput;
        System.out.println("Please enter something:");
        while (true) {
            userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("Exit")) {
                break;
            }
            System.out.println("You've entered: " + userInput);
        }
        System.out.println("Выход из цикла.");

        // 3. Цикл for с обработкой отрицательного числа

        System.out.println("Please enter a number: ");
        int x = scanner.nextInt();
        int sum = 0;
        if (x >= 0) {

            for (int i = 0; i <= x; i++) {
                sum += i;
            }
        }else{
               for (int i = 0; i >= x; i--) {
                    sum += i;
                }

        }
        System.out.printf("The sum of all numbers from 0 to %d is %d", x, sum);


        // 4. Пульт дистанционного управления TV
        String[] channels = {"Первый канал", "Euronews", "НТВ", "Fox kids", "Культура"};
        scanner.nextLine(); // очистка буфера
        while (true) {
            System.out.print("\nВведите номер канала. 0 для выхода: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Введено некорректное значение.");
                scanner.next();
                continue;
            }
            int channelNumber = scanner.nextInt();
            if (channelNumber == 0) {
                System.out.println("Выход из программы.");
                break;
            }
            if (channelNumber < 1 || channelNumber > channels.length) {
                System.out.println("Такого канала нет.");
            } else {
                System.out.println("Вы переключились на канал: " + channels[channelNumber - 1]);
            }
        }

        scanner.close();
    }
}