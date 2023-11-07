package service;

import model.Product;
import repository.productRepository;
import java.util.List;
public class productService {
    private productRepository productRepository;

    public productService() {
        this.productRepository = new productRepository();
    }

    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }

    public void sellProduct(int productId, int quantity) {
        List<Product> products = productRepository.getProducts();
        for (Product product : products) {
            if (product.getId() == productId) {
                int updatedQuantity = product.getQuantity() - quantity;
                product.getQuantity(updatedQuantity);
                return;
            }
        }
        System.out.println("Produk dengan ID " + productId + " tidak ditemukan.");
    }

    public List<Product> getProducts() {
        return productRepository.getProducts();
    }

    // Additional methods for managing products

}
