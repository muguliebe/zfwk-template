package com.egstep.proto.zfwktemplate.controller

import com.egstep.proto.zfwktemplate.service.OneService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import zfwk.core.base.BaseController

@RestController
@RequestMapping("/one")
class OneController : BaseController() {

    @Autowired lateinit var service: OneService

    fun one() = service.one()

}
