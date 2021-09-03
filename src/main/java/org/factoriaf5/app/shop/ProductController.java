package org.factoriaf5.app.shop;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductController {

    public List<Product> products = List.of(
           new Product("camiseta", 10.00),
            new Product("pantalón", 30.00)
    );

    @PostMapping("/products/buy")
    public Response getResponse(){
        return new Response(products.());
    }
}
