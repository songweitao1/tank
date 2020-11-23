package com.song.kkb;

import java.util.HashSet;
import java.util.Set;

public class Home2Test {
   static class Demo1{
       Student student = new Student("张三","男",20);
       Student student1 = new Student("李四","女",23);
       Student student2 = new Student("张三","男",20);
   }
    public static void main(String[] args) {
       Demo1 demo1 = new Demo1();
        Set<Student> set = new HashSet<>();
        set.add(demo1.student);
        set.add(demo1.student1);
        set.add(demo1.student2);
        for (Student st3 : set) {
            System.out.println(st3.getName() + st3.getSex() + st3.getAge());
        }
    }
}
