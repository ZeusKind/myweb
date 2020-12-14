package com.myweb.common.utils;

/**
 * 功能说明: 结果集编码常量类
 *
 *
 */
public class ResultCodeConstant {
  public static final String SUCCESS = "200"; // 成功
  public static final String UNAUTHORIZED = "401"; //未授权
  public static final String ARGUMENT_VANISH = "501"; // 缺少参数
  public static final String ARGUMENT_TYPE_MISMATCH = "502"; // 类型错误
  public static final String ARGUMENT_CONSTRAINT_VIOLATION = "503"; // 参数校验错误
  public static final String SYSTEM_ERROR = "500";
  public static final String BUSINESS_SYSTEM_ERROR = "-1";//系统业务异常

  public static final String LOGIN_SUCCESS = "100"; //登录成功
  public static final String LOGIN_USER_MISS = "101"; //用户名为空，请重新输入
  public static final String LOGIN_PSW_MISS = "102"; //密码为空，请重新输入
  public static final String LOGIN_USER_NOT_EXIST = "103"; //没有该用户,请检查用户名是否输入错误
  public static final String LOGIN_FAIL = "104"; //密码错误，请重试


}
