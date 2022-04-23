package herenciaarraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DbShop dbShop = new DbShop();
        Scanner scanner = new Scanner(System.in);
        boolean flagClose = false;
        while (flagClose == false) {  
        System.out.println("Digite la opcion: ");
        int option = Integer.parseInt(scanner.nextLine());
        switch (option) {
            case 1:
                Monitor monitor = new Monitor();
                System.out.println("Digite el nombre del producto: ");
                monitor.setName(scanner.nextLine());
                System.out.println("Ingrese la marca: ");
                monitor.setBrand(scanner.nextLine());
                System.out.println("Ingrese referencia");
                monitor.setId(scanner.nextLine());
                dbShop.setMonitor(monitor);
                break;
            case 4:
                for(Monitor monitor1: dbShop.getMonitores()){
                    System.out.println(monitor1.getName());
                }
                break;
            case 10: 
                flagClose = true;
                break;
            default:
                throw new AssertionError();
            }
        }
        
    }
}
