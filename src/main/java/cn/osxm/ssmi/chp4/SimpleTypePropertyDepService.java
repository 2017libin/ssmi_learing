/**
 * @Title: SimpleTypePropertyDepService.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月20日 上午5:51:34
 * @version V1.0
 */

package cn.osxm.ssmi.chp4;

import org.springframework.beans.factory.annotation.Value;

/**
 * @ClassName: SimpleTypePropertyDepService
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class SimpleTypePropertyDepService {
	private int iFoo;

	private String sBar;
	
	public int getiFoo() {

		return iFoo;
	}

	public void setiFoo(int iFoo) {
		this.iFoo = iFoo;
	}

	public String getsBar() {

		return sBar;
	}

	public void setsBar(String sBar) {
		this.sBar = sBar;
	}
	
	public void fooBar() {
		System.out.println("iFoo="+iFoo);
		System.out.println("sBar="+sBar);
	}

}
