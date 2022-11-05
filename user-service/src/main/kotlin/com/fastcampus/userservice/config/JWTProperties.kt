package com.fastcampus.userservice.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

/**
 * fileName : JWTProperties
 * author :  KimSangHoon
 * date : 2022/11/03
 */
@ConstructorBinding
@ConfigurationProperties(prefix = "jwt")
data class JWTProperties(
    val issuer: String,
    val subject: String,
    val expiresTime: Long,
    val secret: String,
)