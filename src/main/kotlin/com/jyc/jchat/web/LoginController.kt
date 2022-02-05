package com.jyc.jchat.web

import cn.dev33.satoken.id.SaIdUtil.getToken
import cn.dev33.satoken.stp.StpUtil
import com.jyc.jchat.mapper.UserMapper
import com.jyc.jchat.model.LoginModel
import com.jyc.jchat.model.LoginResponseModel
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class LoginController {
    @Autowired
    private lateinit var userMapper: UserMapper

    @PostMapping("/login", produces = ["application/json;charset=UTF-8"])
    fun login(@RequestBody loginModel: LoginModel): LoginResponseModel {
        val rsp = LoginResponseModel()
        val user = userMapper.getFirstByUsername(loginModel.username)
        return if (user == null) {
            rsp.code = 1
            rsp.msg = "用户不存在"
            rsp
        } else if (user.password != loginModel.password) {
            rsp.code = 2
            rsp.msg = "密码错误"
            rsp
        } else {
            StpUtil.login(user.id.toString())
            rsp.code = 0
            rsp.msg = "登录成功"
            val token = StpUtil.getTokenInfo()
            rsp.tokenName = token.tokenName
            rsp.tokenValue = token.tokenValue
            rsp.userName= user.username
            rsp.nickName = user.nickname
            rsp
        }


    }
}