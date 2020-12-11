package com.myweb.common.utils;


import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.util.StringUtils;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Map;

/**
 * 功能：
 */
public class BeanCreator {

  /**
   * Map转化Bean
   * @param clazz Class
   * @param map Map
   * @return Object
   */
  public static Object create(Class clazz, Map<String, Object> map) {
    Iterator<String> iterator = map.keySet().iterator();
    Object tempObject = initBean(clazz);
    String paramName;
    String realFieldName;
    PropertyDescriptor descriptor = null;
    // 返回值类型
    Class type;
    while (iterator.hasNext()) {
      paramName = iterator.next().toString();
      realFieldName = paramName;
      try {
        descriptor = PropertyUtils.getPropertyDescriptor(tempObject, realFieldName);
        // 1、不存在setter方法，忽略
        if (null == descriptor) {
          continue;
        }
        // 2、数组类型、忽略
        type = descriptor.getReadMethod().getReturnType();
        if (type.isArray()) {
          continue;
        }
        String sourceValue = map.get(paramName).toString();

        // 转换原始参数值
        Object convertValue = convertValue(type, sourceValue);
        // 反射设置目标对象
        descriptor.getWriteMethod().invoke(tempObject, convertValue);
      } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException | ParseException e) {
        e.printStackTrace();
      }
    }
    return tempObject;
  }

  /**
   * 使用类的默认构造方法初始化
   *
   * @param clazz Class
   * @return Object
   */
  private static Object initBean(Class clazz) {
    try {
      return clazz.newInstance();
    } catch (InstantiationException | IllegalAccessException e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * 值转换
   *
   * @param type        转换目标类型
   * @param sourceValue 原始值
   * @return Object
   * @throws ParseException ParseException
   */
  private static Object convertValue(Class type, String sourceValue) throws ParseException {
    Object tempValue = null;
    // 1、常规类型转换 java.lang.String
    String returnTypeClassName = type.getName();
    if (returnTypeClassName.equalsIgnoreCase("java.lang.String")) {
      tempValue = sourceValue;
    } else if (!StringUtils.isEmpty(sourceValue.trim())) {
      if (returnTypeClassName.equalsIgnoreCase("long")
          || returnTypeClassName.equalsIgnoreCase("java.lang.Long")) {
        tempValue = new Long(sourceValue);
      } else if (returnTypeClassName.equalsIgnoreCase("int")
          || returnTypeClassName.equalsIgnoreCase("java.lang.Integer")) {
        tempValue = new Integer(sourceValue);
      } else if (returnTypeClassName.equalsIgnoreCase("short")
          || returnTypeClassName.equalsIgnoreCase("java.lang.Short")) {
        tempValue = new Short(sourceValue);
      } else if (returnTypeClassName.equalsIgnoreCase("float")
          || returnTypeClassName.equalsIgnoreCase("java.lang.Float")) {
        tempValue = new Float(sourceValue);
      } else if (returnTypeClassName.equalsIgnoreCase("double")
          || returnTypeClassName.equalsIgnoreCase("java.lang.Double")) {
        tempValue = new Double(sourceValue);
      } else if (returnTypeClassName.equalsIgnoreCase("boolean")
          || returnTypeClassName.equalsIgnoreCase("java.lang.Boolean")) {
        tempValue = new Boolean(sourceValue);
      } else if (returnTypeClassName.equalsIgnoreCase("java.math.BigDecimal")) {
        tempValue = new BigDecimal(sourceValue);
      } else if (returnTypeClassName.equalsIgnoreCase("java.util.Date")
          || returnTypeClassName.equalsIgnoreCase("java.sql.Date")) {
        // yyyy-MM-dd
        if (sourceValue.length() == 10) {
          tempValue = new SimpleDateFormat("yyyy-MM-dd")
              .parse(sourceValue);
          // yyyy-MM
        } else if (sourceValue.length() == 7) {
          tempValue = new SimpleDateFormat("yyyy-MM").parse(sourceValue);
          // yyyy
        } else if (sourceValue.length() == 4) {
          tempValue = new SimpleDateFormat("yyyy").parse(sourceValue);
          // yyyy-MM-dd HH:mm:ss
        } else if (sourceValue.length() == 19) {
          tempValue = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
              .parse(sourceValue);
          // yyyy-MM-dd HH:mm
        } else if (sourceValue.length() == 16) {
          tempValue = new SimpleDateFormat("yyyy-MM-dd HH:mm")
              .parse(sourceValue);
          // yyyy-MM-dd HH
        } else if (sourceValue.length() == 13) {
          tempValue = new SimpleDateFormat("yyyy-MM-dd HH")
              .parse(sourceValue);
        } else if (sourceValue.length() > 19) {
          tempValue = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
              .parse(sourceValue);
        }
      } else if (returnTypeClassName.equalsIgnoreCase("char")) {
        tempValue = (Character.valueOf(sourceValue.charAt(0)));
      }
    }
    return tempValue;
  }
}
