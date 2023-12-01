package view;
import model.Product;
import service.productService;
import java.util.List;
import java.util.Scanner;
public class DisplayMenu {
    private productService productService;
    private Scanner scanner;

    public DisplayMenu(productService productService) {
        this.productService = productService;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        while (true) {
            System.out.println("=====SELAMAT DATANG=====");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Jual Produk");
            System.out.println("3. Tampilkan Produk");
            System.out.println("4. Urutkan Produk");
//            System.out.println("5. Tampilkan Produk(Linked List)");
            System.out.println("x. Keluar");
            System.out.print("Pilih : ");

//            int choice = scanner.nextInt();
//            scanner.nextLine(); // Consume newline character
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("Masukkan ID Produk:");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Masukkan Nama Produk:");
                    String name = scanner.nextLine();
                    System.out.println("Masukkan Jumlah Produk:");
                    int quantity = Integer.parseInt(scanner.nextLine());
                    Product product = new Product(id, name, quantity);
                    productService.addProduct(product);
                    System.out.println("Produk berhasil ditambahkan!");
                    break;
                case "2":
                    System.out.println("Masukkan ID Produk yang dijual:");
                    int productId = Integer.parseInt(scanner.nextLine());
                    System.out.println("Masukkan Jumlah yang dijual:");
                    int soldQuantity = Integer.parseInt(scanner.nextLine());
                    productService.sellProduct(productId, soldQuantity);
                    break;
                case "3":
                    System.out.println("\nDaftar Produk:");
                    List<Product> products = productService.getProducts();
                    for (Product p : products) {
                        System.out.println("ID: " + p.getId() + ", Nama: " + p.getName() + ", Jumlah: " + p.getQuantity());
                    }
                    break;
                case "4":
                    productService.sortProducts();
                    System.out.println("Produk berhasil diurutkan berdasarkan ID.");
                    break;
//                case "5":
//                    System.out.println("\nDaftar Produk(Linked List");
//                    productService.displayProductsUsingLinkedList();
//                    break;
                case "x":
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}
