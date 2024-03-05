package org.example;

import org.example.model.*;
import org.example.model.product.Producto;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(" ¡Bienvenid@ a Mi Tienda App!");
        System.out.println();

        ProductServiceArrayList productService  = new ProductServiceArrayList();
        productService.loadInventory("inventory.csv");

        Main main = new Main();
        main.runMenu();

        //Instancia la clase creada ProductsArray en tu método main
        ProductsArray productsArray = new ProductsArray();
        productsArray.alphabeticOrder(productsArray.products);

        Inventario inventario = new Inventario();

        // Llamada al método para agregar un producto
        inventario.addProduct();

    }

    //Crea una función o método que te permita mostrar las opciones del menu:
    private void displayMenu() {

        System.out.println();
        System.out.println(
                """
                        |o|                         /////////////\\\\\\
                        |o|                        (((((((((((((   \\\\\\
                        |o|                        ))) ~~      ~~   (((
                        |o|                        ((( (*)     (*)  )))
                        |o|                        )))     <        (((\s
                        |o|                        ((( '\\______/`   )))\s
                        |o|                        )))\\___________/(((\s
                        |o|                        (((   _)  (_    )))\s\s
                        |o|                              /\\__/\\""");
        System.out.println("±----------------------------------------±");
        System.out.println("|   Administrador Mi Tienda de Barrio    |");
        System.out.println("±----------------------------------------±");
        System.out.println("---Ingrese una opcion de las siguientes:--");
        System.out.println("±----------------------------------------±");
        System.out.println("1. Agregar producto                      |");
        System.out.println("2. Eliminar producto                     |");
        System.out.println("3. Actualizar producto                   |");
        System.out.println("4. Ver todos los productos               |");
        System.out.println("5. Ver Inventario                        |");
        System.out.println("6. Ver productos en orden alfabético     |");
        System.out.println("7. Salir                                 |");
        System.out.println("±----------------------------------------±");
        System.out.print("   Ingresa tu opción:    (1 - 7)  ");

    }

    //Menu Opciones de App Mi Tienda de Barrio
    private  void handleUserChoice(int choice) {

        switch (choice) {
            case 1 -> Inventario.addProduct();
            case 2 -> RemoveProduct.removeProduct();
            case 3 -> UpdateProduct.updateProduct();
            case 4 -> ProductsArray.showProducts();
            case 5 -> Inventario.viewStock();
            case 6 -> ProductsArray.alphabeticOrder(ProductsArray.products);
            case 7 -> System.out.println("Saliendo...");
            default -> System.out.println("Opción invalida. Por favor intenta de nuevo.");
        }

    }

    //Implementa una función que te permita mostrar el menu y capturar la opción seleccionada por el usuario:
    public void runMenu() {
        int choice;
        Scanner scanner= new Scanner(System.in);
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            handleUserChoice(choice);
        } while (choice != 8);
    }

}