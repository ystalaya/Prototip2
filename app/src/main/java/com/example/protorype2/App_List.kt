package com.example.protorype2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.protorype2.db.MyDbManager
import kotlinx.android.synthetic.main.application_creation_form.*

class App_List : AppCompatActivity() {
    //val myDbManager = MyDbManager(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.application_creation_form)

//        tvNotElement.text=""
//        val dataList = myDbManager.readDbData()
//        for (item in dataList){
//            tvNotElement.append(item)
//            tvNotElement.append("\n")
//
//        }
    }

    fun onClickNew(view: View){
        val i = Intent(this,EditActivity::class.java)
        startActivity(i)
    }
}