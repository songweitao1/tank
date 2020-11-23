/*
懒汉式
类加载到内存中，只加载一次。JVM保证线程安全
因为用了static 初始化类对象，只要用到Mgr01就会初始化
（不用类初始化类干什么？？？？？）
 */
package com.song.singleton;

public class Mgr01 {
    private static final Mgr01 INSTANCE = new Mgr01();
    private Mgr01(){}

    public static Mgr01 getINSTANCE() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mgr01 mgr01 = Mgr01.getINSTANCE();
        Mgr01 mgr011 = Mgr01.getINSTANCE();
        System.out.println(mgr01 == mgr011);
     }
}
