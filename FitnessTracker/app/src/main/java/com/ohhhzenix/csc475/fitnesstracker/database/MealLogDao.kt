package com.ohhhzenix.csc475.fitnesstracker.database

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert

@Dao
interface MealLogDao {

    @Query("SELECT * FROM meal_logs WHERE date_time = now()")
    suspend fun getTodayList(): List<MealLog>

    @Upsert
    suspend fun addLog(log: MealLog)

    @Query("DELETE FROM meal_logs where id = :id")
    suspend fun removeLog(id: Int)
}