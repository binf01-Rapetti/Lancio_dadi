package com.example.dadoapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {

    private lateinit var resultText: TextView
    private lateinit var backButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        resultText = findViewById(R.id.resultText)
        backButton = findViewById(R.id.backButton)

        val diceNumber = intent.getIntExtra("diceNumber", 1)

        if (diceNumber == 6) {
            resultText.text = "Hai vinto!"
        } else {
            resultText.text = "Non hai vinto. Riprova!"
        }

        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}