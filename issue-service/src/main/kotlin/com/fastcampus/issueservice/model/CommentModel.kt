package com.fastcampus.issueservice.model

import com.fastcampus.issueservice.domain.Comment

/**
 * fileName : CommentModel
 * author :  KimSangHoon
 * date : 2022/10/25
 */
data class CommentRequest(
    val body: String,
)

data class CommentResponse(
    val id: Long,
    val issueId: Long,
    val userId: Long,
    val body: String,
    val username: String? = null
)

fun Comment.toResponse() = CommentResponse(
    id = id!!,
    issueId = issue.id!!,
    userId = userId,
    body = body,
    username = username,
)