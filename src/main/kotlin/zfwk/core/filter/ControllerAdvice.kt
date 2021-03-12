package zfwk.core.filter

import ch.qos.logback.classic.Logger
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import zfwk.core.ext.loggerFor

@Aspect
@Component
class ControllerAdvice {

    companion object {
        private val log = LoggerFactory.getLogger("ControllerAdvice") as Logger
    }

    @Around("PointCutList.allController()")
    fun aroundController(pjp: ProceedingJoinPoint): Any? {
        log.info("controller start")
        var result: Any? = null

        try{
            result = pjp.proceed()
        }catch (e:Exception) {
            throw e
        }
        log.info("controller end")

        return result
    }
}
