/**
 * @Title: MyPlugin.java
 * @Package cn.osxm.ssmi.chp12.plugin
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年2月15日 下午10:13:34
 * @version V1.0
 */

package cn.osxm.ssmi.chp12.plugin;
import java.util.Properties;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
/**
  * @ClassName: MyPlugin
  * @Description: TODO
  * @author osxm:oscarxueming
  */

@Intercepts({@Signature(
        type= Executor.class,
        method = "update",
        args = { MappedStatement.class,Object.class})})
public class MyPlugin implements Interceptor {

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }

}
