package com.ohhhzenix.csc475.fitnesstracker.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.ohhhzenix.csc475.fitnesstracker.database.catalog.food.FoodCatalog
import com.ohhhzenix.csc475.fitnesstracker.database.catalog.food.FoodCatalogDao
import com.ohhhzenix.csc475.fitnesstracker.database.converters.LocalDateTimeConverter
import com.ohhhzenix.csc475.fitnesstracker.database.log.meal.MealLog
import com.ohhhzenix.csc475.fitnesstracker.database.log.meal.MealLogDao

@Database(
    entities = [
        MealLog::class,
        FoodCatalog::class
    ],
    version = 1
)
@TypeConverters(LocalDateTimeConverter::class)
abstract class AppDatabase : RoomDatabase() {

    companion object {
        const val NAME = "fitness_tracker"
    }

    abstract fun getMealLogDao(): MealLogDao

    abstract fun getFoodCatalogDao(): FoodCatalogDao
}