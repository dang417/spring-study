package com.in28minutes.learnspringaop.aopexample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LogginAspect {

  private Logger logger = LoggerFactory.getLogger(getClass());

  @Before("com.in28minutes.learnspringaop.aopexample.aspects.CommonPointcutConfig.allPackageConfigUsingBean()")
  public void logMethodCallBeforeExecution(JoinPoint joinPoint) {
    logger.info("Before Aspect - {} is called with arguments: {}", joinPoint, joinPoint.getArgs());
  }

  @After("com.in28minutes.learnspringaop.aopexample.aspects.CommonPointcutConfig.businessAndDataPackageConfig()")
  public void logMethodCallAfterExecution(JoinPoint joinPoint) {
    logger.info("After Aspect - {} has executed", joinPoint);
  }

  @AfterThrowing(pointcut = "com.in28minutes.learnspringaop.aopexample.aspects.CommonPointcutConfig.businessAndDataPackageConfig()", throwing = "exception")
  public void logMethodCallAfterException(JoinPoint joinPoint, Exception exception) {
    logger.info("AfterThrowing Aspect - {} has thrown an exception {}", joinPoint, exception);
  }

  @AfterReturning(pointcut = "com.in28minutes.learnspringaop.aopexample.aspects.CommonPointcutConfig.businessAndDataPackageConfig()", returning = "resultValue")
  public void logMethodCallAfterSuccessfulExecution(JoinPoint joinPoint, Object resultValue) {
    logger.info("AfterReturning Aspect - {} has returned {}", joinPoint, resultValue);
  }

}
