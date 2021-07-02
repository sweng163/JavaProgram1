package com.DeepDesignPattern.DecoratePattern;

/**
 * @Description:
 * @Author: swengcode
 * @Date: 2019/12/2017:14
 */
public abstract class Drink {

    private float price = 0.0f;
    public String des = "";

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public abstract float cost();

}
