package com.lemonsheep.project_msc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.txt_test) as TextView
        val btn_todolist: Button =findViewById(R.id.btn_to_do_list) as Button

        btn_todolist.setOnClickListener{
            tv.text  = "안녕"
        }
    }
}