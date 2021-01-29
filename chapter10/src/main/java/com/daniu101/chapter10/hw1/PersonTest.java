package com.daniu101.chapter10.hw1;

/**
 * @author jliu.l
 * @date 2021/1/29
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.setHeight(50);
        p.setAge(150);
        p.setName("芳芳");
        p.pb();
        p.cf();
        System.out.println(p.toString());
    }
}
