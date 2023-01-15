package com.daiane.meurobomarciano

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class RespostaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resposta)

        intent.getStringExtra("resposta")
        var resposta = findViewById<TextView>(R.id.respostaFinal)
        resposta.text= intent.getStringExtra("resposta")

        var botaoVoltar = findViewById<Button>(R.id.button_secundario)
        botaoVoltar.setOnClickListener(
            View.OnClickListener {
                finish()
            })

    }
}