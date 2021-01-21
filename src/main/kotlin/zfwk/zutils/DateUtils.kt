package zfwk.zutils

import ch.qos.logback.classic.Logger
import org.slf4j.LoggerFactory
import java.time.OffsetDateTime
import java.time.ZoneId

object DateUtils {
    val log = LoggerFactory.getLogger(DateUtils::class.java) as Logger

    val zoneId: ZoneId = ZoneId.of("Asia/Seoul")

    // TimeStamp(yyyy.MM.dd HH:mm:ss) 리턴
    fun currentTimeStamp(): OffsetDateTime = OffsetDateTime.now(zoneId)

}

