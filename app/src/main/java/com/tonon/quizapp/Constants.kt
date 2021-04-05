package com.tonon.quizapp

object Constants{

    const val USER_NAME:String = "user_name"
    const val TOTAL_QUESTIONS:String = "total_questions"
    const val CORRECT_ANSWERS:String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "A Qual país pertence essa bandeira?",
            R.drawable.ic_flag_of_brazil,
            "Argentina",
            "Brasil",
            "chile",
            "Peru",
            2
        )
        questionsList.add(que1)


        val que2 = Question(
            2,
            "A Qual país pertence essa bandeira?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Brasil",
            "Venezuela",
            "Colombia",
            1
        )
        questionsList.add(que2)


        val que3 = Question(
            3,
            "A Qual país pertence essa bandeira?",
            R.drawable.ic_flag_of_australia,
            "Australia",
            "Inglaterra",
            "Áustria",
            "Nova Zelândia",
            1
        )
        questionsList.add(que3)


        val que4 = Question(
            4,
            "A Qual país pertence essa bandeira?",
            R.drawable.ic_flag_of_belgium,
            "Alemanha",
            "Holanda",
            "Áustria",
            "Bélgica",
            4
        )
        questionsList.add(que4)


        val que5 = Question(
            5,
            "A Qual país pertence essa bandeira?",
            R.drawable.ic_flag_of_denmark,
            "Egito",
            "Dinamarca",
            "Djibouti",
            "Dominica",
            2
        )
        questionsList.add(que5)


        val que6 = Question(
            6,
            "A Qual país pertence essa bandeira?",
            R.drawable.ic_flag_of_fiji,
            "Andorra",
            "Kosovo",
            "Fiji",
            "Ucrânia",
            3
        )
        questionsList.add(que6)


        val que7 = Question(
            7,
            "A Qual país pertence essa bandeira?",
            R.drawable.ic_flag_of_germany,
            "Romênia",
            "Hungria",
            "Áustria",
            "Alemanha",
            4
        )
        questionsList.add(que7)


        val que8 = Question(
            8,
            "A Qual país pertence essa bandeira?",
            R.drawable.ic_flag_of_india,
            "India",
            "Tailândia",
            "Gibraltar",
            "Filipinas",
            1
        )
        questionsList.add(que8)


        val que9 = Question(
            9,
            "A Qual país pertence essa bandeira?",
            R.drawable.ic_flag_of_kuwait,
            "Malásia",
            "Maldivas",
            "Indonesia",
            "Kuwait",
            4
        )
        questionsList.add(que9)


        val que10 = Question(
            10,
            "A Qual país pertence essa bandeira?",
            R.drawable.ic_flag_of_new_zealand,
            "Tuvalu",
            "Austrália",
            "Nova Zelândia",
            "Polinésia",
            3
        )
        questionsList.add(que10)


        return questionsList
    }

}