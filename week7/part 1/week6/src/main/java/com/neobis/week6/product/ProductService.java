package com.neobis.week6.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long productId) {
        return productRepository.findById(productId);
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Long productId, Product newProduct) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new IllegalStateException(
                                "There is no product with id = " + productId
                        )
                );
        product.setName(newProduct.getName());
        product.setCategoryId(newProduct.getCategoryId());
        product.setSizeId(newProduct.getSizeId());
        product.setPrice(newProduct.getPrice());
        product.setTextileId(newProduct.getTextileId());
        product.setQuantityInStock(newProduct.getQuantityInStock());

        return productRepository.save(product);
    }

    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }
}
