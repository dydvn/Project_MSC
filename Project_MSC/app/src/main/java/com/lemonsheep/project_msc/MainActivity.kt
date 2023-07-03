package com.lemonsheep.project_msc

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TableLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import java.io.Console
import java.util.Random
import java.util.Timer


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 선언부

        val board: TableLayout = findViewById(R.id.tablelayout_name1) as TableLayout
        val txtYear: TextView = findViewById(R.id.txt_year) as TextView
        val btnYearBefore: Button = findViewById(R.id.btn_year_before) as Button
        val btnYearAefore: Button = findViewById(R.id.btn_year_after) as Button

        var year:Int = 2023

        fun SetYearText(value:Int){
            txtYear.text = value.toString()
        }
        fun IsLeapYear(value:Int):Boolean{
            if(value%400 == 0)
                return true
            else if(value% 100 == 0)
                return false
            else if(value%4 == 0)
                return true

            return false
        }

        // for test
        var LOG_TAG:String = "My Log : "

        // ~선언부



        // 구현부

        SetYearText(year) // 기기에 저장돼있는 년도 불러오기

        btnYearBefore.setOnClickListener{
            year--
            SetYearText(year)
            Log.d(LOG_TAG,IsLeapYear(year).toString())
        }
        btnYearAefore.setOnClickListener{
            year++
            SetYearText(year)
            Log.d(LOG_TAG,IsLeapYear(year).toString())
        }

        // ~구현부

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