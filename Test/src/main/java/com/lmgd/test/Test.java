/**   
* @Title: Test.java 
* @Package com.lmgd.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author SJ
* @date 2018年7月24日 上午11:16:39 
* @version V1.0   
*/
package com.lmgd.test;

/**
 *
 * @ClassName Test.java
 * @Description
 * @Author LMGD
 * @Date 2018年7月24日
 */
public class Test {
	public static void main(String[] args) {
		String content = "出发站: 无锡万达广场惠山店 到达站: 浦东国际机场 用车时间: 2018-07-10 17:00	 盛志峰 18861516921 携程订单号: 2151278568 第三方订单号:  160.00";
		// System.out.println(content.indexOf("sb99"));

		int useTimeEndIndex = content.lastIndexOf("-") + 9;
		String rex = "^1[0-9]{10}$";
	   // String name=content.substring(useTimeEndIndex, );

	}
}
