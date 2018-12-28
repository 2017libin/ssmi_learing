/**
 * @Title: BeforeTransaction.java
 * @Package cn.osxm.ssmi.chp11
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018��12��28�� ����9:28:36
 * @version V1.0
 */

package cn.osxm.ssmi.chp11;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.core.Ordered;
import org.springframework.util.StopWatch;

/**
 * @ClassName: BeforeTransaction
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class BeforeTransaction implements Ordered {
	private int order;

	/**
	 * Title: getOrder Description:
	 * 
	 * @return
	 * @see org.springframework.core.Ordered#getOrder()
	 */

	@Override
	public int getOrder() {
		return this.order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	// around���͵���ǿ
	public Object foo(ProceedingJoinPoint call) throws Throwable {
		System.out.println("����ǰ��ǰִ��");

		Object returnValue;
		StopWatch clock = new StopWatch(getClass().getName());
		try {
			clock.start(call.toShortString());
			returnValue = call.proceed();
		} finally {
			clock.stop();
			System.out.println(clock.prettyPrint());
		}
		return returnValue;
	}

}
