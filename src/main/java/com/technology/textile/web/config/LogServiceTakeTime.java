package com.technology.textile.web.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 日志
 * @date 2017年4月10日 下午3:21:25
 * @version V1.0
 */
@Aspect
@Component
public class LogServiceTakeTime {

	final static Logger log = LoggerFactory.getLogger(LogServiceTakeTime.class);

	@Pointcut("execution(* com.technology.textile.web.service..*.*(..))")
	public void performance() {
	}

	@Around("performance()")
	public Object doLog(ProceedingJoinPoint joinPoint) throws Throwable {

		// 记录起始时间
		long begin = System.currentTimeMillis();
		Object result = "";
		/** 执行目标方法 */
		try {
			result = joinPoint.proceed();
		} catch (Exception e) {
			log.error("日志记录发生错误, errorMessage: {}", e.getMessage());
		} finally {
			log.info("class:" + joinPoint.getSignature().getDeclaringTypeName() + "	===	method:"
					+ joinPoint.getSignature().getName() + " === start!!!");
			/** 记录操作时间 */
			long took = (System.currentTimeMillis() - begin) / 1000;
			if (took >= 10) {
				log.error("Service 执行时间为: {}秒", took);
			} else if (took >= 5) {
				log.warn("Service 执行时间为: {}秒", took);
			} else if (took >= 2) {
				log.info("Service执行时间为: {}秒", took);
			}
		}
		return result;
	}

	@Before("performance()")
	public void doBefore(JoinPoint joinPoint) throws Throwable {
		// 接收到请求，记录请求内容
		log.info("doBefore");
	}

//    @AfterReturning(returning = "ret", pointcut = "performance()")
//    public void doAfterReturning(Object ret) throws Throwable {
//        // 处理完请求，返回内容
//    	log.info("doAfterReturning");
//    }

}