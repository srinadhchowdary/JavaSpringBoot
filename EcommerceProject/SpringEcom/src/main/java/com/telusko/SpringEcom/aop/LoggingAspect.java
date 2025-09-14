package com.telusko.SpringEcom.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.telusko.SpringEcom.service.ProductService.findAllProducts(..))")
    public void logMethodCall(JoinPoint jp) {
        logger.info("Method called : " + jp.getSignature().getName());
    }

    @After("execution(* com.telusko.SpringEcom.service.ProductService.findAllProducts(..))")
    public void logMethodExecuted(JoinPoint jp) {
        logger.info("Method Executed : " + jp.getSignature().getName());
    }

    @AfterThrowing(
            pointcut = "execution(* com.telusko.SpringEcom.service.ProductService.findAllProducts(..))"
    )
    public void logMethodCrash(JoinPoint jp) {
        logger.info("Method crashed : " + jp.getSignature().getName());
    }

    @AfterReturning(
            pointcut = "execution(* com.telusko.SpringEcom.service.ProductService.findAllProducts(..))"
    )
    public void logMethodExecutedSuccess(JoinPoint jp) {
        logger.info("Method Executed Successfully : " + jp.getSignature().getName());
    }

    /*
    @Around("execution(* com.telusko.SpringEcom.service..*(..))")
    public Object logMethodExecution(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        logger.info("➡ Entering method: {}", methodName);

        Object result = joinPoint.proceed(); // execute actual method

        logger.info("⬅ Exiting method: {}", methodName);
        return result;
    }

     */

}
