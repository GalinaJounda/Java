package Homework4;

import java.util.LinkedList;
import java.util.Random;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.
public class TestQueue<E> extends LinkedList<E> {
    public static TestQueue<Integer> createRandomIntegerQueue(int capacity, int maxValue) {
        TestQueue<Integer> queue = new TestQueue<>();
        Random random = new Random();
        
        for (int i = 0; i < capacity; i++) {
            queue.enqueue(random.nextInt(maxValue + 1));;
        }
        
        return queue;
    }
    
    public void enqueue(E element) {
        this.add(element);
    } 

    public E dequeue() {
        E first = this.get(0);
        this.remove(0);
        return first;
    }

    public E first() {
        return this.get(0);
    }
}
