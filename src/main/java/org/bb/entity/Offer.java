package org.bb.entity;

import javax.persistence.*;

@Entity
public class Offer {

    private Long id;
    private Place place;
    private String name;
    private String description;
    private String imageSrc;
    private Long regularPrice;
    private String currency;
    private Long discount;
    private String discountId;

    public Offer() {
    }

    public Offer(Long id, Place place, String name, String description, String imageSrc, Long regularPrice, String currency, Long discount, String discountId) {
        this.id = id;
        this.place = place;
        this.name = name;
        this.description = description;
        this.imageSrc = imageSrc;
        this.regularPrice = regularPrice;
        this.currency = currency;
        this.discount = discount;
        this.discountId = discountId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToOne
    @JoinColumn(name = "id")
    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    public Long getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(Long regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Long getDiscount() {
        return discount;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    public String getDiscountId() {
        return discountId;
    }

    public void setDiscountId(String discountId) {
        this.discountId = discountId;
    }
}
