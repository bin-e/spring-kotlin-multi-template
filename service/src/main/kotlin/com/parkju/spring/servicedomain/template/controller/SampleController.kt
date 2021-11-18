package com.parkju.spring.servicedomain.template.controller

import com.parkju.spring.servicedomain.template.contract.SampleContract
import com.parkju.spring.servicedomain.template.service.SampleService
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController(
    private val sampleService: SampleService
) : SampleContract {
    // fun
}