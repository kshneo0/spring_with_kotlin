package com.fastcampus.issueservice.web

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

/**
 * fileName : PageController
 * author :  KimSangHoon
 * date : 2022/11/05
 */
@Controller
class PageController {

    @GetMapping(value = ["", "index"])
    fun index() = "index"

    @GetMapping("/issueapp")
    fun issueApp() = "issueapp"

    @GetMapping("/signup")
    fun signup() = "signup"
}