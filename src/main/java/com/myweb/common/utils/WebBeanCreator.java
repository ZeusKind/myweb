package com.myweb.common.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebBeanCreator {

    public static Object create(Class clazz, Object request) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (request instanceof Map) {
            ((Map) request).forEach((key, value) -> {
                if (null != value) {
                    map.put(String.valueOf(key), value);
                }
            });
        }
        return BeanCreator.create(clazz, map);
    }

    /**
     * 排除excepts里的值
     * @param clazz
     * @param request
     * @param excepts
     * @return
     */
    public static Object create(Class clazz, Object request, List<String> excepts) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (request instanceof Map) {
            ((Map) request).forEach((key, value) -> {
                if (null != value && !excepts.contains(key)) {
                    map.put(String.valueOf(key), value);
                }
            });
        }
        return BeanCreator.create(clazz, map);
    }

}
