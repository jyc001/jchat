package com.jyc.jchat.model

import java.io.Serializable

class LoginResponseModel:Serializable {
    var code:Int?=null
    var msg:String?=null
    var userName:String?=null
    var nickName:String?=null
    var tokenName:String?=null
    var tokenValue:String?=null
}