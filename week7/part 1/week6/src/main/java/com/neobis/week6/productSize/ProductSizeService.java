package com.neobis.week6.productSize;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductSizeService {

    private final ProductSizeRepository productSizeRepository;

    @Autowired
    public ProductSizeService(ProductSizeRepository productSizeRepository) {
        this.productSizeRepository = productSizeRepository;
    }


    public List<ProductSize> getProductSize() {
        return productSizeRepository.findAll();
    }

    public Optional<ProductSize> getProductSizeById(Long sizeId) {
        return productSizeRepository.findById(sizeId);
    }

    public ProductSize addProductSize(ProductSize productSize) {
        return productSizeRepository.save(productSize);
    }

    public ProductSize updateProductSize(Long sizeId, ProductSize newProductSize) {
        ProductSize productSize = productSizeRepository.findById(sizeId)
                .orElseThrow(() -> new IllegalStateException(
                                "There is no product size with id = " + sizeId
                        )
                );
        productSize.setName(productSize.getName());
        return productSizeRepository.save(productSize);
    }

    public void deleteProductSize(Long sizeId) {
        productSizeRepository.deleteById(sizeId);
    }
}
