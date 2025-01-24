package com.ohhhzenix.csc475.fitnesstracker.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [MealLog::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    companion object {
        const val NAME = "fitness_tracker"
    }

    abstract fun getMealLogDao(): MealLogDao
}