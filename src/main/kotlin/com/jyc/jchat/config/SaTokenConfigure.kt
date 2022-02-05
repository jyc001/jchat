package com.jyc.jchat.config

import cn.dev33.satoken.jwt.StpLogicJwtForStyle
import cn.dev33.satoken.stp.StpLogic
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class SaTokenConfigure{
    @Bean
    fun getStpLogicJwt(): StpLogic? {
        return StpLogicJwtForStyle()
    }

}