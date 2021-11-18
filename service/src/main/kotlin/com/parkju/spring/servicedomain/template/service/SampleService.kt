package com.parkju.spring.servicedomain.template.service

import com.parkju.spring.servicedomain.template.repository.SampleRepository
import org.springframework.stereotype.Service

@Service
class SampleService(
    private val sampleRepository: SampleRepository
) {
    // fun
}