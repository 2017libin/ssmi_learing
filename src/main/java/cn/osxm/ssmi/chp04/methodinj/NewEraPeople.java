/**
 * @Title: NewEraPeople.java
 * @Package cn.osxm.ssmi.chp4.methodinj
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��1��8�� ����6:49:47
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
		String str = "��ʱ������";
		return str;
	}*/
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		String inputParam = (String)args[0];
		System.out.println("���������"+inputParam);
		// TODO Auto-generated method stub
		String newStr =  inputParam+"����ʱ������";
		System.out.println("�滻�����µ��ַ��������");
		return newStr;
	}

}
