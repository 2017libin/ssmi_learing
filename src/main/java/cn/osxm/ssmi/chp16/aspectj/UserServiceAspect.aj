package cn.osxm.ssmi.chp16.aspectj
public aspect UserServiceAspect {
	
	pointcut userServicePointCut() : execution(public * cn.osxm..*.add(..)); 

	before() : userServicePointCut(){
		System.out.println("[UserServiceAspect][before]前置增强");
	}

	after() : userServicePointCut(){
		System.out.println("[UserServiceAspect][after]后置增强");
	}

}