/**
 * @Title: HelloService.java
 * @Package cn.osxm.ssmi.chp03
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019��2��25�� ����8:05:19
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

	// ������ע�룬����Ҫsetter����
	public HelloService(String name) {
		this.name = name;
	}

	//����ע�룬��Ҫsetter����
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
