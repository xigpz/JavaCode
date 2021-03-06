package com.yang.reflection;

import com.yang.reflection.entity.Hero;

import java.lang.reflect.Constructor;

public class CreateObjectReflection {
    public static void main(String[] args) {
        //传统的使用new的方式创建对象
        Hero h1 = new Hero();
        h1.name = "teemo";
        System.out.println(h1);

        try {
            //使用反射的方式创建对象
            String className = "com.yang.reflection.entity.Hero";
            //类对象
            Class pClass = Class.forName(className);
            //构造器
            Constructor c = pClass.getConstructor();
            //通过构造器实例化
            Hero h2 = (Hero) c.newInstance();
            h2.name = "gareen";
            System.out.println(h2);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
