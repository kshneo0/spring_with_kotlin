package com.fastcampus.issueservice.domain

import org.springframework.data.jpa.repository.JpaRepository

/**
 * fileName : CommentRepository
 * author :  KimSangHoon
 * date : 2022/10/25
 */
interface CommentRepository : JpaRepository<Comment, Long> {
    fun findByIdAndUserId(id: Long, userId: Long): Comment?
}