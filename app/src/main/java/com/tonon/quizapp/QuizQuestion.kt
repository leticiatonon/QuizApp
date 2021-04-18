package com.tonon.quizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.view.get
import com.tonon.quizapp.databinding.ActivityQuizQuestionBinding

@Suppress("DEPRECATION")
class QuizQuestion : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0
    private var mUserName: String? = null

    lateinit var binding: ActivityQuizQuestionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.decorView.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN

        mUserName = intent.getStringExtra(Constants.USER_NAME)

        mQuestionsList = Constants.getQuestions()

        setQuestion()


        val optionOne = binding.optionOne
        val optionTwo = binding.optionTwo
        val optionThree = binding.optionThree
        val optionFour = binding.optionFour
        val submit = binding.submit

        optionOne.setOnClickListener(this)
        optionTwo.setOnClickListener(this)
        optionThree.setOnClickListener(this)
        optionFour.setOnClickListener(this)
        submit.setOnClickListener(this)


    }

    fun setQuestion(){
   
        val question = mQuestionsList!![mCurrentPosition - 1]

        defaultOptionsView()

        if (mCurrentPosition == mQuestionsList!!.size){
            val submit = binding.submit
            submit.text = "FINALIZAR"
        } else{
            val submit = binding.submit
            submit.text = "RESPONDER"
        }


        val progressBar = binding.progressBar
        progressBar.progress = mCurrentPosition
        val textProgress = binding.textProgress

        textProgress.text = "$mCurrentPosition" + "/" + progressBar.max


        val questionTitle = binding.question
        questionTitle.text = question!!.question


        val optionOne = binding.optionOne
        optionOne.text = question.optionOne

        val optionTwo = binding.optionTwo
        optionTwo.text = question.optionTwo

        val optionThree = binding.optionThree
        optionThree.text = question.optionThree

        val optionFour = binding.optionFour
        optionFour.text = question.optionFour
    }


    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()

        val optionOne = binding.optionOne
        val optionTwo = binding.optionTwo
        val optionThree = binding.optionThree
        val optionFour = binding.optionFour

        options.add(0, optionOne)
        options.add(1, optionTwo)
        options.add(2, optionThree)
        options.add(3, optionFour)

        for(option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.bg_border)
        }

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.option_one ->{
                val optionOne = binding.optionOne
                selectedOptionView(optionOne,1)
            }
            R.id.option_two ->{
                val optionTwo = binding.optionTwo
                selectedOptionView(optionTwo,2)
            }
            R.id.option_three ->{
                val optionThree = binding.optionThree
                selectedOptionView(optionThree,3)
            }
            R.id.option_four ->{
                val optionFour = binding.optionFour
                selectedOptionView(optionFour,4)
            }
            R.id.submit ->{
                if(mSelectedOptionPosition == 0){
                    mCurrentPosition++

                    when{
                        mCurrentPosition <= mQuestionsList!!.size ->{
                            setQuestion()
                        }else ->{
                            val intent = Intent(this, ResultActivity::class.java)
                            intent.putExtra(Constants.USER_NAME, mUserName)
                            intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
                            intent.putExtra(Constants.TOTAL_QUESTIONS, mQuestionsList!!.size)
                            startActivity(intent)
                            finish()
                        }
                    }
                }else{
                    val question = mQuestionsList?.get(mCurrentPosition -1)
                    if(question!!.correctAnswer != mSelectedOptionPosition){
                        answerView(mSelectedOptionPosition, R.drawable.wrong_bg_border)
                    }else{
                        mCorrectAnswers++
                    }
                    answerView(question.correctAnswer, R.drawable.correct_bg_border)

                    if(mCurrentPosition == mQuestionsList!!.size){
                        val submit = binding.submit
                        submit.text = "FINALIZAR"
                    }else{
                        val submit = binding.submit
                        submit.text = "PRÓXIMA PERGUNTA"
                    }
                    mSelectedOptionPosition = 0
                }
            }
        }
    }

    private fun answerView(answer: Int, drawableView: Int){
        val optionOne = binding.optionOne
        val optionTwo = binding.optionTwo
        val optionThree = binding.optionThree
        val optionFour = binding.optionFour

        when(answer){
            1 ->{
                optionOne.background = ContextCompat.getDrawable(this, drawableView)
            }
            2 ->{
                optionTwo.background = ContextCompat.getDrawable(this, drawableView)
            }
            3 ->{
                optionThree.background = ContextCompat.getDrawable(this, drawableView)
            }
            4 ->{
                optionFour.background = ContextCompat.getDrawable(this, drawableView)
            }
        }
    }

    private fun selectedOptionView(tv:TextView, selectedOptionNum: Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this, R.drawable.selected_bg_border)
    }


}