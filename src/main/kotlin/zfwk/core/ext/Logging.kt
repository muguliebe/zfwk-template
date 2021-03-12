package zfwk.core.ext

import org.slf4j.LoggerFactory

interface Logging

fun <T> loggerFor(clazz: Class<T>) = LoggerFactory.getLogger(clazz)!!
//val log = loggerFor(javaClass)
//fun <T : Logging> T.log(): Logger = loggerFor(javaClass)
