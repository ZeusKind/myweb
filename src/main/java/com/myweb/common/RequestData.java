package com.myweb.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 * 功能说明:
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestData<T> implements Serializable {
  /**
   * 起始页码
   */
  private Integer pageNo;
  /**
   * 每页显示的条数
   */
  private Integer pageSize;
  /**
   * 排序字段
   */
  private String orderBy;
  /**
   * 数据集合类
   */
  private T data;

}
