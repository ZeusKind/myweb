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
}
