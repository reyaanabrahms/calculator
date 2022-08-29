package com.example.calculator

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.RequiresApi
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Enter=findViewById<TextView>(R.id.Enter)
        val num1 = findViewById<EditText>(R.id.num1)
        val num2= findViewById<EditText>(R.id.num2)
        val ADDITION=findViewById<Button>(R.id.ADDITION)
        val SUBTRACTION=findViewById<Button>(R.id.SUBTRACTION)
        val MULTIPLICATION=findViewById<Button>(R.id.MULTIPLICATION)
        val DIVISION=findViewById<Button>(R.id.DIVISION)
        val SQURE_ROOT=findViewById<Button>(R.id.SQURE_ROOT)
        val POWER=findViewById<Button>(R.id.POWER)
        val statsfuction=findViewById<Button>(R.id.statsfuction)
        val Answer = findViewById<TextView>(R.id.Answer)

            ADDITION.setOnClickListener{
                var num1=findViewById<EditText>(R.id.num1)
                var num2=findViewById<EditText>(R.id.num2)
                var txtnum1=num1.text.toString().toInt()
                var txtnum2=num2.text.toString().toInt()

                var sum =txtnum1.toInt() + txtnum2.toInt()
                var Answer = findViewById<TextView>(R.id.Answer)
                display.setText(sum + Answer.toString())
            }//end of addition0

        SUBTRACTION.setOnClickListener{
            var num1=findViewById<EditText>(R.id.num1)
            var num2=findViewById<EditText>(R.id.num2)
            var txtnum1=num1.text.toString()
            var txtnum2=num2.text.toString()

            var sum =txtnum1.toInt() - txtnum2.toInt()
            var Answer = findViewById<TextView>(R.id.Answer)
        }//end of subtraction

        MULTIPLICATION.setOnClickListener{
            var num1=findViewById<EditText>(R.id.num1)
            var num2=findViewById<EditText>(R.id.num2)
            var txtnum1=num1.text.toString()
            var txtnum2=num2.text.toString()

            var sum =txtnum1.toInt() * txtnum2.toInt()
            var Answer = findViewById<TextView>(R.id.Answer)
        }//end of MULTIPLICATION

        DIVISION.setOnClickListener{
            var num1=findViewById<EditText>(R.id.num1)
            var num2=findViewById<EditText>(R.id.num2)
            var txtnum1=num1.text.toString()
            var txtnum2=num2.text.toString()

            var sum =txtnum1.toInt() / txtnum2.toInt()
            var Answer = findViewById<TextView>(R.id.Answer)
        }//end of DIVISION

        SQURE_ROOT.setOnClickListener{
            var num1=findViewById<EditText>(R.id.num1)
            var num2=findViewById<EditText>(R.id.num2)
            var txtnum1=num1.text.toString()
            var txtnum2=num2.text.toString()

            //var sum = sqrt(txtnum1.toInt() + txtnum2.toInt() )
            var Answer = findViewById<TextView>(R.id.Answer)
        }//end of SQURE_ROOT

        POWER.setOnClickListener{
            var num1=findViewById<EditText>(R.id.num1)
            var num2=findViewById<EditText>(R.id.num2)
            var txtnum1=num1.text.toString()
            var txtnum2=num2.text.toString()

            var sum =txtnum1.toInt() / txtnum2.toInt()
            var Answer = findViewById<TextView>(R.id.Answer)
        }//end of POWER

    }//end of Super
}//End of class