package com.example.catolicosfranciscano

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.catolicosfranciscano.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.smile.setOnClickListener(this)
        binding.ajuda.setOnClickListener(this)


    }

    override fun onClick(view: View) {
        if (view.id == R.id.smile) {
            novaTela()
        } else if (view.id == R.id.ajuda)
            outraTela()

    }


    private fun novaTela() {


        startActivity(Intent(this, TerceiraTela::class.java))


    }

    private  fun outraTela(){

        startActivity(Intent(this, QuartaTela::class.java))

    }


}