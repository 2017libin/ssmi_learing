/**
 * @Title: CollectionDepBeanClass.java
 * @Package cn.osxm.ssmi.chp4
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年1月6日 下午4:05:22
 * @version V1.0
 */

package cn.osxm.ssmi.chp04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @ClassName: CollectionDepBeanClass
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class CollectionDepBeanClass {
	private List myList = new ArrayList();
	private Map myMap = new HashMap();
	private Properties myProperties = new Properties();

	private Set mySet = new HashSet();
	
	public CollectionDepBeanClass(List myList) {
		this.myList = myList;
	}
	
	public List getMyList() {
	
		return myList;
	}
	public void setMyList(List myList) {
		this.myList = myList;
	}
	public Map getMyMap() {
	
		return myMap;
	}
	public void setMyMap(Map myMap) {
		this.myMap = myMap;
	}
	public Set getMySet() {
	
		return mySet;
	}
	public void setMySet(Set mySet) {
		this.mySet = mySet;
	}

	public Properties getMyProperties() {
		
		return myProperties;
	}
	public void setMyProperties(Properties myProperties) {
		this.myProperties = myProperties;
	}
}
