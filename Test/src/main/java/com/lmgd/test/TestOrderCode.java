/**
package com.lmgd.test;

import java.util.Calendar;

public class TestOrderCode {

	public String getOrderCode() {
		StringBuffer sb = new StringBuffer();
		sb.append(getYearWeek());
		String count = (int) redisCacheManager.hincr("pcOrder", sb.toString(), 1) + "";
		for (int i = count.length(); i < 4; i++) {
			sb.append("0");
		}
		sb.append(count);
		return sb.toString();
	}

	public String getYearWeek() {
		Calendar c = Calendar.getInstance();
		int y = c.get(Calendar.YEAR) - 2016;
		int i = c.get(Calendar.WEEK_OF_YEAR);
		String yearWeek = "";
		if (y < 10) {
			yearWeek = "0" + y;
		} else {
			yearWeek = "" + y;
		}
		yearWeek += "4";
		if (i < 10) {
			yearWeek += "0" + i;
		} else {
			yearWeek += "" + i;
		}
		return yearWeek;
	}

}
**/