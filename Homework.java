import Homework1.Task1;
import Homework1.Task2;
import Homework1.Task3;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {        
        runTask1();
        runTask2();
        runTask3();
    }

    public static void runTask1() {
        Task1 task1 = new Task1();    
        Scanner scanner = new Scanner(System.in);    
        System.out.println("Задание 1.1: Сумма первых N чисел.");
        System.out.println("Введите положительное натуральное число.");
        int number1 = scanner.nextInt();
        int answer1 = task1.triangularNumber(number1);
        System.out.println("Сумма чисел от 1 до " + number1 + " равна " + answer1);

        System.out.println("\nЗадание 1.2: Произведение первых N чисел.");
        System.out.println("Введите положительное натуральное число.");
        int number2 = scanner.nextInt();
        int answer2 = task1.factorial(number2);
        System.out.println("Произведение чисел от 1 до " + number2 + " равно " + answer2);
        scanner.close();
    }

    public static void runTask2(){
        System.out.println("\nЗадание 2: Простые числа от 1 до 1000.");
        Task2 task2 = new Task2();
        task2.primeNumbers(1000);
    }

    public static void runTask3(){
        Task3 task3 = new Task3();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nЗадание 3: Простой калькулятор.");
        System.out.println("Введите простое выражение (например: 5+6)");
        String input = scanner.next();
        double answer = task3.calculator(input);
        System.out.println(input + "=" + answer);
        scanner.close();
    }
}
