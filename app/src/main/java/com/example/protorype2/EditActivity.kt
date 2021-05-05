package com.example.protorype2


import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import android.icu.util.Calendar
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.EditText
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_edit.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.lang.reflect.*



class EditActivity : AppCompatActivity(),DatePickerDialog.OnDateSetListener {

    var day = 0
    var month = 0
    var year = 0

    var savedday = 0
    var savedmonth = 0
    var savedyear = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)



        //выбор даты
        val currentDateTime = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            LocalDateTime.now()
        } else {
            TODO("VERSION.SDK_INT < O")
        }
        btdate.text=  currentDateTime.format(DateTimeFormatter.ISO_DATE)
        //

        pickDate()
    }


    private fun getDateTimeCalendar() {
        val cal = java.util.Calendar.getInstance()
        day = cal.get(java.util.Calendar.DAY_OF_MONTH)
        month = cal.get(java.util.Calendar.MONTH)
        year = cal.get(java.util.Calendar.YEAR)
    }

    private fun pickDate() {
       btdate.setOnClickListener {
           getDateTimeCalendar()
           DatePickerDialog(this,this,year,month,day).show()
       }
    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
       savedday = dayOfMonth
       savedmonth = month
       savedyear = year

        btdate.text="$savedyear-$savedmonth-$savedday"

    }


}