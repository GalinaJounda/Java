package Homework6;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Options {
    static Integer[] rams = {8, 16, 32, 64}; 
    static Double[] frequencies = {2.5, 2.6, 2.8, 3.0, 3.6, 3.8, 4.0}; 
    static Integer[] disks = {1, 2, 4}; 
    static Integer[] screenSizes = {14, 15, 17, 22}; 
    static String[] colors = {"Черный", "Белый", "Серебристый", "Розовый", "Синий"}; 
    static String[] brands = {"Asus", "MSI", "Acer", "HP", "Dell", "Lenovo", "Toshiba"}; 
    static String[] cpus = {"Intel Core i3", "Intel Core i5", "Intel Core i7", "Intel Core i9", "Intel Pentium", "AMD Ryzen 3", "AMD Ryzen 5", "AMD Ryzen 7", "AMD Ryzen 9", "AMD Athlon"};
    static String[] misc = {"Ethernet", "Wi-Fi", "Bluetooth", "USB-3", "USB-C", "Blueray", "HDMI", "DVI", "VGA", "SD-Card Reader"}; 

    private static Random random = new Random();
    public static <T> T getRandomOption(T[] array) {        
        return array[random.nextInt(array.length)];
    }

    public static <T> int getRandomOptionIndex(T[] array) {        
        return random.nextInt(array.length);
    }

    public static String getRandomEquipment() {
        int number = random.nextInt(misc.length);
        Set<String> equipment = new HashSet<String>();
        for(int i = 0; i < number; i++) {
            equipment.add(getRandomOption(misc));
        }
        return String.join(", ", equipment);
    }
}
