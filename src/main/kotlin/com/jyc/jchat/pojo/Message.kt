package com.jyc.jchat.pojo

import com.jyc.jchat.mapper.MessageMapper
import com.jyc.jchat.mapper.UserMapper
import java.util.*

class Message {
    var id: Long? = null
    var type: Int? = null
    var data: String? = null
    var datetime: Date? = null
    var userId: Long? = null
}