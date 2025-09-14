package com.telusko.SpringEcom.service;


import com.telusko.SpringEcom.model.Product;
import com.telusko.SpringEcom.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;
    public List<Product> findAllProducts() {
//        int i=10/0;
        return productRepo.findAll();
    }


    public Product getProductById(int id){
//        return productRepo.findById(id).orElse(null);
//        return productRepo.findById(id).get();
        return productRepo.findById(id).orElse(new Product(-1));

    }

    public Product addorUpdateProduct(Product product, MultipartFile image) throws IOException {
        if (image != null && !image.isEmpty()) {
            // Save new image
            String fileName = image.getOriginalFilename();
            product.setImageName(fileName);
            product.setImageData(image.getBytes());
        } else {
            // Keep old image when updating
            if (product.getId() != null) {
                Product existingProduct = productRepo.findById(product.getId())
                        .orElseThrow(() -> new RuntimeException("Product not found with id " + product.getId()));
                product.setImageName(existingProduct.getImageName());
                product.setImageData(existingProduct.getImageData());
            }
        }

        return productRepo.save(product);
    }


    public void deleteProduct(int id){
         productRepo.deleteById(id);
    }

    public List<Product> searchProducts(String keyword) {


        return productRepo.searchProducts(keyword);
    }

}
