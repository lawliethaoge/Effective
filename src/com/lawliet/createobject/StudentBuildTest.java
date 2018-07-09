package com.lawliet.createobject;

/**
 * 测试创建student类
 * @author hao@lawliet.com
 * @since 2018/7/9 12:47
 */
public class StudentBuildTest {
    public static void main(String[] args) {
        Student student = new Student.Builder("孔浩").address("成都").age(18).phone(187).build();
        System.out.println(student.toString());
    }
}
