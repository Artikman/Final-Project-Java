package com.company.sapriko.model;

import com.company.sapriko.entity.Depository;

public class DepositoryInfo {

    private int depository_id;
    private String goods;
    private int quantity;
    private String provider;

    private boolean newGoods = false;

    public DepositoryInfo() {
    }

    public DepositoryInfo(Depository depository) {
        this.depository_id = depository.getDepository_id();
        this.goods = depository.getGoods();
        this.quantity = depository.getQuantity();
        this.provider = depository.getProvider();
    }

    public DepositoryInfo(int depository_id, String goods, int quantity, String provider) {
        this.depository_id = depository_id;
        this.goods = goods;
        this.quantity = quantity;
        this.provider = provider;
    }

    public int getDepository_id() {
        return depository_id;
    }

    public void setDepository_id(int depository_id) {
        this.depository_id = depository_id;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProvider() { return provider; }

    public void setProvider(String provider) { this.provider = provider; }

    public boolean isNewGoods() {
        return newGoods;
    }

    public void setNewGoods(boolean newGoods) {
        this.newGoods = newGoods;
    }
}