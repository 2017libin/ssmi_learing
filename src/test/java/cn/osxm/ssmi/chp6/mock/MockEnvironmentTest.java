/**
 * @Title: MockEnvironmentTest.java
 * @Package cn.osxm.ssmi.chp6.mock
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月23日 下午9:36:31
 * @version V1.0
 */

package cn.osxm.ssmi.chp6.mock;

import static org.junit.Assert.assertTrue;

import java.util.Properties;

import org.junit.After;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.PropertySource;
import org.springframework.mock.env.MockEnvironment;

import cn.osxm.ssmi.com.User;

/**
 * @ClassName: MockEnvironmentTest
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class MockEnvironmentTest {
	AbstractApplicationContext applicationContext = null;

    // @Before
    public void setUp() {
        // MockEnvironment environment = new MockEnvironment();

        // environment.setProperty("my.name", "张三");
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml", MockEnvironmentTest.class);
        // applicationContext.setEnvironment(environment);

        // applicationContext.addBeanFactoryPostProcessor(postProcessor);

        MockEnvironment env = new MockEnvironment();
        // env.getPropertySources().addFirst(ps);
        env.setProperty("foo", "111");
        env.setProperty("${jdbc.url}", "111");

        PropertySourcesPlaceholderConfigurer pc = new PropertySourcesPlaceholderConfigurer();

        PropertySource<?> ps = new PropertySource<Object>("simplePropertySource", new Object()) {
            @Override
            public Object getProperty(String key) {
                return "bar";
            }
        };
        pc.setProperties(new Properties() {
            {
                setProperty("foo", "local");
            }
        });
        pc.setEnvironment(env);
        pc.postProcessBeanFactory(applicationContext.getBeanFactory());

        /*
         * env.getPropertySources().addFirst(ps); //pc.setLocalOverride(false);
         * //pc.setEnvironment(new MockEnvironment().withProperty("my.name", "张三"));
         * pc.setProperties(new Properties() {{ setProperty("my.name", "local"); }});
         * pc.setEnvironment(new MockEnvironment().withProperty("my.name",
         * "enclosing"));
         */

        applicationContext.refresh();
    }

    // @Test
    public void testGet() {
        User user = (User) applicationContext.getBean("user");
        System.out.println(user.getName());
        assertTrue(user.getName().equals("张三"));
    }

    // @Test
    public void testAnno() {
        MockEnvironment env = new MockEnvironment();
        env.setProperty("name", "123456");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.setEnvironment(env);
        // ctx.register(MyAppConfig.class);
        ctx.register(MyAppConfig.class);
        ctx.refresh();

        User user = (User) ctx.getBean("user");

        assertTrue(user.getName().equals("张三"));
    }

    // @Test
    public void test11() {
        MockEnvironment env = new MockEnvironment();
        env.setProperty("name", "123456");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.setEnvironment(env);
        ctx.register(User.class);

        ctx.refresh();
        User user = (User) ctx.getBean("user");
        System.out.println(user.getName());
    }

    // @Test
    public void test2() {
        MockEnvironment env = new MockEnvironment();
        env.setProperty("name", "Oscar");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.setEnvironment(env);
        ctx.register(MyAppConfig.class);
        ctx.register(PropertySourcesPlaceholderConfigurer.class);
        ctx.refresh();
        try {
            User user = (User) ctx.getBean("user");
            System.out.println(user.getName());
        } finally {
            ctx.close();
        }
    }

    @Test
    public void test3() {
        DefaultListableBeanFactory bf = new DefaultListableBeanFactory();
        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(User.class);
        beanDefinition.getPropertyValues().add("name", "${name}");
        bf.registerBeanDefinition("user", beanDefinition);

        PropertySourcesPlaceholderConfigurer pc = new PropertySourcesPlaceholderConfigurer();
        pc.setEnvironment(new MockEnvironment().withProperty("name", "Oscar"));
        pc.postProcessBeanFactory(bf);

        User user = (User) bf.getBean("user");
        System.out.println(user.getName());
    }

    @After
    public void tearDown() {
        // applicationContext.close();
    }
}
