package org.bb.entity;

import javax.persistence.*;

@Entity
public class Place {

    private Long id;
    private String title;
    private Position position;
    private String address;
    private String website;
    private String phone;
    private String workTime;
    private String logoSrc;
    private Long categoryId;

    public Place(String title, Position position, String address, String website, String phone, String workTime, String logoSrc, Long categoryId) {
        this.title = title;
        this.position = position;
        this.address = address;
        this.website = website;
        this.phone = phone;
        this.workTime = workTime;
        this.logoSrc = logoSrc;
        this.categoryId = categoryId;
    }

    public Place() {
    }

    public Place(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public String getLogoSrc() {
        return logoSrc;
    }

    public void setLogoSrc(String logoSrc) {
        this.logoSrc = logoSrc;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
