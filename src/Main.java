import java.util.Scanner;

//Задача 1
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String name = "Александр";
        String surname = "Кравченко";
        String occupation = "Специалист по сопровождению ПО";
        System.out.println(name);
        System.out.println(surname);
        System.out.println(occupation);
        //Задача 2
        System.out.println("--Примеры объявления и инициализации переменных--");
        byte exampleByte = 127;
        short exampleShort = 30000;
        int exampleInt = 100000;
        long exampleLong = 100000000000l;
        float exampleFloat = 10.543f;
        double exampleDouble = 10.98766545432;
        boolean exampleBoolean = true;
        char exampleChar = 'f';
        String exampleString = "example string";

        System.out.println ("byte:" + exampleByte);
        System.out.println ("short:" + exampleShort);
        System.out.println ("int:" + exampleInt);
        System.out.println ("long:" + exampleLong);
        System.out.println ("float:" + exampleFloat);
        System.out.println ("double:" + exampleDouble);
        System.out.println ("boolean:" + exampleBoolean);
        System.out.println ("char:" + exampleChar);
        System.out.println ("String:" + exampleString);
        //Задача 3
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи своё имя");
        String userInput = scanner.nextLine();
        name = userInput;
        System.out.print("Введи свою фамилию");
        userInput = scanner.nextLine();
        surname = userInput;
        System.out.print("Введи свою профессию");
        userInput = scanner.nextLine();
        occupation = userInput;
        System.out.println("Теперь я знаю что тебя зовут " + name + " "
                + surname + "\n" + "Твоя профессия:" + " " + occupation);
        System.out.println("Big Brother is watching you");

        int length = userInput.length();
        boolean isEmpty = userInput.isEmpty();
        char charAt7 = (length > 7) ? userInput.charAt(7) : '-'; // символ под индексом 7, если есть
        String lowerCase = userInput.toLowerCase();
        String upperCase = userInput.toUpperCase();
        boolean startsWithHello = userInput.startsWith("Повар");
        boolean endsWithDot = userInput.endsWith(".");
        boolean containsSpace = userInput.contains(" ");
        String replacedStr = userInput.replace('a', 'A');
        String replacedIs = userInput.replace("is", "");
        String fullInformation = String.format("Тебя зовут %s и твоя профессия %s", name, occupation);

        System.out.println("\nРезультаты работы со строкой:");
        System.out.println("Длина строки: " + length);
        System.out.println("Пустая ли строка: " + isEmpty);
        System.out.println("Символ под индексом 7: " + charAt7);
        System.out.println("В нижнем регистре: " + lowerCase);
        System.out.println("В верхнем регистре: " + upperCase);
        System.out.println("Начинается на \"Повар\": " + startsWithHello);
        System.out.println("Заканчивается на \".\": " + endsWithDot);
        System.out.println("Содержит пробел: " + containsSpace);
        System.out.println("Замена 'a' на 'A': " + replacedStr);
        System.out.println("Объединение информации в строку: " + fullInformation);
    }
}