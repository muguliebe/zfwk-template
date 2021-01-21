@file:Suppress("MemberVisibilityCanBePrivate")

package zfwk.zutils

import ch.qos.logback.classic.Logger
import org.slf4j.LoggerFactory
import java.time.Instant
import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter

object DateUtils {
    val log = LoggerFactory.getLogger(DateUtils::class.java) as Logger

    val zoneId: ZoneId = ZoneId.of("Asia/Seoul")

    fun now(): LocalDateTime = LocalDateTime.ofInstant(Instant.now(), zoneId)

    // 현재 일시를 지정한 포맷으로 리턴
    fun currentDateTimeFormat(format: String): String = now().format(DateTimeFormatter.ofPattern(format))

    // TimeStamp(yyyy.MM.dd HH:mm:ss) 리턴
    fun currentTimeStamp(): OffsetDateTime = OffsetDateTime.now(zoneId)
    fun currentTimestampString(): String = currentDateTimeFormat("yyyy-MM-dd HH:mm:ss")

}

