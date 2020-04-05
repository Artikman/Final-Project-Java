package com.company.sapriko.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.AfterThrowing;

public class ControllerExceptionAspect {

    private final Logger logger = Logger.getLogger(ControllerExceptionAspect.class);

    @AfterThrowing(
            pointcut = "execution(* com.company.sapriko..controller..*(..))",
            throwing = "exception"
    )
    public void afterThrowingAdvice(final Exception exception) {
        this.logger.error("EXCEPTION IN METHOD - > " + exception.getClass());
    }
}