package com.daniu101.chapter10.hw1;

/**
 * @author jliu.l
 * @date 2021/1/29
 * 封装一个人类，其属性有姓名、身高、年龄，吃饭和跑步行为，
 * 使用关键字private保护身高和年龄在合适的范围内，
 * 并建立测试类进行测试。然后重写toString方法，
 * 输出类似10.1.5的第一个toString例子。
 */
public class Person {
    private String name;
    private double height;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }

    public void pb(){
        System.out.println("跑步");
    }

    public void cf(){
        System.out.println("吃饭");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height < 0){
            System.out.println("你输入的身高有误");
        }else{
            this.height = height;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 130){
            System.out.println("你输入的年龄有误");
        }else{
            this.age = age;
        }

    }
}
