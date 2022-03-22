package com.company;


import java.util.Scanner;
public class restauranteMuerteLenta {

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        int plato , propina, numeroPersonas, contadorHamburguesa = 0, contadorPerros = 0, contadorSalchipapa = 0, contadorChorizo = 0;
        double total, descuento1, descuento2, totalConDescuentoYpropina, totalDescuentoSinpropina, totalFinal;
        System.out.println("Digite el numero de personas: ");
        numeroPersonas = Integer.parseInt(inputData.nextLine());
        for (int i = 0; i < numeroPersonas; i++) {
            System.out.println("Digite el plato que la persona " + (i+1) + " va a ordenar:\n\nNuestro menu: \n1- Hamburguesa \n2- Perro \n3- Salchipapas \n4- Chorizo   ");
            plato = Integer.parseInt(inputData.nextLine());
            while (plato != 1 && plato != 2 && plato != 3 && plato != 4){
                System.out.println("\nEl plato no se encutra dentro del menu...\n \nDigite el plato que la persona " + (i+1) +  " va a ordenar:\n\nNuestro menu: \n1- Hamburguesa \n2- Perro \n3- Salchipapas \n4- Chorizo");
                plato = Integer.parseInt(inputData.nextLine());
            }
            if (plato == 1){
                contadorHamburguesa++;
            }
            else if (plato == 2){
                contadorPerros++;
            }
            else if (plato == 3){
                contadorSalchipapa++;
            }
            else if (plato == 4){
                contadorChorizo++;
            }
            else {
                System.out.println("Plato no disponible.");
            }
        }
        total = (contadorHamburguesa * 10000) + (contadorPerros * 8000) + (contadorSalchipapa * 6000) + (contadorChorizo * 7000);
        if (total > 20000){
            System.out.println("\nSe le hara un descuento del 10% por compras superiores a 20000");
            if (contadorHamburguesa >= 2 || contadorPerros >= 2 || contadorSalchipapa >= 2 || contadorChorizo >=2){
                System.out.println("Se le hara un descuento del 5% por la compra de 2 o mas productos iguales: ");
                descuento1 = total * 0.1;
                descuento2 = total * 0.05;
                System.out.println("Desea incluir propina ? si/no:\n1- Si \n2- No");
                propina = Integer.parseInt(inputData.nextLine());
                if (propina == 1){
                    totalConDescuentoYpropina = (total - descuento1 - descuento2) + (total - descuento1 - descuento2) * 0.1;
                    System.out.println("El total a pagar sin descuento es: " + total);
                    System.out.println("El valor del descuento por comprar mayores a 20000 es: " + descuento1);
                    System.out.println("El valor del descuento por la compra de 2 o mas productos iguales es: " + descuento2);
                    System.out.println("El total a pagar con los descuentos y la propina es: " + totalConDescuentoYpropina);
                }
                else {
                    totalDescuentoSinpropina = total - descuento1 - descuento2;
                    System.out.println("El total a pagar sin descuento es: " + total);
                    System.out.println("El valor del descuento por comprar mayores a 20000 es: " + descuento1);
                    System.out.println("El valor deel descuento por la compra de 2 o mas productos iguales es: " + descuento2);
                    System.out.println("El total a pagar con los descuentos y sin propina es: " + totalDescuentoSinpropina);
                }
            }
            else{
                System.out.println("Desea incluir propina ? si/no: \n1- Si \n2- No");
                descuento1 = total * 0.1;
                propina = Integer.parseInt(inputData.nextLine());
                if (propina == 1){
                    totalConDescuentoYpropina = (total - descuento1) + (total - descuento1) * 0.1;
                    System.out.println("El total a pagar sin descuento es: " + total);
                    System.out.println("El valor del descuento por comprar mayores a 20000 es: " + descuento1);
                    System.out.println("El total a pagar con el descuentos y la propina es: " + totalConDescuentoYpropina);
                }
                else{
                    totalDescuentoSinpropina= total - descuento1;
                    System.out.println("El total a pagar sin descuento es: " + total);
                    System.out.println("El valor del descuento por comprar mayores a 20000 es: " + descuento1);
                    System.out.println("El total a pagar con descuento por compras mayores a 20000 es: "+ totalDescuentoSinpropina);
                }
            }
        }
        else {
            if (contadorHamburguesa >= 2 || contadorPerros >= 2 || contadorSalchipapa >= 2 || contadorChorizo >=2){
                System.out.println("Se le hara un descuento del 5% por la compra de 2 o mas productos iguales: ");
                descuento2 = total * 0.05;
                System.out.println("Desea incluir propina ? si/no: \n1- Si \n2- No ");
                propina = Integer.parseInt(inputData.nextLine());
                if (propina == 1){
                    totalConDescuentoYpropina = (total - descuento2) + (total - descuento2) * 0.1;
                    System.out.println("El total a pagar sin descuento es: " + total);
                    System.out.println("El valor del descuento por la compra de 2 o mas productos iguales es: " + descuento2);
                    System.out.println("El valor a pagar con el descuento 2 y propina es: " + totalConDescuentoYpropina);
                }
                else {
                    totalDescuentoSinpropina = total - descuento2;
                    System.out.println("El valor del descuento 2 es: " + descuento2);
                    System.out.println("El valor a pagar con el descuento 2 y sin propina es: " + totalDescuentoSinpropina);
                }
            }
            else {
                System.out.println("Desea incluir propina ? si/no: \n1- Si \n2- No ");
                propina = Integer.parseInt(inputData.nextLine());
                if (propina == 1) {
                    totalFinal = total + (total * 0.1);
                    System.out.println("El valor a pagar con propina es: " + totalFinal);
                } else {
                    System.out.println("El total final a pagar sin propina es: " + total);
                }
            }
        }
    }
}
