package com.ohhhzenix.csc475.todolist.database

import android.content.Context
import androidx.room.Room

fun getTaskDatabase(context: Context): TaskDatabase {
    val dbFile = context.getDatabasePath("tasks.db")
    return Room.databaseBuilder(
        context= context.applicationContext,
        klass = TaskDatabase::class.java,
        name = dbFile.absolutePath
    )
        .build()
}