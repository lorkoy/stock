/**
 * 
 */
package com.stock.job;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author ray
 *
 */
//@Component
@Aspect
public class JobWatcher {
	
	
	
	@Pointcut("execution(* com.stock.job.StockDataJob.stockDataJob(..))")
	public void proxyAspect(){
		
	}
	
	
	 @Before("proxyAspect()")
	    public void doException(JoinPoint joinPoint,Exception ex){
	        Object target = joinPoint.getTarget();
	        System.out.println("watcher start");
	    }

}
