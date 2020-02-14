package com.github.dapeng.demo;

import java.lang.reflect.Method;

public class ReflectBeanMain {

    public static void main(String[] args) throws Exception {
        Method method = DemoAnnotationApplication.class.getMethod("main", String[].class);
        method.invoke(null, (Object) new String[]{});


        System.out.println("app");

    }
}
