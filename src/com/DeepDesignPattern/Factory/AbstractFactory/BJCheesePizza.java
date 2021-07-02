package com.DeepDesignPattern.Factory.AbstractFactory;

/**
 * @Description:
 * @Author: swengcode
 * @Date: 2019/12/1719:13
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("正在准备BJ奶酪pizza的材料");
    }
}
