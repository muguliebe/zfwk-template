package zfwk.core.proto.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.EnableAspectJAutoProxy
import org.springframework.context.annotation.Profile
import zfwk.core.ext.loggerFor

@Profile("proto")
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
class ProtoConfig {

    val log = loggerFor(javaClass)

    @Bean
    fun configProto(): ProtoConfig {
        log.info("protoConfig properly")
        return this
    }
}
