package com.fastcampus.userservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

/**
 * fileName : FastcampusUserServiceApplication
 * author :  KimSangHoon
 * date : 2022/11/01
 */

@SpringBootApplication
@ConfigurationPropertiesScan
class FastcampusUserServiceApplication

fun main(args: Array<String>) {
    runApplication<FastcampusUserServiceApplication>(*args)
}