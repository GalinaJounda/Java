package Homework6;

public class Notebook {    
    int brand;
    String cpu;    
    String equipment;
    int color;    
    double frequency;
    int ram;
    int screenSize;
    int disk;  
    
    public double getPrice() {
        return 500 + frequency * 100 + ram * 20 + disk * 50 + screenSize * 10;
    }

    //ради простоты использования и ограничения вариантов
    //сравнение ноутбуков сведено до сравнения их цвета и бренда (максимум 35 различных вариантов)
    //иначе слишком много различных вариантов получается
    @Override
    public boolean equals(Object object) {
        Notebook nootebook = (Notebook) object;
        return nootebook.brand == brand && nootebook.color == color;
    }

    @Override
    public int hashCode() {
        return (String.valueOf(brand) + String.valueOf(color)).hashCode() ;
    }
}
