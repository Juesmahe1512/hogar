package com.example.hogar

import org.junit.Assert
import org.junit.Test

class OperacionesMatematicasTest {

    @Test
    fun sumarNumeros_ParametrosCorrectos_SumaExitosa() {

        //Arrange
        var operacionesMatematicas = OperacionesMatematicas()
        var esperado: Int = 9

        //Act
        var resultado = operacionesMatematicas.sumarNumeros(6, 4)

        //Assert
        Assert.assertEquals(esperado, resultado)

    }

    @Test
    fun divirDosNumeros_ParametrosCorrectos_DivisionExitosa() {

    }

    @Test
    fun dividirDosNumeros_DivisionPorCero_ResultadoCero() {

        //Arrange
        var operacionesMatematicas = OperacionesMatematicas()
        var esperado: Int = 0

        //Act
        var resultado = operacionesMatematicas.dividriDosNumeros(5, 0)

        //Assert
        Assert.assertEquals(esperado, resultado)
    }
}