package org.matthewsanders.rock_paper_scissors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val rock1 = $rock
    val paper1 = $paper
    val scissors1 = $scissors


    fun rockbuttonPressed(view: View){

        val myRandomResult = Random.toString($rock ,$paper ,$scissors)

        computerchoice.text = myRandomResult
    }

}
