package com.song.kkb;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Home1 {
   /** 题目一

    请编写main()方法，按以下要求顺序
     定义一个Set集合，并存储以下数据：
                    刘备，关羽，张飞，刘备，张飞
     打印集合大小
     使用迭代器遍历集合，并打印每个元素
     使用增强for遍历集合，并打印每个元素
*/
   Set<String> set = new HashSet<>();

   public static void main(String[] args) {
       Set<String> set = new HashSet<>();
       set.add("刘备");
       set.add("关羽");
       set.add("张飞");
       set.add("刘备");
       set.add("关羽");
       /*使用迭代器遍历集合*/
       for (Iterator<String> it = set.iterator(); it.hasNext(); ) {
           String it1 = it.next();
           System.out.println(it1);
       }
       System.out.println();
       Iterator<String> iterator = set.iterator();
       while (iterator.hasNext()){
           String string = iterator.next();
           System.out.println(string);
       }
//       使用for循环遍历
       for (String s : set) {
           System.out.println(s);
       }
   }
}
