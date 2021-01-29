package com.daniu101.chapter10.hw2;

/**
 * @author jliu.l
 * @date 2021/1/29
 */
public class AppleTest {
    public static void main(String[] args) {
        Apple p = new Apple();
        p.setSize(50);
        p.setBrand("四");
        p.setStatus("开机");
        System.out.println(p.toString());
    }
}
