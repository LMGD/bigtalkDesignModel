package com.lmgd.gaodeAPI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * 用java实现地理位置转换，坐标转换，行驶距离计算（高德地图）
 */
public class MapUtil {
	public static String getHttpResponse(String allConfigUrl) {
		BufferedReader in = null;
		StringBuffer result = null;
		try {
			// url请求中如果有中文，要在接收方用相应字符转码
			URI uri = new URI(allConfigUrl);
			URL url = uri.toURL();
			URLConnection connection = url.openConnection();
			connection.setRequestProperty("Content-type", "text/html");
			connection.setRequestProperty("Accept-Charset", "utf-8");
			connection.setRequestProperty("contentType", "utf-8");
			connection.connect();
			result = new StringBuffer();
			// 读取URL的响应
			in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
			String line;
			while ((line = in.readLine()) != null) {
				result.append(line);
			}
			return result.toString();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return null;
	}

	/**
	 * 
	 * @param origin
	 *            :stJW
	 * @param destination
	 *            :endJW
	 * @return 2017年9月21日
	 * @Description:高德获取起点到终点距离和花费时间,和获得adcode区域代码。
	 */
	public static Map<String, Integer> getDistanceAndTimeAndCode(String origin, String destination) {// origin:起点
		Map<String, Integer> map = new HashMap<String, Integer>();
		JSONObject gaodeResult = new JSONObject();
		String preApi = "http://restapi.amap.com/v3/direction/driving?strategy=0&origin=";
		String url = preApi + origin + "&destination=" + destination + "&key=5cf4f29826bffca928cb6a49d23313b2";
		System.out.println(url);
		gaodeResult = JSONObject.parseObject(getHttpResponse(url));// gaodeResult={"info":"INSUFFICIENT_ABROAD_PRIVILEGES","infocode":"20011","status":"0"}

		if (gaodeResult.get("status").toString().equals("1")) {// 请求成功
			JSONObject route = new JSONObject();
			route = (JSONObject) gaodeResult.get("route");
			JSONArray results = route.getJSONArray("paths");// []
			System.out.println(results.size());//长度为1

			for (Object obj : results) {//虽然遍历但是和JSONArray.getJSONObject(int index);一样的效果。
				JSONObject result = JSON.parseObject(obj.toString());
				Integer distance = result.getInteger("distance") / 1000 + 1;// 距离
				Integer duration = result.getInteger("duration") / 60;// 时间
				map.put("distance", distance);
				map.put("forecast", duration);

				// 取出区域代码
				String adcode = null;
				JSONArray steps = (JSONArray) result.get("steps");
				for (Object s : steps) {
					JSONObject stepsResult = JSON.parseObject(s.toString());
					JSONArray cities = (JSONArray) stepsResult.get("cities");
					for (Object c : cities) {
						JSONObject citiesResult = JSON.parseObject(c.toString());
						adcode = (String) citiesResult.get("adcode");
						if (null != adcode)
							break;
					}
				}
				map.put("adcode", Integer.parseInt(adcode));
				return map;
			}
		} else {
			return null;
		}
		return null;
	}

	/**
	 * 高德地图WebAPI : 驾车路径规划 计算两地之间行驶的距离(米)、和时间<br/>
	 * String origins:起始坐标<br/>
	 * String destination:终点坐标
	 */
	public static Map<String, String> getDistanceAndTime(String origins, String destination) {
		int strategy = 0;// 0速度优先（时间）1费用优先（不走收费路段的最快道路）2距离优先 3不走快速路 4躲避拥堵
							// 5多策略（同时使用速度优先、费用优先、距离优先三个策略计算路径）。6不走高速 7不走高速且避免收费
							// 8躲避收费和拥堵 9不走高速且躲避收费和拥堵
		String url = "http://restapi.amap.com/v3/direction/driving?" + "origin=" + origins + "&destination="
				+ destination + "&strategy=" + strategy + "&extensions=all&key=5cf4f29826bffca928cb6a49d23313b2";

		JSONObject jsonobject = JSONObject.parseObject(getHttpResponse(url));
		JSONObject routeObject = (JSONObject) jsonobject.get("route");
		JSONArray pathArray = (JSONArray) routeObject.get("paths");
		String distance = pathArray.getJSONObject(0).getString("distance");// 距离米
		String duration = pathArray.getJSONObject(0).getString("duration");// 时间秒

		Map<String, String> map = new HashMap<String, String>();
		map.put("distance", distance);
		map.put("duration", duration);
		return map;
	}

	public static void main(String[] args) {
		String origins = "121.5076040000,31.2345610000";
		String destination = "121.4979910000,31.2261950000";

		Map<String, String> map = getDistanceAndTime(origins, destination);//这个
		String distance = map.get("distance");
		String duration = map.get("duration");

		Map<String, Integer> distanceAndTimeAndCode = getDistanceAndTimeAndCode(origins, destination);//和这个是一样的
		String _11 = map.get("distance");
		String _22 = map.get("duration");

	}
}
