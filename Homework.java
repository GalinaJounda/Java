import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import Homework4.TestQueue;


public class Homework {
    public static void main(String[] args) {        
        // runTask1_1();
        // runTask1_2();
        // runTask1_3();
        // runTask3_1();
        // runTask4_1();
        runTask6_1();
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

    public static void runTask4_1() {
        Homework4.Task1 task = new Homework4.Task1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nЗадание 4.1: Приоритетные коллекции."); 
        System.out.println("Введите размер списка");
        int size = scanner.nextInt();
        LinkedList<Integer> list = task.createRandomIntegerList(size, 100);
        scanner.close();
        System.out.println("Исходный список: " + list);

        LinkedList<Integer> reversedList = task.reverse(list);
        System.out.println("Тот же, но перевернутый список: " + reversedList); 

        TestQueue<Integer> queue = TestQueue.createRandomIntegerQueue(size, 100);
        System.out.println("\nТестовая очередь: " + queue); 

        int first = queue.first();
        System.out.println("Первый элемент очереди: " + first);

        int pointer = 1;
        for (int i = queue.size(); i > 0; i--) {
            queue.dequeue();
            System.out.println("\nТестовая очередь после удаления " + pointer++ + "-го элемента" + queue); 
        }
    }

    public static void runTask6_1() {
        Homework6.PCshop pcShop = new Homework6.PCshop();
        System.out.println("\nЗадание 6: Хранение и обработка данных.");

        pcShop.prepareProducts(40);
        while(pcShop.selectInstruction() && pcShop.selectOption()) {
            pcShop.executeInstruction();
        }
    }
}
