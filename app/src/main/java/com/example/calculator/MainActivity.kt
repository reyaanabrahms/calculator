package com.example.calculator

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.RequiresApi
import java.lang.NumberFormatException
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val enter = findViewById<TextView>(R.id.enter)
        val num1 = findViewById<EditText>(R.id.num1)
        val num2 = findViewById<EditText>(R.id.num2)
        val addition = findViewById<Button>(R.id.addition)
        val subtraction = findViewById<Button>(R.id.subtraction)
        val multiplication = findViewById<Button>(R.id.multiplication)
        val division = findViewById<Button>(R.id.division)
        val squareRoot = findViewById<Button>(R.id.square_root)
        val power = findViewById<Button>(R.id.power)
//        val statsFunction = findViewById<Button>(R.id.statsFunction)
        val answer = findViewById<TextView>(R.id.answer)

        addition.setOnClickListener {
            try {
                val txtnum1 = num1.text.toString().toInt()
                val txtnum2 = num2.text.toString().toInt()

                print("numbers $txtnum1, $txtnum2")

                val sum = txtnum1 + txtnum2
                answer.text = sum.toString()
            } catch (e: NumberFormatException) {
                return@setOnClickListener
            }
        }//end of addition0

        subtraction.setOnClickListener {
            try {
                val txtnum1 = num1.text.toString()
                val txtnum2 = num2.text.toString()

                val sub = txtnum1.toInt() - txtnum2.toInt()
                answer.text = sub.toString()
            } catch (e: NumberFormatException) {
                return@setOnClickListener
            }
        }//end of subtraction

        multiplication.setOnClickListener {
            try {
                val txtnum1 = num1.text.toString()
                val txtnum2 = num2.text.toString()

                val mult = txtnum1.toInt() * txtnum2.toInt()
                answer.text = mult.toString()
            } catch (e: NumberFormatException) {
                return@setOnClickListener
            }
        }//end of MULTIPLICATION

        division.setOnClickListener {
            try {

                val txtnum1 = num1.text.toString()
                val txtnum2 = num2.text.toString()

                val div = txtnum1.toInt() / txtnum2.toInt()
                answer.text = div.toString()
            } catch (e: NumberFormatException) {
                return@setOnClickListener
            }
        }//end of DIVISION

        squareRoot.setOnClickListener {
            try {
                val txtnum1 = num1.text.toString()

                val sqrt = kotlin.math.sqrt(txtnum1.toDouble())
                answer.text = sqrt.toString()
            } catch (e: NumberFormatException) {
                return@setOnClickListener
            }
        }//end of SQURE_ROOT

        power.setOnClickListener {
            try {
                val txtnum1 = num1.text.toString()
                val txtnum2 = num2.text.toString()

                val pow = txtnum1.toDouble().pow(txtnum2.toDouble())
                answer.text = pow.toString()
            } catch (e: NumberFormatException) {
                return@setOnClickListener
            }
        }//end of POWER
    }//end of Super
}//End of class