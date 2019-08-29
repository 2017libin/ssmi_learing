/**
 * @Title: MyAnnotationDemo.java
 * @Package cn.osxm.jcodef.func.annotation
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018��11��30�� ����5:40:16
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

@MyAnnotation // �Զ���ע��ʹ��������
public class MyAnnotationDemo {
	@MyAnnotation // �Զ���ע��ʹ���ڷ�����
	public void annoMethod() {
		System.out.println("��������ִ��");
	}

	// ��ڷ���
	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		MyAnnotationDemo myAnnotationDemo = new MyAnnotationDemo();
		//��ȡʹ�������ϵ��Զ���ע��
		if (myAnnotationDemo.getClass().isAnnotationPresent(MyAnnotation.class)) {
			MyAnnotation annotation = (MyAnnotation) myAnnotationDemo.getClass().getAnnotation(MyAnnotation.class);
			System.out.println(annotation.toString());
		}

		// ��ȡʹ���ڷ����ϵ��Զ���ע��
		Method annoMethod = myAnnotationDemo.getClass().getMethod("annoMethod");
		//annoMethod.invoke(myAnnotationDemo, null);
		Annotation[] methodAnnotations = annoMethod.getAnnotations();
		if (annoMethod.isAnnotationPresent(MyAnnotation.class)) {
			System.out.println("���������MyAnnotationע�⣬�ٸɵ�������.....");
		}

	}

}
