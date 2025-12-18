package com.robbaflow.curencyconverterapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var title : TextView
    lateinit var editText : EditText
    lateinit var resultText : TextView
    lateinit var btn : Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        title = findViewById(R.id.textView)
        editText = findViewById(R.id.editText)
        resultText = findViewById(R.id.resultText)
        btn = findViewById(R.id.btn)


        btn.setOnClickListener {
            var enterUSD = editText.text.toString().toString()
            var enterUSDDouble:Double = enterUSD.toDouble()

            var euros = makeConversion(enterUSDDouble)
            resultText.text = """${euros}Euro"""

        }





    }

    fun makeConversion (usd:Double):Double{
        return usd * 0.94
    }
}