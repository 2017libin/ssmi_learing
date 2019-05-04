/**
 * @Title: HelloWorldApplet.java
 * @Package cn.osxm.ssmi.chp07.applet
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月12日 下午10:39:46
 * @version V1.0
 */

package cn.osxm.ssmi.chp07.applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 * @ClassName: HelloWorldApplet
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class HelloWorldApplet extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    @Override
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.drawString("Hello World!", 5, 35);
	}

}
