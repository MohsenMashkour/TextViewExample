package com.mkrdeveloper.textviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt52 = findViewById<TextView>(R.id.txt1)

        var num = ""
        txt52.setOnClickListener {
            num =  txt52.text as String

            Toast.makeText(this,num,Toast.LENGTH_LONG).show()
        }

        txt52.setOnLongClickListener {
            Toast.makeText(this,"long click",Toast.LENGTH_LONG).show()

            true
        }
    }
}