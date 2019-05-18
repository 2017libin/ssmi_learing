package cn.osxm.ssmi.chp08.aop.aspect;

public aspect UserServiceAspect {
	
	pointcut UserServicePointCut() : execution(public * cn.osxm..*.add(..)); 

	before() : UserServicePointCut(){
		System.out.println("begin intercept");
	}

	after() : UserServicePointCut(){
		System.out.println("end intercept");
	}

}