package com.jyc.jchat

import org.apache.logging.log4j.kotlin.Logging
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class JchatApplicationTests {
    companion object:Logging

    @Test
    fun contextLoads() {
        logger.info("1")
    }

}
