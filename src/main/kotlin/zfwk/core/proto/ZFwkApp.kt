package zfwk.core.proto

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Profile

@Profile("proto")
@SpringBootApplication(
    scanBasePackages = ["zfwk"],
    exclude = [DataSourceAutoConfiguration::class]
)
class ZFwkApp

fun main(args: Array<String>) {
    runApplication<ZFwkApp>(*args)
}
