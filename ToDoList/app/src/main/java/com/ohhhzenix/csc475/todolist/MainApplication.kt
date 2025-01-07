package com.ohhhzenix.csc475.todolist

import android.app.Application
import androidx.room.Room
import com.ohhhzenix.csc475.todolist.database.AppDatabase

class MainApplication : Application() {

    companion object {
        lateinit var appDatabase: AppDatabase
    }

    override fun onCreate() {
        super.onCreate()
        appDatabase = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            AppDatabase.NAME
        ).build()
    }
}