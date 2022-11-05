package com.fastcampus.issueservice.domain

import org.hibernate.FetchMode.LAZY
import javax.persistence.*

/**
 * fileName : Comment
 * author :  KimSangHoon
 * date : 2022/10/25
 */
@Entity
@Table
class Comment (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "issue_id")
    val issue: Issue,

    @Column
    var userId: Long,

    @Column
    val username: String,

    @Column
    var body:String,
) : BaseEntity()