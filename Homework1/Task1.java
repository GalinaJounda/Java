package Homework1;

//1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class Task1 {
    public int triangularNumber(int number){
        if(number <= 0)
            return 0;        
        return (number * (number + 1)) / 2;
    }

    public int factorial(int number){
        if(number <= 0)
            return 0;
        if(number == 1) 
            return 1;
        return number * factorial(number - 1);
    }
}