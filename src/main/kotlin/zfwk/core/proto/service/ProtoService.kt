package zfwk.core.proto.service

import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service
import zfwk.core.base.BaseService
import zfwk.core.ext.loggerFor
import zfwk.core.proto.model.ProtoModel

@Profile("proto")
@Service
class ProtoService :BaseService() {

    fun test(): ProtoModel {
        log.info("test start")

        val result = ProtoModel(one = "one", two = "two")

        log.info("test end")
        return result
    }

}
