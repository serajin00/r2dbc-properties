package com.serajin00

import io.r2dbc.pool.ConnectionPool
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.r2dbc.R2dbcProperties
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import kotlin.test.assertEquals

@RunWith(SpringRunner::class)
@SpringBootTest
class SingleAppR2dbcPropertiesTest {

    @Autowired
    lateinit var properties: R2dbcProperties

    @Autowired
    lateinit var connectionPool: ConnectionPool

    @Test
    fun test() {
        assertEquals(1, properties.pool.initialSize)
    }
}