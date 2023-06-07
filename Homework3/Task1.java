package Homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

//Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение
public class Task1 {
    public List<Integer> createRandomIntegerList(int capacity, int maxValue) {
        List<Integer> list = new ArrayList<>(capacity);
        Random random = new Random();
        
        for (int i = 0; i < capacity; i++) {
            list.add(random.nextInt(maxValue + 1));
        }
        
        return list;
    }

    public void removeEvenNumbers(List<Integer> input) {
        for (Iterator<Integer> iterator = input.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
    }

    public int getMinimum(List<Integer> input) {
        return Collections.min(input);
    }

    public int getMaximum(List<Integer> input) {
        return Collections.max(input);
    }

    public double getAverage(List<Integer> input) {
        return input.stream().mapToDouble(x -> x).average().orElse(0.0);
    }
}
