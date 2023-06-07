import java.util.List;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {        
        // runTask1_1();
        // runTask1_2();
        // runTask1_3();
        runTask3_1();
    }

    public static void runTask1_1() {
        Homework1.Task1 task = new Homework1.Task1();    
        Scanner scanner = new Scanner(System.in);    
        System.out.println("Задание 1.1.1: Сумма первых N чисел.");
        System.out.println("Введите положительное натуральное число.");
        int number1 = scanner.nextInt();
        int answer1 = task.triangularNumber(number1);
        System.out.println("Сумма чисел от 1 до " + number1 + " равна " + answer1);

        System.out.println("\nЗадание 1.1.2: Произведение первых N чисел.");
        System.out.println("Введите положительное натуральное число.");
        int number2 = scanner.nextInt();
        int answer2 = task.factorial(number2);
        System.out.println("Произведение чисел от 1 до " + number2 + " равно " + answer2);
        scanner.close();
    }

    public static void runTask1_2() {
        System.out.println("\nЗадание 1.2: Простые числа от 1 до 1000.");
        Homework1.Task2 task = new Homework1.Task2();
        task.primeNumbers(1000);
    }

    public static void runTask1_3() {
        Homework1.Task3 task3 = new Homework1.Task3();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nЗадание 1.3: Простой калькулятор.");
        System.out.println("Введите простое выражение (например: 5+6)");
        String input = scanner.next();
        double answer = task3.calculator(input);
        System.out.println(input + "=" + answer);
        scanner.close();
    }

    public static void runTask3_1() {
        Homework3.Task1 task = new Homework3.Task1(); 
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nЗадание 3.1: Коллекции JAVA: Введение."); 
        System.out.println("Введите размер списка");
        int size = scanner.nextInt();
        List<Integer> list = task.createRandomIntegerList(size, 100);
        scanner.close();
        System.out.println("Исходный список: " + list);
        
        int min = task.getMinimum(list);
        int max = task.getMaximum(list);
        double avg = task.getAverage(list);
        task.removeEvenNumbers(list);

        System.out.println("Тот же список без четных чисел: " + list);        
        System.out.println("Минимальное значение из списка: " + min);        
        System.out.println("Максимальное значение из списка: " + max);
        System.out.println("Среднее значение из списка: " + avg);
    }
}
