package br.com.cotemig.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button7 = findViewById<Button>(R.id.button7)
        var buttonAC = findViewById<Button>(R.id.buttonAC)
        var resultado = findViewById<TextView>(R.id.textViewResultado)

        buttonAC.setOnClickListener {
            resultado.text = "0"
        }

        button7.setOnClickListener {
            resultado.text = "7"
        }
    }
}