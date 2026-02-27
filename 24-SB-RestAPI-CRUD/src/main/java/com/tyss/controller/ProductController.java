package com.tyss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.entity.Product;
import com.tyss.repo.ProductRepository;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;

	@GetMapping("/all")
	public List<Product> fetch() {
		List<Product> products = productRepository.findAll();
		return products;
	}

	@PostMapping("/all")
	public Product save(@RequestBody Product product) {
		System.out.println(product);
		return product;
	}

	@PutMapping("/update")
	public String update(@RequestHeader String brand, @RequestHeader String token) {
		System.out.println(brand);
		System.out.println(token);
		return "Product updated";
	}

	@DeleteMapping("/delete/{id}/name/{pname}")
	public String delete(@PathVariable(name = "id") int pid, @PathVariable String pname) {
		System.out.println(pid);
		System.out.println(pname);
		return "Product id :" + pid + ", Name : " + pname;
	}

}
