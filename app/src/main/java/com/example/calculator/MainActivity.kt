package com.example.calculator

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.sqrt

/**
 *
 */
@SuppressLint("SetTextI18n")
class MainActivity : AppCompatActivity() {
    /**
     *
     */
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
        findViewById<Switch>(R.id.main_Switch)
        val statsFunction = findViewById<Button>(R.id.statsFunction)


        statsFunction.setOnClickListener {
            val Intent = Intent(this, StatsActivity::class.java)
            startActivity(Intent)

        }//swicth end

        addition.setOnClickListener {
            try {
                val a = num1.text.toString().toInt()
                val b = num2.text.toString().toInt()

                val sum = a + b
                answer.text = "$a + $b = $sum"
            } catch (e: NumberFormatException) {
                openPopup(it.context, e)
                return@setOnClickListener
            }
        }//end of addition

        subtraction.setOnClickListener {
            try {
                val a = num1.text.toString()
                val b = num2.text.toString()

                val sub = a.toInt() - b.toInt()
                answer.text = "$a - $b = $sub"
            } catch (e: NumberFormatException) {
                openPopup(it.context, e)
                return@setOnClickListener
            }
        }//end of subtraction

        multiplication.setOnClickListener {
            try {
                val a = num1.text.toString()
                val b = num2.text.toString()

                val mult = a.toInt() * b.toInt()
                answer.text = "$a * $b = $mult"
            } catch (e: NumberFormatException) {
                openPopup(it.context, e)
                return@setOnClickListener
            }
        }//end of MULTIPLICATION

        division.setOnClickListener {
            try {
                val a = num1.text.toString().toInt()
                val b = num2.text.toString().toInt()
                val res = div(a, b)
                answer.text = "$a / $b = $res"
            } catch (e: Exception) {
                openPopup(it.context, e)
                return@setOnClickListener
            }
        }//end of DIVISION

        squareRoot.setOnClickListener {
            try {
                val a = num1.text.toString().toInt()
                val sqrt = sqrt(a)
                answer.text = "√$a = $sqrt"
            } catch (e: Exception) {
                openPopup(it.context, e)
                return@setOnClickListener
            }
        }//end of SQUARE_ROOT

        power.setOnClickListener {
            try {
                val a = num1.text.toString().toInt()
                val n = num2.text.toString().toInt()

                val pow = power(a, n)
                answer.text = "$a^$n = $pow"
            } catch (e: Exception) {
                openPopup(it.context, e)
                return@setOnClickListener
            }//end pf power
        }//end of POWER
    }//end of Super

    private fun sqrt(a: Int): Double {
        if (a <= 0) {
            throw Exception("The number shouldn't be less or equal to 0.")
        }
        return sqrt(a.toDouble())
    }//square root exception

    private fun div(a: Int, b: Int): Double {
        if (b == 0) {
            throw Exception("The number shouldn't be 0.")
        }
        return a.toDouble() / b.toDouble()
    }//division exception

    private fun power(a: Int, n: Int): Int {
        if (n < 0) {
            throw Exception("The number shouldn't be less than 0.")
        }
        var partialPow = 1
        for (i in 1..n) {
            partialPow *= a
        }
        return partialPow
    }/* power exception */

    private fun openPopup(ctx: Context, e: Exception) {
        val dialog = AlertDialog.Builder(ctx)
            .setTitle("An error occured.")
            .setMessage(e.message)
            .setNeutralButton("Dismiss") { popup, _ -> run { popup.dismiss() } }
            .create()
        dialog.show()
    }//dialog pop up
}//End of class