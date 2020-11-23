package com.song.kkb102001;

public class UITeacher extends Employee implements Draw{
    public UITeacher(String name, String sex, int age) {
        super(name, sex, age);
    }

    @Override
    public void work() {
        System.out.println("姓名:"+this.getName()+",性别:"+ this.getSex()+",年龄:"+this.getAge() +"28的UI老师正在讲解产品设计工作流程");
    }

    @Override
    public void Drawing(UITeacher uiTeacher) {
        System.out.println("姓名:"+uiTeacher.getName()+",性别:"+ uiTeacher.getSex()+",年龄:"+uiTeacher.getAge() +"老师正在教大家绘图");
    }
}
