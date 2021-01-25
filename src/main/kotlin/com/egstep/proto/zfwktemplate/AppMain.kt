package com.egstep.proto.zfwktemplate

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(
    scanBasePackages = ["zfwk", "com.egstep"]
)
class AppMain

fun main(args: Array<String>) {
    runApplication<AppMain>(*args)
}
