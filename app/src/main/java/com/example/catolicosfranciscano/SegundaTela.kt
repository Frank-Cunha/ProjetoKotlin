package com.example.catolicosfranciscano

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.catolicosfranciscano.databinding.ActivitySegundaTelaBinding

class SegundaTela : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivitySegundaTelaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySegundaTelaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.editBotao.setOnClickListener(this) //
        binding.editText.setOnClickListener(this)// capturar os dados fornecido pelo usuario


    }


    override fun onClick(view: View) {
        if (view.id == R.id.edit_botao) {
            novaTela()
        } else if (view.id == R.id.texto) {
            novaTela()
        }


    }

    private fun novaTela() {

        val nome = binding.editText.text.toString()
            // instanciando o nome do xml
        if (nome != "") {
            startActivity(Intent(this, MainActivity::class.java))
        } else {
            Toast.makeText(this, "FORNECE UM NOME", Toast.LENGTH_LONG).show()
        }
    }
}
