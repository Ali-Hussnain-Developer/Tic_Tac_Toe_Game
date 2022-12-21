package com.example.tic_tac_toe.activities

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tic_tac_toe.R

class SplashActivity : AppCompatActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val window = this.window
        window.statusBarColor = Color.parseColor(getString(R.color.purple_700))
        val td: Thread = object : Thread() {
            override fun run() {
                try {
                    sleep(3000)
                } catch (ex: Exception) {
                    ex.printStackTrace()
                } finally {
                    val intent = Intent(this@SplashActivity, MainActivity::class.java)
                    startActivity(intent)
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP)
                    finish()

                }
            }
        }
        td.start()
    }
}