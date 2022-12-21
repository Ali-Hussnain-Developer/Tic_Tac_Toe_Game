package com.example.tic_tac_toe.activities

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.example.tic_tac_toe.R
import com.example.tic_tac_toe.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var count = 0
    var flag = 0
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val window = this.window
        window.statusBarColor = Color.parseColor(getString(R.color.brown))
        clickListener()
    }
    private fun clickListener() {
        binding.btnNewGame.setOnClickListener {
            newGame()
        }
    }

    fun check(view: View) {
        val btnCurrent = view as Button
        if (btnCurrent.text == "") {
            count++

            if (flag == 0) {
                btnCurrent.text = "X"
                flag = 1
            } else {
                btnCurrent.text = "O"
                flag = 0

            }
            val b1 = btn1.text.toString()
            val b2 = btn2.text.toString()
            val b3 = btn3.text.toString()
            val b4 = btn4.text.toString()
            val b5 = btn5.text.toString()
            val b6 = btn6.text.toString()
            val b7 = btn7.text.toString()
            val b8 = btn8.text.toString()
            val b9 = btn9.text.toString()

            if (b1 == b2 && b2 == b3 && b3 != "") {
                Toast.makeText(applicationContext, "Winner is $b1", Toast.LENGTH_LONG).show()
                newGame()

            } else if (b4 == b5 && b5 == b6 && b6 != "") {

                Toast.makeText(applicationContext, "Winner is $b4", Toast.LENGTH_LONG).show()
                newGame()

            } else if (b7 == b8 && b8 == b9 && b9 != "") {
                Toast.makeText(applicationContext, "Winner is $b7", Toast.LENGTH_LONG).show()
                newGame()

            } else if (b1 == b4 && b4 == b7 && b7 != "") {
                Toast.makeText(applicationContext, "Winner is $b1", Toast.LENGTH_LONG).show()
                newGame()
            } else if (b2 == b5 && b5 == b8 && b8 != "") {
                Toast.makeText(applicationContext, "Winner is $b2", Toast.LENGTH_LONG).show()
                newGame()

            } else if (b3 == b6 && b6 == b9 && b9 != "") {
                Toast.makeText(applicationContext, "Winner is $b3", Toast.LENGTH_LONG).show()
                newGame()

            } else if (b1 == b5 && b5 == b9 && b9 != "") {
                Toast.makeText(applicationContext, "Winner is $b1", Toast.LENGTH_LONG).show()
                newGame()

            } else if (b3 == b5 && b5 == b7 && b7 != "") {
                Toast.makeText(applicationContext, "Winner is $b3", Toast.LENGTH_LONG).show()
                newGame()
            } else if (count == 9) {
                Toast.makeText(applicationContext,
                    getString(R.string.txt_match_draw),
                    Toast.LENGTH_LONG).show()
            }


        }

    }

    fun newGame() {
        btn1.text = ""
        btn2.text = ""
        btn3.text = ""
        btn4.text = ""
        btn5.text = ""
        btn6.text = ""
        btn7.text = ""
        btn8.text = ""
        btn9.text = ""
        count = 0
        flag = 0

    }
}