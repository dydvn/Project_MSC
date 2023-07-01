package com.lemonsheep.project_msc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.Timer
import kotlin.concurrent.timer
import kotlin.concurrent.timerTask

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sec: Int = 0
        var IsRun: Boolean = false
        var timerTask: Timer? = null

        val tv: TextView = findViewById(R.id.txt_test) as TextView
        val btn_todolist: Button = findViewById(R.id.btn_to_do_list) as Button

        btn_todolist.setOnClickListener {

            IsRun = !IsRun

            if (IsRun) {
                timerTask = kotlin.concurrent.timer(period = 1000) {
                    sec++
                    runOnUiThread {
                        tv.text = sec.toString()
                    }
                }
            } else {
                timerTask?.cancel()
            }
        }
    }
}