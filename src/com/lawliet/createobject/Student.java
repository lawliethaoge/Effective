package com.lawliet.createobject;

import javax.swing.plaf.ButtonUI;

/**
 * Create student by Builder
 *
 * @author hao@lawliet.com
 * @since 2018/7/9 12:33
 */
public class Student {
    private String name;
    private String address;
    private int age;
    private int phone;

    //内部builder类
    public static class Builder {
        private String name;
        private String address;
        private int age = 0;
        private int phone = 0;

        public Builder(String val) {
            name = val;
        }

        public Builder address(String val) {
            address = val;
            return this;
        }

        public Builder age(int val) {
            age = val;
            return this;
        }

        public Builder phone(int val) {
            phone = val;
            return this;
        }

        public Student build() {
            return new Student(this);
        }


    }

    //构造器
    Student(Builder builder) {
        name = builder.name;
        address = builder.address;
        age = builder.age;
        phone = builder.phone;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                '}';
    }
}
