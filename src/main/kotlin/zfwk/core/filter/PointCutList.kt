package zfwk.core.filter

import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Pointcut

@Aspect
class PointCutList {

    @Pointcut("allController()")
    fun pointController() {
    }

    @Pointcut("within(zfwk.core.base.BaseController+)")
    fun allController() {
    }

}
