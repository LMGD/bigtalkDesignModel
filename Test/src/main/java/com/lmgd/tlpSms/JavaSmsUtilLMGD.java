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
public class JavaSmsUtilLMGD {

	// 智能匹配模板发送接口的http地址
	private static String URI_SEND_SMS = "https://sms.yunpian.com/v2/sms/single_send.json";

	// 模板发送接口的http地址
	private static String URI_TPL_SEND_SMS = "https://sms.yunpian.com/v2/sms/tpl_single_send.json";

	// 编码格式。发送编码格式统一用UTF-8
	private static String ENCODING = "UTF-8";

	// private static String apikey =
	// "ec6fee0a7b611b14739515aea7f7554a";//丛拓旅服apikey
	private static String apikey = "43663123056baa8750abda5c0b0bf304";// LMGD的apikey
	private static String text = "【云片网】您的验证码是1234";

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
	public static String sendSms(String text, String mobile) throws IOException {// 多个电话用逗号隔开
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
			// String responseText = sendSms(text, mobile);
			// System.out.println("responseText:" + responseText);

			String jsjOrderComeMessage = "【丛拓旅服】%s您好,您有新接送机订单来了，请及时处理。";
			jsjOrderComeMessage = jsjOrderComeMessage.format(jsjOrderComeMessage, "上海恒契");//【丛拓旅服】上海恒契您好,您有新接送机订单来了，请及时处理。
			System.out.println(jsjOrderComeMessage);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
