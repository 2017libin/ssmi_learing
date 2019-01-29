/**
 * @Title: SpELDemo.java
 * @Package cn.osxm.ssmi.chp5
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月14日 上午6:31:45
 * @version V1.0
 */

package cn.osxm.ssmi.chp05;

import java.util.GregorianCalendar;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @ClassName: SpELDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class SpELDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("'Hello World'");
		String message = (String) exp.getValue();
		System.out.println(message);

		exp = parser.parseExpression("'Hello World'.concat('!')");
		message = (String) exp.getValue();
		System.out.println(message);

		exp = parser.parseExpression("'Hello World'.bytes");
		byte[] bytes = (byte[]) exp.getValue();
		System.out.println(bytes);

		exp = parser.parseExpression("'Hello World'.bytes.length");
		int length = (Integer) exp.getValue();
		System.out.println(length);

		exp = parser.parseExpression("new String('hello world').toUpperCase()");
		message = exp.getValue(String.class);
		System.out.println(message);

		GregorianCalendar c = new GregorianCalendar();
		c.set(1856, 7, 9);

	}
}
