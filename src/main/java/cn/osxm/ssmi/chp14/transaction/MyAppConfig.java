/**
 * @Title: MyAppConfig.java
 * @Package cn.osxm.ssmi.chp14.transaction
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月11日 下午6:10:28
 * @version V1.0
 */

package cn.osxm.ssmi.chp14.transaction;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.interceptor.TransactionProxyFactoryBean;

/**
 * @ClassName: MyAppConfig
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class MyAppConfig {
	@Bean("myTransactionProxyFactoryBean")
	public TransactionProxyFactoryBean getProxyFactoryBean(PlatformTransactionManager txManager) {
		TransactionProxyFactoryBean proxyFactoryBean = new TransactionProxyFactoryBean();
		// proxyFactoryBean.setTarget(service);
		proxyFactoryBean.setTransactionManager(txManager);

		Properties prop = new Properties();
		prop.setProperty("save*", "PROPAGATION_REQUIRED");
		proxyFactoryBean.setTransactionAttributes(prop);
		return proxyFactoryBean;
	}

	@Bean("transactionManager")
	public PlatformTransactionManager getTransactionManager(DataSource dataSource) {
		PlatformTransactionManager transactionManager = new DataSourceTransactionManager(dataSource);
		return transactionManager;
	}
}
