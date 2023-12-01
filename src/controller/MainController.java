package controller;

import service.productService;
import view.DisplayMenu;

public class MainController {
        public static void main(String[] args) {
            productService productService = new productService();
            DisplayMenu displayMenu = new DisplayMenu(productService);
            displayMenu.displayMenu();
        }
}