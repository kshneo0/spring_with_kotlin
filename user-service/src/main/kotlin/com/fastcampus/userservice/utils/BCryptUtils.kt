package com.fastcampus.userservice.utils

import at.favre.lib.crypto.bcrypt.BCrypt

/**
 * fileName : BCryptUtils
 * author :  KimSangHoon
 * date : 2022/11/04
 */
object BCryptUtils {
    fun hash(password: String) =
        BCrypt.withDefaults().hashToString(12, password.toCharArray())

    fun verify(password: String, hashedPassword: String) =
        BCrypt.verifyer().verify(password.toCharArray(), hashedPassword).verified
}