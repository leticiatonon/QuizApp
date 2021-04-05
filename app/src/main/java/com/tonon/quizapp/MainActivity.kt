package com.tonon.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.get
import com.tonon.quizapp.databinding.ActivityMainBinding

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        val botao = binding.btnStart
        val usuario = binding.nomeUsuario

        botao.setOnClickListener {
            if (usuario.text.toString().isEmpty()){
                Toast.makeText(this,"Por favor, insira o seu nome", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this, QuizQuestion::class.java)
                intent.putExtra(Constants.USER_NAME, usuario.text.toString())
                startActivity(intent)
                finish()
            }

        }
    }
}