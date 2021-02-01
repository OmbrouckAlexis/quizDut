package fr.iutlens.ombrouck_arnault.quiz

import com.example.quizdut.R

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            id = 1,
            question ="Qui est ce guitariste ?",
            R.drawable.angus_young,
            option1 = "Angus Young",
            option2 = "Eddy Mitchell",
            option3 = "Slash",
            option4 = "Jerry Garcia",
            correctAnswer = 1
        )

        val que2 = Question(
            id = 2,
            question ="Qui est ce guitariste ?",
            R.drawable.slash,
            option1 = "Chuck Berry",
            option2 = "Slash",
            option3 = "Ron Asheton",
            option4 = "Paul Simon",
            correctAnswer = 2
        )

        val que3 = Question(
            id = 3,
            question ="Qui est ce guitariste ?",
            R.drawable.billie_joe_armstrong,
            option1 = "Billie Joe Armstrong",
            option2 = "Chuck Berry",
            option3 = "Peter Green",
            option4 = "Ry Cooder",
            correctAnswer = 1
        )

        val que4 = Question(
            id = 4,
            question ="Qui est ce guitariste ?",
            R.drawable.brian_may,
            option1 = "Steve Cropper",
            option2 = "Otis Rush",
            option3 = "Brian May",
            option4 = "Bonnie Raitt",
            correctAnswer = 3
        )

        val que5 = Question(
            id = 5,
            question ="Qui est ce guitariste ?",
            R.drawable.eric_clapton,
            option1 = "Hubert Sumlin",
            option2 = "Eric Clapton",
            option3 = "Freddie King",
            option4 = "Bo Diddley",
            correctAnswer = 2
        )

        val que6 = Question(
            id = 6,
            question ="Qui est ce guitariste ?",
            R.drawable.george_harrison,
            option1 = "Eddie Van Halen",
            option2 = "Scotty Moore",
            option3 = "George Harrison",
            option4 = "Jimmy Page",
            correctAnswer = 3
        )

        val que7 = Question(
            id = 7,
            question ="Qui est ce guitariste ?",
            R.drawable.jack_white,
            option1 = "Jonny Greenwood",
            option2 = "Mike Bloomfield",
            option3 = "Jack White",
            option4 = "Carl Perkins",
            correctAnswer = 3
        )

        val que8 = Question(
            id = 8,
            question ="Qui est ce guitariste ?",
            R.drawable.jimmy_page,
            option1 = "Jimmy Page",
            option2 = "Phil Collins",
            option3 = "Frank Zappa",
            option4 = "Keith Richards",
            correctAnswer = 1
        )

        val que9 = Question(
            id = 9,
            question ="Qui est ce guitariste ?",
            R.drawable.kurt_cobain,
            option1 = "Jeff Beck",
            option2 = "Pete Townshend",
            option3 = "Kurt Cobain",
            option4 = "Damien Saez",
            correctAnswer = 3
        )

        val que10 = Question(
            id = 10,
            question ="Qui est ce guitariste ?",
            R.drawable.jimmy_hendrix,
            option1 = "Carlos Santana",
            option2 = "Billy Gibbons",
            option3 = "Jimmy Hendrix",
            option4 = "Willie Nelson",
            correctAnswer = 3
        )

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        questionsList.add(que6)
        questionsList.add(que7)
        questionsList.add(que8)
        questionsList.add(que9)
        questionsList.add(que10)
        return questionsList
    }
}