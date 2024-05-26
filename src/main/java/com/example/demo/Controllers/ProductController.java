package com.example.demo.Controllers;

import com.example.demo.dtos.ProductDto;
import org.springframework.web.bind.annotation.*;

//This controller will always answer products

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping("")
    public String getAllProducts(){
        return "this is the list of all the products";
    }

    @RequestMapping("{productId}")
    public String getSingleProduct(@PathVariable ("productId") long productId) {
        return "this is the single product with productId   "+productId;
    }

    @PostMapping()
    public String addNewProduct(@RequestBody ProductDto productDto){
        return "Adding new products " +productDto;
    }

    @PutMapping("/{productId}")
    public String updateProduct(@PathVariable ("productId") long productId){
        return "product updated with the product id =="+productId;
    }

    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable("productId") long productId){
        return "product deleted with the product id ===="+productId;
    }
}

