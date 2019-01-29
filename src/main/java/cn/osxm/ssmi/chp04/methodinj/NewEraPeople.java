/**
 * @Title: NewEraPeople.java
 * @Package cn.osxm.ssmi.chp4.methodinj
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月8日 上午6:49:47
 * @version V1.0
 */

package cn.osxm.ssmi.chp04.methodinj;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

/**
  * @ClassName: NewEraPeople
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class NewEraPeople implements MethodReplacer {

	

	/*public String eat() {
		String str = "新时代吃肉";
		return str;
	}*/
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		String inputParam = (String)args[0];
		System.out.println("传入参数："+inputParam);
		// TODO Auto-generated method stub
		String newStr =  inputParam+"在新时代吃肉";
		System.out.println("替换返回新的字符串或对象");
		return newStr;
	}

}
