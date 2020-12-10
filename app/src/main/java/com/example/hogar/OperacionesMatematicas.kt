package com.example.hogar

class OperacionesMatematicas {

    fun sumarNumeros(sumando1: Int, sumando2: Int): Int {
        return sumando1 + sumando2
    }

    fun dividriDosNumeros(dividendo: Int, divisor: Int): Int {
        if (divisor == 0) {
            return 0
        }
        return dividendo / divisor
    }

}