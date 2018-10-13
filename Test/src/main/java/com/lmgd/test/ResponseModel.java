package com.lmgd.test;

import com.alibaba.fastjson.JSON;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.lmgd.test.ResponseModel.CODE;

public class ResponseModel {
	public static enum CODE {
		LMGD, ok, fail, sb
	}

	private static ResponseModel.CODE code;
	private String message;
	private Object res;
	private String returnCode;

	private ResponseModel(ResponseModel.CODE code, String message, Object object) {
		this.code = code;
		this.message = message;
		this.res = object;
	}

	private ResponseModel(ResponseModel.CODE code, String message, String returnCode) {
		this.code = code;
		this.message = message;
		this.returnCode = returnCode;
	}

	public static ResponseModel build(ResponseModel.CODE code) {
		ResponseModel model = new ResponseModel(code, null, null);
		return model;
	}

	public static ResponseModel build(ResponseModel.CODE code, String message) {
		ResponseModel model = new ResponseModel(code, message, null);
		return model;
	}

	public static ResponseModel build(ResponseModel.CODE code, String message, String returnCode) {
		ResponseModel model = new ResponseModel(code, message, returnCode);
		return model;
	}

	public static ResponseModel build(ResponseModel.CODE code, String message, Object object) {
		ResponseModel model = new ResponseModel(code, message, object);
		return model;
	}

	public static ResponseModel ok() {
		return ResponseModel.build(ResponseModel.CODE.ok, ResponseModel.CODE.ok.name());
	}

	public static ResponseModel fail() {
		return ResponseModel.build(ResponseModel.CODE.fail, ResponseModel.CODE.fail.name());
	}

	public static ResponseModel sb() {
		return ResponseModel.build(ResponseModel.CODE.sb, ResponseModel.CODE.sb.name());
	}

	public String getReturnCode() {
		return returnCode;
	}

	public ResponseModel setReturnCode(String returnCode) {
		this.returnCode = returnCode;
		return this;
	}

	public static ResponseModel fail(String message) {
		return ResponseModel.build(ResponseModel.CODE.fail, message);
	}

	public static ResponseModel fail(String message, String returnCode) {
		return ResponseModel.build(ResponseModel.CODE.fail, message, returnCode);
	}

	public static ResponseModel ok(String message, String returnCode) {
		return ResponseModel.build(ResponseModel.CODE.ok, message, returnCode);
	}

	public Object getRes() {
		return res;
	}

	public boolean isOk() {
		return this.code == ResponseModel.CODE.ok;

	}

	public ResponseModel setResult(Object obj) {
		this.res = obj;
		return this;
	}

	public ResponseModel setResultAndMessage(Object obj, String message) {
		this.res = obj;
		this.message = message;
		return this;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String toJSON() {
		return JSON.toJSONString(this);
	}

	public String toDateJSON(String format) {
		return JSON.toJSONStringWithDateFormat(this, format, SerializerFeature.WriteDateUseDateFormat);
	}

	public static void main(String[] args) {
		// ResponseModel.CODE fail = ResponseModel.CODE.fail;
		// ResponseModel.CODE ok = ResponseModel.CODE.ok;
		// ResponseModel.CODE sb = ResponseModel.CODE.sb;
		//
		// String name = ResponseModel.CODE.ok.name();
		// String sbStr = ResponseModel.CODE.sb.name();
		// System.out.println(fail);// fail
		// System.out.println(sb);// sb
		//
		// System.out.println(ResponseModel.CODE.LMGD);// LMGD

//		String json = ResponseModel.ok().setResult("index").toJSON();// {"message":"ok","ok":true,"res":"index"}
//		String json2 = ResponseModel.fail().setResult("index").toJSON();// {"message":"fail","ok":false,"res":"index"}
//		String json3 = ResponseModel.sb().setResult("index").toJSON();// {"message":"sb","ok":false,"res":"index"}
//
//		System.out.println(json);
//		System.out.println(json2);// {"message":"fail","ok":false,"res":"index"}
//		System.out.println(json3);// {"message":"sb","ok":false,"res":"index"}
		
		
		code=ResponseModel.CODE.ok;
		System.out.println(code+",--"+ResponseModel.CODE.ok.name());//ok
		code=ResponseModel.CODE.fail;
		System.out.println(code+",--"+ResponseModel.CODE.fail.name());//fail
	}
}
