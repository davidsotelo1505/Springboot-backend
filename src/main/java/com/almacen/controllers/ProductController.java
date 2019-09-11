package com.almacen.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.almacen.model.Producto;
import com.almacen.repository.ProductRepository;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	
	@GetMapping
	public List<Producto> list(){
		
		return productRepository.findAll(); 
	};
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Producto producto) {
		productRepository.save(producto);
	}
	
	@GetMapping("/{id}")
	public Producto get(@PathVariable("id") long id) {
		return productRepository.getOne(id);
		
	}
	
}
