package com.example.calculator

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.RequiresApi
import java.lang.NumberFormatException
import kotlin.math.sqrt

@SuppressLint("SetTextI18n")
class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById<EditText>(R.id.num1)
        val num2 = findViewById<EditText>(R.id.num2)
        val addition = findViewById<Button>(R.id.addition)
        val subtraction = findViewById<Button>(R.id.subtraction)
        val multiplication = findViewById<Button>(R.id.multiplication)
        val division = findViewById<Button>(R.id.division)
        val squareRoot = findViewById<Button>(R.id.square_root)
        val power = findViewById<Button>(R.id.power)
        val answer = findViewById<TextView>(R.id.answer)

        addition.setOnClickListener {
            try {
                val a = num1.text.toString().toInt()
                val b = num2.text.toString().toInt()

                val sum = a + b
                answer.text = "$a + $b = $sum";
            } catch (e: NumberFormatException) {
                return@setOnClickListener
            }
        }//end of addition0

        subtraction.setOnClickListener {
            try {
                val a = num1.text.toString()
                val b = num2.text.toString()

                val sub = a.toInt() - b.toInt()
                answer.text = "$a - $b = $sub";
            } catch (e: NumberFormatException) {
                return@setOnClickListener
            }
        }//end of subtraction

        multiplication.setOnClickListener {
            try {
                val a = num1.text.toString()
                val b = num2.text.toString()

                val mult = a.toInt() * b.toInt()
                answer.text = "$a * $b = $mult";
            } catch (e: NumberFormatException) {
                return@setOnClickListener
            }
        }//end of MULTIPLICATION

        division.setOnClickListener {
            try {
                val a = num1.text.toString().toInt()
                val b = num2.text.toString().toInt()
                val res = div(a, b);
                answer.text = "$a / $b = $res"
            } catch (e: NumberFormatException) {
                return@setOnClickListener
            }
        }//end of DIVISION

        squareRoot.setOnClickListener {
            try {
                val a = num1.text.toString().toInt()
                val sqrt = sqrt(a)
                answer.text = "√$a = $sqrt"
            } catch (e: NumberFormatException) {
                return@setOnClickListener
            }
        }//end of SQURE_ROOT

        power.setOnClickListener {
            try {
                val a = num1.text.toString().toInt()
                val n = num2.text.toString().toInt()

                val pow = power(a, n)
                answer.text = "$a^$n = $pow"
            } catch (e: NumberFormatException) {
                return@setOnClickListener
            }
        }//end of POWER
    }//end of Super

    private fun sqrt(a: Int): Double {
        if (a <= 0){
            throw Exception("The number shouldn't be 0.");
        }
        return sqrt(a.toDouble());
    }

    private fun div(a: Int, b: Int): Double {
        if (b == 0){
            throw Exception("The number shouldn't be 0.");
        }
        return a.toDouble()/b.toDouble();
    }

    private fun power(a: Int, n: Int): Int{
        var partialPow = 1
        for (i in 1..n){
            partialPow *= a;
        }
        return partialPow;
    }

    private fun open_popup(){

    }
}//End of class