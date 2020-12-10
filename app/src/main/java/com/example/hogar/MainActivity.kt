package com.example.hogar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        prueba()
    }

    fun prueba(){
        var texto: TextView
        texto = findViewById(R.id.hello)
        texto.setText("Modificado")

    }

    fun test(data1:Int,data2:Int):Int{

        return data1+data2

    }
}