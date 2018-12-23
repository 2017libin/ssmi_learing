/**
 * @Title: SimpleTypePropertyDepService.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2018年12月20日 上午5:51:34
 * @version V1.0
 */

package cn.osxm.ssmi.chp4;

/**
 * @ClassName: SimpleTypePropertyDepService
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class SimpleTypePropertyDepService {
	private int iFoo;

	private String sBar;

	private String baz;

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

	public String getBaz() {

		return baz;
	}

	public void setBaz(String baz) {
		this.baz = baz;
	}

	public void fooBar() {
		System.out.println("iFoo=" + iFoo);
		System.out.println("sBar=" + sBar);
		System.out.println("baz=" + baz);
	}

}
