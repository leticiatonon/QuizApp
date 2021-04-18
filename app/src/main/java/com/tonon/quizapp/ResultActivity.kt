package com.tonon.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tonon.quizapp.databinding.ActivityResultBinding

@Suppress("DEPRECATION")
class ResultActivity : AppCompatActivity() {

    lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val username = intent.getStringExtra(Constants.USER_NAME)
        val txtUsername = binding.username
        txtUsername.text = username

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val correctAnswer = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)

        val txtQuestions = binding.totalQuestions
        txtQuestions.text = "Sua pontuação é $correctAnswer de $totalQuestions"

        if(correctAnswer >=5 ) {

        }else{
            val resultText = binding.congratulations
            resultText.text = "Tente novamente!"

            val imgView = binding.trophy
            imgView.setImageResource(R.drawable.tryagain)
        }

        val finish = binding.btnFinish
        finish.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}