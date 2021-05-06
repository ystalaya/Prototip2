package com.example.protorype2.db

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.icu.text.CaseMap

class MyDbManager(context: Context) {
    val myDBHelper = MyDBHelper(context)
    var db: SQLiteDatabase? = null

    //функция открытия бд для записи
    fun openDb(){
        db = myDBHelper.writableDatabase
    }
    //записть в базу данных
    fun insertToDb(personal_account:String,address:String,topic:String,date:String,porch:String,floor:String,description:String,file:String) {
        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_LS, personal_account)
            put(MyDbNameClass.COLUMN_NAME_ADDRESS, address)
            put(MyDbNameClass.COLUMN_NAME_TOPIC, topic)
            put(MyDbNameClass.COLUMN_NAME_DATE, date)
            put(MyDbNameClass.COLUMN_NAME_PORCH, porch)
            put(MyDbNameClass.COLUMN_NAME_FLOOR, floor)
            put(MyDbNameClass.COLUMN_NAME_DESCRIPTION, description)
            put(MyDbNameClass.COLUMN_NAME_FILE, file)
        }
        db?.insert(MyDbNameClass.TABLE_NAME,null,values)
    }

    fun readDbData():ArrayList<String> {
        val dataList = ArrayList<String>()

        val cursor = db?.query(MyDbNameClass.TABLE_NAME,
            null,null,null,null,null,null)

            while (cursor?.moveToNext()!!){
                val dataText = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TOPIC))
                        dataList.add(dataText.toString())
            }


        cursor.close()
        return dataList
    }

    fun closeDb(){
        myDBHelper.close()
    }

}