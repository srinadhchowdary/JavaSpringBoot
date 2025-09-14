package com.telusko.SpringEcom.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class ValidationAspect {

    private static final Logger logger = LoggerFactory.getLogger(ValidationAspect.class);


    @Around("execution(* com.telusko.SpringEcom.service.ProductService.getProductById(..)) && args(Id)")

    public Object validateAndUpdate(ProceedingJoinPoint jp, int Id) throws Throwable {

        if(Id < 0){
            logger.info("PostId is negative, updating it");
            Id = -Id;
            logger.info("new Value "+Id);
        }
        Object obj = jp.proceed(new Object[]{Id});

        return obj;

    }




}
