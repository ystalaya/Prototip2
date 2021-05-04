package com.example.protorype2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class App_List : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.application_creation_form)
    }

    fun onClickNew(view: View){
        val i = Intent(this,EditActivity::class.java)
        startActivity(i)
    }
}