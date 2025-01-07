package com.ohhhzenix.csc475.todolist.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Task::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {

    companion object {
        const val NAME = "to-do-list-app"
    }

    abstract fun getTaskDao(): TaskDao
}