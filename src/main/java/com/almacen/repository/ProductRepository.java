package com.almacen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.almacen.model.Producto;

public interface ProductRepository extends JpaRepository<Producto, Long> {

}
