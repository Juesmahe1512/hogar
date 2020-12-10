package com.example.hogar

import org.junit.Test  


import org.junit.Assert.*
import org.junit.runner.RunWith
/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */


@RunWith(RunnerTest::class)
class ExampleUnitTest {
    @Test
    fun funciona() {
        val prueba = MainActivity()
        assertEquals(4, prueba.test(2, 2))
    }
}