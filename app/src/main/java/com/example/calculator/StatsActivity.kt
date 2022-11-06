package com.example.calculator

import android.os.Bundle
import androidx.annotation.RequiresApi
import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.os.Build
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.collections.Collection as Collection


class StatsActivity : AppCompatActivity() {
    var list: java.util.ArrayList<Int> = ArrayList<Int>()

    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.stats_main)

        val num1 = findViewById<EditText>(R.id.num1)
        val storedNUm = findViewById<TextView>(R.id.storedNum)
        val answer2 = findViewById<TextView>(R.id.answer2)
        val add_buton = findViewById<Button>(R.id.add_buton)
        val clear_Button = findViewById<Button>(R.id.clear_Button)
        val average = findViewById<Button>(R.id.average)
        val min_max = findViewById<Button>(R.id.min_max)
        val fun_Switch = findViewById<Switch>(R.id.fun_Switch)

        fun_Switch.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }//switch end

        add_buton.setOnClickListener {
            if (this.list.size < 10) {
                val numberText = num1.text.toString();
                if (numberText.isBlank()) {
                    return@setOnClickListener
                }// return end
                try {
                    this.list.add(numberText.toInt())
                    storedNUm.text = this.list.joinToString()
                    num1.text.clear()

                } catch (e: Exception) {
                    e.printStackTrace()
                }//exception end
            }//if end
        }//Add button end

        clear_Button.setOnClickListener {
            this.list.clear()
            storedNUm.text = ""
        }//clear button

        average.setOnClickListener {
            if (list.size > 0) {
                var sum = 0
                for (i in list) {
                    sum += i;
                }
                answer2.text = (sum.toInt() / list.size.toInt()).toString()
            }

        }

    }//super end
}//end of main class