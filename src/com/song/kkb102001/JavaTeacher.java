package com.song.kkb102001;

public class JavaTeacher extends Employee {
    public JavaTeacher(String name, String sex, int age) {
        super(name, sex, age);
    }

    @Override
    public void work() {
        System.out.println("姓名:"+this.getName()+",性别:"+ this.getSex()+",年龄:"+this.getAge() +"38的java老师正在讲解面向对象");
    }
}
