package com.ohhhzenix.csc475.todolist

import android.app.Application
import androidx.room.Room
import com.ohhhzenix.csc475.todolist.database.TaskDatabase

class MainApplication : Application() {

    companion object {
        lateinit var taskDatabase: TaskDatabase
    }

    override fun onCreate() {
        super.onCreate()
        Room.databaseBuilder(
            applicationContext,
            TaskDatabase::class.java,
            TaskDatabase.NAME
        )
    }
}