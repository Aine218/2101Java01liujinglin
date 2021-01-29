package com.daniu101.chapter10.hw2;

/**
 * @author jliu.l
 * @date 2021/1/29
 * 封装一苹果类，其属性有品牌、尺寸、开机状态，打电话和上网行为，
 * 使用关键字private保护尺寸和开机状态在合适的范围内，并建立测试类进行测试。
 * 然后重写toString方法，输出类似10.1.5的第二个toString例子。
 */
public class Apple {
    private String brand;
    private double size;
    private String status;

    public void djh(){
        System.out.println("打电话");
    }

    public void sw(){
        System.out.println("上网");
    }

    @Override
    public String toString() {
        return "你很棒~~";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
