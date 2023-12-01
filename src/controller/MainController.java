package controller;

import service.productService;
import view.DisplayMenu;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static class MainController {
        public static void main(String[] args) {
            productService productService = new productService();
            DisplayMenu displayMenu = new DisplayMenu(productService);
            displayMenu.displayMenu();
        }


    }
}