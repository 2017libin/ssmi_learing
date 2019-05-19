package cn.osxm.ssmi.chp16.aspectj
public aspect UserServiceAspect {
	
	pointcut userServicePointCut() : execution(public * cn.osxm..*.add(..)); 

	before() : userServicePointCut(){
		System.out.println("[UserServiceAspect][before]ǰ����ǿ");
	}

	after() : userServicePointCut(){
		System.out.println("[UserServiceAspect][after]������ǿ");
	}

}