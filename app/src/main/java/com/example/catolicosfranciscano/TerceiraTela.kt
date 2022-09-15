package com.example.catolicosfranciscano

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.catolicosfranciscano.R.id.button3
import com.example.catolicosfranciscano.databinding.ActivityMainBinding
import com.example.catolicosfranciscano.databinding.ActivityTerceiraTelaBinding as ActivityTerceiraTelaBinding

class TerceiraTela : AppCompatActivity(), View.OnClickListener {

    private lateinit var  binding: ActivityTerceiraTelaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTerceiraTelaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button3.setOnClickListener(this)



    }

    override fun onClick(view: View) {
        if (view.id == R.id.button3) {
            novaTela()
        }

    }


    private fun novaTela() {


        startActivity(Intent(this, MainActivity::class.java))


    }

}