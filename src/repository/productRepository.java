package repository;

import model.Product;
import java.util.List;
import java.util.ArrayList;
public class productRepository {
    private List<Product> products;
    private Node head;

    public productRepository(){
        products = new ArrayList<>();
        head = null;
    }

    public void addProduct(Product product) {
        products.add(product);
        addProductToList(product);
    }

    public List<Product> getProducts() {
        return products;
    }
    public void sortProductsById() {
        int n = products.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (products.get(j).getId() > products.get(j + 1).getId()) {
                    // Swap the products
                    Product temp = products.get(j);
                    products.set(j, products.get(j + 1));
                    products.set(j + 1, temp);
                }
            }
        }
    }
    private void addProductToList(Product product){
        Node newNode = new Node(product);
        newNode.next = head;
        head = newNode;
    }
//    public void displayProductsUsingLinkedList() {
//        Node current = head;
//        while (current != null) {
//            System.out.println("ID: " + current.data.getId() + ", Name: " + current.data.getName() + ", Quantity: " + current.data.getQuantity());
//            current = current.next;
//        }
//    }




}
