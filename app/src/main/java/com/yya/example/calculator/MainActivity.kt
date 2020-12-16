package com.yya.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var firstNum: EditText= findViewById(R.id.firstnum)
        var secondNum: EditText= findViewById(R.id.secondnum)
        var addBtn: Button= findViewById(R.id.add)
        var subBtn: Button= findViewById(R.id.sub)
        var multiBtn: Button = findViewById(R.id.multi)
        var divBtn: Button = findViewById(R.id.div)
        var clrBtn: Button = findViewById(R.id.clear)
        var ans: TextView= findViewById(R.id.result)


        addBtn.setOnClickListener {
            var result = firstNum.text.toString().toDouble() + secondNum.text.toString().toDouble()
            ans.text=result.toString()
        }

        subBtn.setOnClickListener {
            var result = firstNum.text.toString().toDouble() - secondNum.text.toString().toDouble()
            ans.text=result.toString()
        }
        multiBtn.setOnClickListener {
            var result = firstNum.text.toString().toDouble() * secondNum.text.toString().toDouble()
            ans.text=result.toString()
        }

        divBtn.setOnClickListener {
            var result = firstNum.text.toString().toDouble() / secondNum.text.toString().toDouble()
            ans.text=result.toString()
        }
        clrBtn.setOnClickListener {
            ans.setText("0.0")
            firstNum.setText("")
            secondNum.setText("")

        }

    }
}