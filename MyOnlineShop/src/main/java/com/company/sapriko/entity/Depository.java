package com.company.sapriko.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Depository")
public class Depository implements Serializable {

    private static final long serialVersionUID = -1000119078147252957L;

    private int depository_id;
    private String goods;
    private int quantity;
    private String provider;

    public Depository() {
    }

    @Id
    @Column(name = "depository_id", nullable = false)
    public int getDepository_id() {
        return depository_id;
    }

    public void setDepository_id(int depository_id) {
        this.depository_id = depository_id;
    }

    @Column(name = "goods", length = 10, nullable = false)
    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    @Column(name = "quantity", nullable = false)
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Column(name = "provider", length = 25, nullable = false)
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}