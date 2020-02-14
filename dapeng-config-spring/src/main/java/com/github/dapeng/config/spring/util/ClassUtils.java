package com.github.dapeng.config.spring.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class ClassUtils {

    public static <T> Class<T> resolveGenericType(Class<?> declaredClass) {
        ParameterizedType parameterizedType = (ParameterizedType) declaredClass.getGenericSuperclass();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        return (Class<T>) actualTypeArguments[0];
    }
}
