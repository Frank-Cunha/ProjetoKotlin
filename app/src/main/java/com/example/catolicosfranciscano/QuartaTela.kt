package com.example.catolicosfranciscano

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.catolicosfranciscano.databinding.ActivityQuartaTelaBinding
import com.example.catolicosfranciscano.databinding.ActivityTerceiraTelaBinding

class QuartaTela : AppCompatActivity(), View.OnClickListener {

    private lateinit var  binding: ActivityQuartaTelaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuartaTelaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener(this)



    }

    override fun onClick(view: View) {
        if (view.id == R.id.button2) {
            novaTela()
        }

    }


    private fun novaTela() {


        startActivity(Intent(this, MainActivity::class.java))


    }

}