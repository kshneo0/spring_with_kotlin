package com.fastcampus.issueservice.domain.enums

/**
 * fileName : IssueType
 * author :  KimSangHoon
 * date : 2022/10/23
 */
enum class IssueType {
    BUG, TASK;

    companion object {
//        fun of(type: String) = valueOf(type.uppercase())
        operator fun invoke(type:String) = valueOf(type.uppercase())
    }
}

fun main(){
//    val type = IssueType.of("BUG")
//    val type = IssueType.invoke("BUG")
    val type = IssueType("BUG")
    println(IssueType.BUG == type)
}