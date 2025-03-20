package com.prueba.apirest.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.apirest.demo.Entities.Product;

public interface RepositoryProduct extends JpaRepository<Product, Long>{

}
