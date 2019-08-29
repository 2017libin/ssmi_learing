/**
 * @Title: LauncherTest.java
 * @Package cn.osxm.ssmi.chp06.junit5
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年4月4日 下午11:03:14
 * @version V1.0
 */

package cn.osxm.ssmi.chp06.junit5;

import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import static org.junit.platform.engine.discovery.DiscoverySelectors.*;
/**
  * @ClassName: LauncherTest
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class LauncherTest {
	 @SuppressWarnings("unused")
	public void launcher() {
	        LauncherFactory lf;
	        LauncherDiscoveryRequestBuilder lr;
	    }

	    @SuppressWarnings("unused")
		public void laucherExecute() {
	        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
	                .selectors(
	                        selectPackage("cn.osxn"),
	                        selectClass(MyTest.class)
	                )
	                .filters(
	                      //  org.junit.platform.engine.discovery.ClassNameFilter.includeClassNamePatterns(".*Tests")
	                )
	                .build();
	 
	        Launcher launcher = LauncherFactory.create();
	        //通过监听器来监听获取执行结果
	        TestExecutionListener listener = new SummaryGeneratingListener();
	        launcher.registerTestExecutionListeners(listener);

	    }
}
