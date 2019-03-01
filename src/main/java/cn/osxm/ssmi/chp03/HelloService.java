/**
 * @Title: HelloService.java
 * @Package cn.osxm.ssmi.chp03
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年2月25日 下午8:05:19
 * @version V1.0
 */

package cn.osxm.ssmi.chp03;

/**
 * @ClassName: HelloService
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class HelloService {

	private String name;

	private HelloDao helloDao;

	// 构造器注入，不需要setter方法
	public HelloService(String name) {
		this.name = name;
	}

	//属性注入，需要setter方法
	public void setHelloDao(HelloDao helloDao) {
		this.helloDao = helloDao;
	}

	public HelloDao getHelloDao() {
		return helloDao;
	}

	public void sayHello() {
		System.out.println("Hello," + this.name);
		helloDao.insert();
	}
}
