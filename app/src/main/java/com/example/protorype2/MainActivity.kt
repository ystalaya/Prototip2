package com.example.protorype2

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.net.Uri.parse
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.start_activity.*
import java.util.jar.Manifest

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        nav_view.setNavigationItemSelectedListener(this)
        setContentView(R.layout.start_activity)
    }

    fun onClickNewApp(view: View){
        val i = Intent(this,EditActivity::class.java)
        startActivity(i)
    }

    fun onClickListMyApp(view: View){
        val i = Intent(this,App_List::class.java)
        startActivity(i)
    }

    fun onClickCall(view: View){
        val number = "89992952710"
        val intent = Intent(Intent.ACTION_CALL);
        intent.data = Uri.parse("tel:$number")
        startActivity(intent)

    }

    //навигация

//    override fun onNavigationItemSelected(item: MenuItem): Boolean {
//
//        when(item.itemId){
//            R.id.id_Appeal -> Toast.makeText(this, "id_Appeal",Toast.LENGTH_SHORT).show()
//            R.id.id_MyAppeal -> Toast.makeText(this, "id_MyAppeal",Toast.LENGTH_SHORT).show()
//            R.id.id_Call -> Toast.makeText(this, "id_Call",Toast.LENGTH_SHORT).show()
//        }
//
//
//       return true
//    }


//    fun OneClickStart(view: View)
//    {
//        val intent = Intent(this,SecondActivity::class.java)
////        val intent = Intent(this,SecondActivity::class.java).apply {
////            putExtra("salud","Заявка принята")
////        }
//        startActivity(intent)
//
//
//    }

}