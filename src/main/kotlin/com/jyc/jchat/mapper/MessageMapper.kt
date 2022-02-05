package com.jyc.jchat.mapper

import com.jyc.jchat.mapper.MessageMapper
import com.jyc.jchat.mapper.UserMapper
import com.jyc.jchat.pojo.Message
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param

@Mapper
interface MessageMapper {
    fun deleteByPrimaryKey(id: Long?): Int
    fun insert(record: Message?): Int
    fun insertSelective(record: Message?): Int
    fun selectByPrimaryKey(id: Long?): Message?
    fun updateByPrimaryKeySelective(record: Message?): Int
    fun updateByPrimaryKey(record: Message?): Int
    fun selectById(@Param("id") id: Long?): Message?
}