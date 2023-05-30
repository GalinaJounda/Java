package Homework1;

//2) Вывести все простые числа от 1 до N
public class Task2 {
    public void primeNumbers(int number) {
        for(int i = 2; i <= number; i++){
            boolean found = false;
            for(int j = 2; j < i; j++){
                found |= i % j == 0;
            }
            if(!found){
                System.out.println(i);
            }
        }    
        
    }
}
