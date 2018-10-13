/**   
* @Title: JavaSmsPianYunUtil.java 
* @Package com.lmgd.tlpSms 
* @Description: TODO(用一句话描述该文件做什么) 
* @author SJ
* @date 2018年9月5日 上午9:56:57 
* @version V1.0   
*/
package com.lmgd.tlpSms;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @ClassName JavaSmsPianYunUtil.java
 * @Description
 * @Author LMGD
 * @Date 2018年9月5日
 */
public class JavaSmsPianYunUtil {

	// 智能匹配模板发送接口的http地址
	private static String URI_SEND_SMS = "https://sms.yunpian.com/v2/sms/single_send.json";

	// 模板发送接口的http地址
	private static String URI_TPL_SEND_SMS = "https://sms.yunpian.com/v2/sms/tpl_single_send.json";

	// 编码格式。发送编码格式统一用UTF-8
	private static String ENCODING = "UTF-8";

	private static String apikey = "ec6fee0a7b611b14739515aea7f7554a";// 丛拓旅服apikey
	private static String sendCarSuccess = "【丛拓旅服】[改派成功]您预定的%s服务订单%s已安排，%s,%s为您服务。祝您旅途愉快。";
	// private static String sendOrderCome = "【丛拓旅服】订单来了";

	/**
	 * 智能匹配模板接口发短信
	 *
	 * @param apikey
	 *            apikey
	 * @param text
	 *            短信内容
	 * @param mobile
	 *            接受的手机号
	 * @return json格式字符串
	 * @throws IOException
	 */

	public static String sendSms(String apikey, String text, String mobile) throws IOException {
		Map<String, String> params = new HashMap<String, String>();
		params.put("apikey", apikey);
		params.put("text", text);
		params.put("mobile", mobile);
		return post(URI_SEND_SMS, params);
	}

	/**
	 * 通过模板发送短信(不推荐)
	 *
	 * @param apikey
	 *            apikey
	 * @param tpl_id
	 *            模板id
	 * @param tpl_value
	 *            模板变量值
	 * @param mobile
	 *            接受的手机号
	 * @return json格式字符串
	 * @throws IOException
	 */

	public static String tplSendSms(String apikey, long tpl_id, String tpl_value, String mobile) throws IOException {
		Map<String, String> params = new HashMap<String, String>();
		params.put("apikey", apikey);
		params.put("tpl_id", String.valueOf(tpl_id));
		params.put("tpl_value", tpl_value);
		params.put("mobile", mobile);
		return post(URI_TPL_SEND_SMS, params);
	}

	/**
	 * 基于HttpClient 4.3的通用POST方法
	 *
	 * @param url
	 *            提交的URL
	 * @param paramsMap
	 *            提交<参数，值>Map
	 * @return 提交响应
	 */
	public static String post(String url, Map<String, String> paramsMap) {
		CloseableHttpClient client = HttpClients.createDefault();
		String responseText = "";
		CloseableHttpResponse response = null;
		try {
			HttpPost method = new HttpPost(url);
			if (paramsMap != null) {
				List<NameValuePair> paramList = new ArrayList<NameValuePair>();
				for (Map.Entry<String, String> param : paramsMap.entrySet()) {
					NameValuePair pair = new BasicNameValuePair(param.getKey(), param.getValue());
					paramList.add(pair);
				}
				method.setEntity(new UrlEncodedFormEntity(paramList, ENCODING));
			}
			response = client.execute(method);
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				responseText = EntityUtils.toString(entity, ENCODING);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				response.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return responseText;
	}

	public static void main(String[] args) {
		try {
			String mobile = "18221785249";
			// 发短信调用示例
			String responseText = sendSms(apikey, sendCarSuccess, mobile);
			System.out.println("responseText:" + responseText);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static void main000(String[] args) {
		try {
			// 修改为您的apikey.apikey可在官网（http://www.yunpian.com)登录后获取
			String apikey = "43663123056baa8750abda5c0b0bf304";// LMGD的apikey
			// 修改为您要发送的手机号
			String mobile = "18221785249";
			/**************** 使用智能匹配模板接口发短信(推荐) *****************/
			// 设置您要发送的内容(内容必须和某个模板匹配。以下例子匹配的是系统提供的1号模板）
			String text = "【云片网】您的验证码是1234";
			// String text = "【LMGD】您好！有新订单来啦！！";//此模拟还没有设置
			// 发短信调用示例
			String responseText = sendSms(apikey, text, mobile);
			System.out.println("responseText:" + responseText);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static void main111(String[] args) {
		try {
			/**************** 使用指定模板接口发短信(不推荐，建议使用智能匹配模板接口) ******/
			String apikey = "43663123056baa8750abda5c0b0bf304";// LMGD的apikey
			// 修改为您要发送的手机号
			String mobile = "18221785249";
			// 设置模板ID，如使用1号模板:【#company#】您的验证码是#code#
			long tpl_id = 2110580;
			// 设置对应的模板变量值
			String tpl_value2 = URLEncoder.encode("#code#", ENCODING) + "=" + URLEncoder.encode("1234", ENCODING) + "&"
					+ URLEncoder.encode("#code#", ENCODING) + "=" + URLEncoder.encode("云片网", ENCODING);
			String tpl_value = URLEncoder.encode("#code#", ENCODING) + "=" + URLEncoder.encode("#code#", ENCODING);
			// 模板发送的调用示例
			System.out.println(tpl_value);
			System.out.println(tplSendSms(apikey, tpl_id, tpl_value, mobile));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static void main333(String[] args) throws IOException, URISyntaxException {
		// 修改为您的apikey.apikey可在官网（http://www.yunpian.com)登录后获取
		String apikey = "13898519a92d32e6844f36269ecb1c7e";
		// 修改为您要发送的手机号
		String mobile = "18221785249";
		/**************** 使用智能匹配模板接口发短信(推荐) *****************/
		// 设置您要发送的内容(内容必须和某个模板匹配。以下例子匹配的是系统提供的1号模板）
		String text = "【云片网】您的验证码是1234";
		// 发短信调用示例
		// System.out.println(JavaSmsApi.sendSms(apikey, text, mobile));
		/**************** 使用指定模板接口发短信(不推荐，建议使用智能匹配模板接口) ******/
		// 设置模板ID，如使用1号模板:【#company#】您的验证码是#code#
		long tpl_id = 2110580;
		// 设置对应的模板变量值
		String tpl_value2 = URLEncoder.encode("#code#", ENCODING) + "=" + URLEncoder.encode("1234", ENCODING) + "&"
				+ URLEncoder.encode("#code#", ENCODING) + "=" + URLEncoder.encode("云片网", ENCODING);
		String tpl_value = URLEncoder.encode("#code#", ENCODING) + "=" + URLEncoder.encode("#code#", ENCODING);
		// 模板发送的调用示例
		System.out.println(tpl_value);
		System.out.println(JavaSmsPianYunUtil.tplSendSms(apikey, tpl_id, tpl_value, mobile));
	}
}
