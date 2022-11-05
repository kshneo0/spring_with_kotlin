package com.fastcampus.userservice.domain.repository

import com.fastcampus.userservice.domain.entity.User
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

/**
 * fileName : UserRepository
 * author :  KimSangHoon
 * date : 2022/11/04
 */
interface UserRepository : CoroutineCrudRepository<User, Long> {
    suspend fun findByEmail(email: String) : User?
}