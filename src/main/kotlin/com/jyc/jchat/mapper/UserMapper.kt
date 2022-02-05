package com.jyc.jchat.mapper

import com.jyc.jchat.pojo.User
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select

@Mapper
public interface UserMapper {
    fun deleteByPrimaryKey(id: Long?): Int
    fun insert(record: User?): Int
    fun insertSelective(record: User?): Int
    fun selectByPrimaryKey(id: Long?): User?
    fun updateByPrimaryKeySelective(record: User?): Int
    fun updateByPrimaryKey(record: User?): Int
    fun selectById(@Param("id") id: Long?): User?
    fun getFirstByUsername(@Param("username") username: String?): User?


}