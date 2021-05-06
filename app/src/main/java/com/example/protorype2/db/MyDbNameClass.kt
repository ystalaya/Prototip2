package com.example.protorype2.db

import android.provider.BaseColumns

object MyDbNameClass:BaseColumns {

    const val TABLE_NAME = "my_table"
    const val COLUMN_NAME_LS = "personal_account"
    const val COLUMN_NAME_ADDRESS = "address"
    const val COLUMN_NAME_TOPIC= "topic"
    const val COLUMN_NAME_DATE= "date"
    const val COLUMN_NAME_PORCH= "porch"
    const val COLUMN_NAME_FLOOR= "floor"
    const val COLUMN_NAME_DESCRIPTION= "description"
    const val COLUMN_NAME_FILE= "file"


//    const val COLUMN_NAME_TITLE = "title"
//    const val COLUMN_NAME_CONTENT = "content"

    const val DATABASE_VERSION = 1
    const val DATABASE_NAME = "myFirstDb.db"

    const val CREAT_TABLE = "CREATE TABLE IF NOT EXISTS $TABLE_NAME (" +
            "${BaseColumns._ID} INTEGER PRIMARY KEY," +
            ",$COLUMN_NAME_LS TEXT" +
            ",$COLUMN_NAME_ADDRESS TEXT" +
            ",$COLUMN_NAME_TOPIC TEXT" +
            ",$COLUMN_NAME_DATE TEXT" +
            ",$COLUMN_NAME_PORCH TEXT" +
            ",$COLUMN_NAME_FLOOR TEXT" +
            ",$COLUMN_NAME_DESCRIPTION TEXT" +
            ",$COLUMN_NAME_FILE TEXT)"
    //удаление таблицы
    const val SQL_DELETE_TABLE = "DROP TABLE IF EXISTS $TABLE_NAME"




}