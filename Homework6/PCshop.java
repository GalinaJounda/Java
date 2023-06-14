package Homework6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class PCshop {
    public Set<Notebook> notebooks;
    Set<Notebook> filteredSet;
    int instruction;
    int option;

    public void prepareProducts(int limit) {
        notebooks = new HashSet<Notebook>();

        for(int i = 0; i < limit; i++) {
            Notebook notebook = new Notebook();
            notebook.brand = Options.getRandomOptionIndex(Options.brands);
            notebook.color = Options.getRandomOptionIndex(Options.colors);
            notebook.cpu = Options.getRandomOption(Options.cpus);
            notebook.ram = Options.getRandomOption(Options.rams);
            notebook.frequency = Options.getRandomOption(Options.frequencies);
            notebook.screenSize = Options.getRandomOption(Options.screenSizes);
            notebook.disk = Options.getRandomOption(Options.disks);
            notebook.equipment = Options.getRandomEquipment();
            notebooks.add(notebook);
        }
    }

    public void listProducts(Set<Notebook> set) {
        System.out.println("Найдено продуктов: " + set.size()); 
        set.stream().forEach((notebook) -> {
            System.out.printf("%11s | $%4s | %7s %13s %3sHz %2dGB %1dTB %2d\" %1s %n", Options.colors[notebook.color], notebook.getPrice() , Options.brands[notebook.brand], notebook.cpu, notebook.frequency, notebook.ram, notebook.disk, notebook.screenSize, notebook.equipment);
        });
    }

    public void filterByBrand() {   
        filteredSet = notebooks.stream()
                        .filter(notebook -> notebook.brand == option)
                        .collect(Collectors.toSet());
    }

    public void filterByColor() {   
        filteredSet = notebooks.stream()
                        .filter(notebook -> notebook.color == option)
                        .collect(Collectors.toSet());
    }

    public boolean selectInstruction(){        
        System.out.println("\nВыберите действие: "); 
        System.out.println("1. Распечатать весь каталог"); 
        System.out.println("2. Фильтровать по бренду"); 
        System.out.println("3. Фильтровать по цвету"); 
        
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if(input >= 1 && input <= 3) {
            instruction = input;
            return true;
        }

        return false;
    }

    public boolean selectOption() {
        Scanner scanner = new Scanner(System.in);
        switch(instruction){
            case 1: return true;
            case 2: System.out.println("Выберите бренд: "); 
                    for (int i = 1; i <= Options.brands.length; i++) {                        
                        System.out.println(i + ". " + Options.brands[i - 1]);                        
                    }                    
                    int brand = scanner.nextInt();
                    if(brand >= 1 && brand <= Options.brands.length) {
                        option = brand - 1;
                        return true;
                    }
                    return false;                             

            case 3: System.out.println("Выберите цвет: "); 
                    for (int i = 1; i <= Options.colors.length; i++) {                        
                        System.out.println(i + ". " + Options.colors[i - 1]);                        
                    }                              
                    int color = scanner.nextInt();
                    if(color >= 1 && color <= Options.colors.length) {
                        option = color - 1;
                        return true;
                    }
                    return false; 

            default: return false;
        }
    }

    public void executeInstruction() {
        switch (instruction) {
            case 1: listProducts(notebooks);
                    break;
            case 2: filterByBrand();
                    listProducts(filteredSet);
                    break;
            case 3: filterByColor();
                    listProducts(filteredSet);
                    break;
        }
    }
}
