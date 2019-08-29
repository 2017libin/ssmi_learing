/**
 * @Title: MyAnnotationDemo.java
 * @Package cn.osxm.jcodef.func.annotation
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年11月30日 上午5:40:16
 * @version V1.0
 */

package cn.osxm.ssmi.chp05;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @ClassName: MyAnnotationDemo
 * @Description: TODO
 * @author osxm:oscarxueming
 */

@MyAnnotation // 自定义注解使用在类上
public class MyAnnotationDemo {
	@MyAnnotation // 自定义注解使用在方法上
	public void annoMethod() {
		System.out.println("方法本身执行");
	}

	// 入口方法
	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		MyAnnotationDemo myAnnotationDemo = new MyAnnotationDemo();
		//获取使用在类上的自定义注解
		if (myAnnotationDemo.getClass().isAnnotationPresent(MyAnnotation.class)) {
			MyAnnotation annotation = (MyAnnotation) myAnnotationDemo.getClass().getAnnotation(MyAnnotation.class);
			System.out.println(annotation.toString());
		}

		// 获取使用在方法上的自定义注解
		Method annoMethod = myAnnotationDemo.getClass().getMethod("annoMethod");
		//annoMethod.invoke(myAnnotationDemo, null);
		Annotation[] methodAnnotations = annoMethod.getAnnotations();
		if (annoMethod.isAnnotationPresent(MyAnnotation.class)) {
			System.out.println("方法添加了MyAnnotation注解，再干点其他事.....");
		}

	}

}
