package com.prueba.apirest.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.apirest.demo.Entities.Product;
import com.prueba.apirest.demo.Repositories.RepositoryProduct;

@RestController
@RequestMapping("/products")
public class ControllerProduct {

   @Autowired
   private RepositoryProduct repositoryProduct;

   @GetMapping
   public List<Product> getAllProducts(){

      return repositoryProduct.findAll();
   }

   @GetMapping("/{id}")
   public Product getProductById(@PathVariable Long id){
      return repositoryProduct.findById(id)
               .orElseThrow(()-> new RuntimeException("No se encontro el producto con el ID: " + id));
   }

   @PostMapping
   public Product createProduct(@RequestBody Product product){
      return repositoryProduct.save(product);
   }

   @PutMapping("/{id}")
   public Product updateProduct(@PathVariable Long id, @RequestBody Product productDetails){

      Product product = repositoryProduct.findById(id)
      .orElseThrow(()-> new RuntimeException("No se encontro el producto con el ID: " + id));

      product.setNombre(productDetails.getNombre());
      product.setPrecio(productDetails.getPrecio());
      return repositoryProduct.save(product);
   }

   @DeleteMapping("/{id}")
   public String deleteProduct(@PathVariable Long id){
      Product product = repositoryProduct.findById(id)
      .orElseThrow(()-> new RuntimeException("No se encontro el producto con el ID: " + id));

      repositoryProduct.delete(product);

      return " El producto con el ID: " + id + " Fue eliminado correctamente";
   }

}
