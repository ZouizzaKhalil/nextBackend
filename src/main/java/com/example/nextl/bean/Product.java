package com.example.nextl.bean;

import jakarta.persistence.Column; 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "product_id", nullable = false)
    private Integer productId;
    
    @ManyToOne
    @JoinColumn(name = "categorie_id", nullable = false)
    private Category category;
    
    @ManyToOne
    @JoinColumn(name = "brand_id", nullable = false)
    private Brand brand;
    
    @Column(name = "prix_vente", nullable = false)
    private Integer prixVente;
    
    @Column(name = "name", nullable = false, length = 100)
    private String name;
    
    @Column(name = "image", nullable = false, length = 300)
    private String image;
    
    @Column(name = "commentaire", length = 100)
    private String commentaire;
    
    @Column(name = "created_at")
    private Date createdAt;
    
    @Column(name = "updated_at")
    private Date updatedAt;
    
    @Column(name = "bar_code", nullable = false, length = 100)
    private String barCode;
    
    @Column(name = "code", length = 300)
    private String code;
    
    @Column(name = "quantite", nullable = false)
    private Float quantite;
    
    @Column(name = "prix_revendeur", nullable = false)
    private Float prixRevendeur;
    
    @Column(name = "quantite_marrakech", nullable = false)
    private Float quantiteMarrakech;
    
    public Float getQuantiteMarrakech() {
		return quantiteMarrakech;
	}

	public void setQuantiteMarrakech(Float quantiteMarrakech) {
		this.quantiteMarrakech = quantiteMarrakech;
	}

	public Float getQuantiteRabat() {
		return quantiteRabat;
	}

	public void setQuantiteRabat(Float quantiteRabat) {
		this.quantiteRabat = quantiteRabat;
	}

	@Column(name = "quantite_rabat", nullable = false)
    private Float quantiteRabat;
    
    public Float getPrixRevendeur() {
		return prixRevendeur;
	}

	public void setPrixRevendeur(Float prixRevendeur) {
		this.prixRevendeur = prixRevendeur;
	}

	public Integer getPrixPromo() {
		return prixPromo;
	}

	public void setPrixPromo(Integer prixPromo) {
		this.prixPromo = prixPromo;
	}

	@Column(name = "prix_promo", nullable = false)
    private Integer prixPromo;

	public Long getId() {
		return id;
	}

	public Float getQuantite() {
		return quantite;
	}

	public void setQuantite(Float quantite) {
		this.quantite = quantite;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Category getCategory() {
		return category;
	}

	
	 public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	

	public void setCategory(Category category) {
		this.category = category;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Integer getPrixVente() {
		return prixVente;
	}

	public void setPrixVente(Integer prixVente) {
		this.prixVente = prixVente;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
    
    // Add getters and setters
    
    
}

