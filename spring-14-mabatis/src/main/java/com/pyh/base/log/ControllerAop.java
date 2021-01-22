package com.pyh.base.log;

import com.pyh.base.bean.ResultBean;
import com.sun.xml.internal.ws.api.model.CheckedException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ControllerAop {
    private static final Logger logger = LoggerFactory.getLogger(ControllerAop.class);

    public Object handlerControllerMethod(ProceedingJoinPoint pjp) {
        long startTime = System.currentTimeMillis();

        ResultBean<?> result;

        try {

            System.out.println(pjp.proceed());
            result = (ResultBean<?>) pjp.proceed();
            logger.info(pjp.getSignature() + "use time:" + (System.currentTimeMillis() - startTime));
        } catch (Throwable e) {
            result = handlerException(pjp, e);
        }

        return result;
    }

    private ResultBean<?> handlerException(ProceedingJoinPoint pjp, Throwable e) {
        ResultBean<?> result = new ResultBean();

        // 已知异常
        if (e instanceof CheckedException) {
            result.setMsg(e.getLocalizedMessage());
            result.setCode(ResultBean.FAIL);
        } else {
            logger.error(pjp.getSignature() + " error ", e);

            result.setMsg(e.toString());
            result.setCode(ResultBean.FAIL);

        }

        return result;
    }
}
