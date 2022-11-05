package com.fastcampus.issueservice.model

import com.fasterxml.jackson.annotation.JsonFormat
import com.fastcampus.issueservice.domain.Comment
import com.fastcampus.issueservice.domain.Issue
import com.fastcampus.issueservice.domain.enums.IssuePriority
import com.fastcampus.issueservice.domain.enums.IssueStatus
import com.fastcampus.issueservice.domain.enums.IssueType
import java.time.LocalDateTime

/**
 * fileName : IssueModel
 * author :  KimSangHoon
 * date : 2022/10/23
 */

data class IssueRequest(
    val summary: String,
    val description: String,
    val type: IssueType,
    val priority: IssuePriority,
    val status: IssueStatus,
)

data class IssueResponse(
    val id: Long,
    val comments: List<CommentResponse> = emptyList(),
    val summary: String,
    val description: String,
    val userId: Long,
    val type: IssueType,
    val priority: IssuePriority,
    val status: IssueStatus,

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    val createdAt: LocalDateTime?,
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    val updatedAt: LocalDateTime?,
) {
    companion object {
        operator fun invoke(issue: Issue) =
            with(issue) {
                IssueResponse(
                    id = id!!,
                    comments = comments.sortedByDescending(Comment::id).map(Comment::toResponse),
                    summary = summary,
                    description = description,
                    userId = userId,
                    type = type,
                    priority = priority,
                    status = status,

                    createdAt = createdAt,
                    updatedAt = updatedAt,
                )
            }
    }
}