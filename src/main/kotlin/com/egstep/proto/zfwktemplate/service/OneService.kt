package com.egstep.proto.zfwktemplate.service

import org.springframework.stereotype.Service
import zfwk.core.base.BaseService

@Service
class OneService : BaseService() {

    fun one() = "one"

}
