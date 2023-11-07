package repository;

import model.Product;
import java.util.List;
import java.util.ArrayList;
public class productRepository {
    private List<Product> products;

    public productRepository(){
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    // Additional methods for managing products


}
