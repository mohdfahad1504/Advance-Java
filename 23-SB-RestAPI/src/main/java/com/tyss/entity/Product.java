package com.tyss.entity;

public class Product {

	private Integer pid;
	private String brand;
	private String description;
	private Integer quantity;
	private Double price;
	private String category;
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", brand=" + brand + ", description=" + description + ", quantity=" + quantity
				+ ", price=" + price + ", category=" + category + "]";
	}
	
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
