package com.lemonsheep.project_msc

import android.R
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TableLayout
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tableLayout:TableLayout = findViewById(R.id.tablelayout_name1) as TableLayout








//        var sec: Int = 0
//        var isRun: Boolean = false
//        var timerTask: Timer? = null
//
//        val tv: TextView = findViewById(R.id.txt_test) as TextView
//        val btn_todolist: Button = findViewById(R.id.btn_to_do_list) as Button
//
//        fun GetRandomValueFloat(min :Int, max:Int):Float {
//            if(min > max)
//                return 0.toFloat()
//
//            return ((min * 100 + Random().nextInt((max - min) * 100)) * 0.01).toFloat()
//        }
//
//        btn_todolist.setOnClickListener{
//            val random_box = Random()
//            val num = random_box.nextFloat()
//
//            tv.text = GetRandomValueFloat(0, 1).toString()
//        }



//        btn_todolist.setOnClickListener {
//
//            isRun = !isRun
//
//            if (isRun) {
//                timerTask = kotlin.concurrent.timer(period = 10) {
//                    sec++
//                    runOnUiThread {
//                        tv.text = (sec.toFloat() / 100).toString()
//                    }
//                }
//            } else {
//                timerTask?.cancel()
//            }
//        }
    }
}