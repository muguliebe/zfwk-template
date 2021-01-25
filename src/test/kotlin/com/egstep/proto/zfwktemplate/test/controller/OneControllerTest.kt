package com.egstep.proto.zfwktemplate.test.controller

import com.egstep.proto.zfwktemplate.controller.OneController
import com.egstep.proto.zfwktemplate.test.base.BaseSpringTest
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate

class OneControllerTest:BaseSpringTest() {

    @Autowired lateinit var controller: OneController
    @Autowired lateinit var restTemplate: TestRestTemplate

    @Test
    fun one() {
        val result = controller.one()

        println("result = ${result}")
    }

    @Test
    fun two() {
    }

}
