package com.code4flex.design.module.sample.application.aspect;

import com.code4flex.design.module.sample.infrastructure.annotation.OperationLogger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 访问日志
 *
 * @author mavin
 */
@Aspect
@Component
public aspect LoggerAspect {

    private static final Logger log = LoggerFactory.getLogger(LoggerAspect.class);

    /**
     * 配置切点
     */
    @Pointcut("@annotation(com.code4flex.design.module.sample.infrastructure.annotation.OperationLogger)")
    public void logRecordPointCut() { }

    /**
     * 处理完请求后处理
     *
     * @param joinPoint 切点
     */
    @AfterReturning(pointcut = "logRecordPointCut()")
    public void doAfterReturning(JoinPoint joinPoint)
    {
        handleLogger(joinPoint, null);
    }

    /**
     * 拦截异常处理
     *
     * @param joinPoint 切点
     * @param e 异常
     */
    @AfterThrowing(value = "logRecordPointCut()", throwing = "e")
    public void doAfterThrowing(JoinPoint joinPoint, Exception e)
    {
        handleLogger(joinPoint, e);
    }

    /**
     * 日志处理
     * @param joinPoint
     * @param e
     */
    protected void handleLogger(final JoinPoint joinPoint, final Exception e)
    {

    }

    /**
     * 是否存在注解，如果存在就获取
     */
    private OperationLogger getAnnotationLog(JoinPoint joinPoint) throws Exception
    {
        Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method method = methodSignature.getMethod();

        if (null != method) {
            return method.getAnnotation(OperationLogger.class);
        }
        return null;
    }
}
