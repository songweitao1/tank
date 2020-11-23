package com.song.kkb102001;

public class Test {
    public static void main(String[] args) {

        JavaTeacher j = new JavaTeacher("张三","男",38);
        j.work();
        UITeacher uiTeacher = new UITeacher("李四","女",28);
        uiTeacher.work();
        uiTeacher.Drawing(uiTeacher);
    }

}
