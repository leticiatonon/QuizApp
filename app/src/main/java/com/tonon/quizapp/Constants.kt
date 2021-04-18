package com.tonon.quizapp

object Constants{

    const val USER_NAME:String = "user_name"
    const val TOTAL_QUESTIONS:String = "total_questions"
    const val CORRECT_ANSWERS:String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "No ano do ataque as torres gêmeas em Nova Iorque, quem era o presidente americano?",
            "Ronald Reagan",
            "George W. Bush",
            "Bill Clinton",
            "George H. W. Bush",
            2
        )
        questionsList.add(que1)


        val que2 = Question(
            2,
            "Por qual filme, Meryl Streep, ganhou seu primeiro Oscar?",
            "Kramer vs. Kramer",
            "A escolha de Sofia ",
            "A dama de ferro",
            "Silkwood, retrato de uma coragem",
            1
        )
        questionsList.add(que2)


        val que3 = Question(
            3,
            "Quem ficou famosa na história como uma das principais engenheiras por trás do projeto Apollo, maior feito da NASA?",
            "Margaret Heafield",
            "Rose Blends",
            "Anie Parks",
            "Não tinha nenhuma mulher",
            1
        )
        questionsList.add(que3)


        val que4 = Question(
            4,
            "Onde fica localizado o Vale do Silício?",
            "Fremont",
            "Santa Clara",
            "San José",
            "San Francisco",
            4
        )
        questionsList.add(que4)


        val que5 = Question(
            5,
            "\"A mente que se abre a uma nova ideia jamais volta a seu tamanho original.\" Quem é o autor dessa frase? ",
            "Maquiavel",
            "Einstein",
            "Platão",
            "Nietzsche",
            2
        )
        questionsList.add(que5)


        val que6 = Question(
            6,
            "Qual o planeta mais quente já descoberto?",
            "ULAS J1120+0641",
            "Puppis A",
            "WASP-12b",
            "TrES-4",
            3
        )
        questionsList.add(que6)


        val que7 = Question(
            7,
            "Qual é o segundo livro mais vendido do mundo?",
            "Bíblia",
            "O Senhor dos Anéis",
            "O Pequeno Príncipe",
            "Dom Quixote",
            4
        )
        questionsList.add(que7)


        val que8 = Question(
            8,
            "Quem pintou \"Guernica\"?",
            "Pablo Picasso",
            "Tarsila do Amaral",
            "Salvador Dalí",
            "Diego Rivera",
            1
        )
        questionsList.add(que8)


        val que9 = Question(
            9,
            "Qual a montanha mais alta do Brasil?",
            "Pico Paraná",
            "Monte Roraima",
            "Pico da Bandeira",
            "Pico da Neblina",
            4
        )
        questionsList.add(que9)


        val que10 = Question(
            10,
            "Em que período da pré-história o fogo foi descoberto?",
            "Idade Média",
            "Neolítico",
            "Paleolítico",
            "Período da Pedra Polida",
            3
        )
        questionsList.add(que10)


        return questionsList
    }

}