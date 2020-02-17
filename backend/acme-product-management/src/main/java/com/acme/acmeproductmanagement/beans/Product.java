package com.acme.acmeproductmanagement.beans;

public class Product {
	
	private Long productId;
	private String productName;
	private String productCode;
	private String releaseDate;
	private String description;
	private Double price;
	private Double starRating;
	private String imageUrl;
	
	public Long getProductId() {
		return productId;
	}
	
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductCode() {
		return productCode;
	}
	
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
	public String getReleaseDate() {
		return releaseDate;
	}
	
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double getStarRating() {
		return starRating;
	}
	
	public void setStarRating(Double starRating) {
		this.starRating = starRating;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	public Product(Long productId, String productName, String productCode, String releaseDate, String description,
			Double price, Double starRating, String imageUrl) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCode = productCode;
		this.releaseDate = releaseDate;
		this.description = description;
		this.price = price;
		this.starRating = starRating;
		this.imageUrl = imageUrl;
	}
	
	public Product() {
		super();
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCode=" + productCode
				+ ", releaseDate=" + releaseDate + ", description=" + description + ", price=" + price + ", starRating="
				+ starRating + ", imageUrl=" + imageUrl + "]";
	}
	
}
