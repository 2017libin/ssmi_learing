/**
 * @Title: TestJavaJson.java
 * @Package cn.osxm.ssmi.chp09
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年6月5日 下午10:27:17
 * @version V1.0
 */

package cn.osxm.ssmi.chp09;

import org.junit.BeforeClass;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

/**
 * @ClassName: TestJavaJson
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class TestJavaJson {
	@Test
	public void gsonTest() {
		long start = System.currentTimeMillis();
		for (long i = 0; i < 1000000; i++) {
			User userObj = new User(100, "Zhang San");
			Gson gson = new Gson();
			String jsonStr = gson.toJson(userObj);
			System.out.println(jsonStr);
			User newUserObj = gson.fromJson(jsonStr, User.class);
			System.out.println(newUserObj);

			int[] ints = { 1, 2, 3, 4, 5 };
			String arrayJsonStr = gson.toJson(ints);
			System.out.println(arrayJsonStr);
			int[] intsNew = gson.fromJson("[1,2,3,4,5]", int[].class);
			System.out.println(intsNew);
		}
		System.out.println((System.currentTimeMillis() - start) + "ms"); // 50692ms
	}

	// @Test
	public void fastjsonTest() {
		long start = System.currentTimeMillis();
		for (long i = 0; i < 1000000; i++) {
			User userObj = new User(100, "Zhang San");
			String jsonStr = JSON.toJSONString(userObj, true);
			System.out.println(jsonStr);
			User newUserObj = JSON.parseObject(jsonStr, User.class);
			System.out.println(newUserObj);

			int[] ints = { 1, 2, 3, 4, 5 };
			String arrayJsonStr = JSON.toJSONString(ints);
			System.out.println(arrayJsonStr);
			int[] intsNew = JSON.parseObject(arrayJsonStr, ints.getClass());
			System.out.println(intsNew);
		}
		System.out.println((System.currentTimeMillis() - start) + "ms"); // 31326ms

	}

	// @Test
	public void jacksonTest() throws Exception {
		long start = System.currentTimeMillis();
		for (long i = 0; i < 1000000; i++) {

			User userObj = new User(100, "Zhang San");
			ObjectMapper mapper = new ObjectMapper();
			String jsonStr = mapper.writeValueAsString(userObj);
			System.out.println(jsonStr);
			User newUserObj = mapper.readValue(jsonStr, User.class);
			System.out.println(newUserObj);

			int[] ints = { 1, 2, 3, 4, 5 };
			String arrayJsonStr = mapper.writeValueAsString(ints);
			System.out.println(arrayJsonStr);
			int[] intsNew = mapper.readValue(arrayJsonStr, ints.getClass());
			System.out.println(intsNew);
		}
		System.out.println((System.currentTimeMillis() - start) + "ms");// 63878ms

	}

}
