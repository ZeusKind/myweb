/*
 * 软件版权: 恒生电子股份有限公司
 * 修改记录:
 * 修改日期     修改人员  修改说明
 * ========    =======  ============================================
 * 2018/12/3  mengjq  新增
 * ========    =======  ============================================
 */
package com.myweb.common;


import com.myweb.common.utils.ResultCodeConstant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 功能说明: 对外统一字符串对象传输
 *
 * @author mengjq
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseData<T> implements Serializable {

	private static final long serialVersionUID = 2237098970999640579L;

	private String code;

	private String message;

	private T data;

	public ResponseData(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public static ResponseData okMessage() {
		return new ResponseData(ResultCodeConstant.SUCCESS, "成功");
	}

	public static ResponseData okMessage(String message) {
		return new ResponseData(ResultCodeConstant.SUCCESS, message);
	}

	public static ResponseData ok(Object data) {
		return new ResponseData(ResultCodeConstant.SUCCESS, "", data);
	}

	public static ResponseData ok(String desc, Object data) {
		return new ResponseData(ResultCodeConstant.SUCCESS, desc, data);
	}

	public static ResponseData fail() {
		return new ResponseData(ResultCodeConstant.BUSINESS_SYSTEM_ERROR, "error");
	}

	public static ResponseData fail(String message) {
		return new ResponseData(ResultCodeConstant.BUSINESS_SYSTEM_ERROR, message);
	}

	public static ResponseData fail(String code, String message) {
		return new ResponseData(code, message);
	}

	public static ResponseData fail(String code, String message, Object data) {
		return new ResponseData(code, message, data);
	}

	public static ResponseData loginStatus(String message) {
		String code = "";
		if (message.equals("用户名为空，请重新输入")){
			code = ResultCodeConstant.LOGIN_USER_MISS;
		}else if (message.equals("密码为空，请重新输入")){
			code = ResultCodeConstant.LOGIN_PSW_MISS;
		}else if (message.equals("没有该用户,请检查用户名是否输入错误")){
			code = ResultCodeConstant.LOGIN_USER_NOT_EXIST;
		} else if (message.equals("登录成功")) {
			code = ResultCodeConstant.LOGIN_SUCCESS;
		}else {
			code = ResultCodeConstant.LOGIN_FAIL;
		}

		return new ResponseData(code,message);
	}

}
