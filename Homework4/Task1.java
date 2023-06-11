package Homework4;

import java.util.LinkedList;
import java.util.Random;

// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.
public class Task1 {
    public LinkedList<Integer> createRandomIntegerList(int capacity, int maxValue) {
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();
        
        for (int i = 0; i < capacity; i++) {
            list.add(random.nextInt(maxValue + 1));
        }
        
        return list;
    }

    public <E> LinkedList<E> reverse(LinkedList<E> list) {
        LinkedList<E> result = new LinkedList<E>();

        for(int i = 0; i < list.size(); i++){
            result.addFirst(list.get(i));
        }

        return result;
    }
}
