package com.ohhhzenix.csc475.fitnesstracker.database

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert

@Dao
interface MealLogDao {

    @Upsert
    suspend fun addLog(log: MealLog)

    @Query("SELECT * FROM meal_logs WHERE cast(date_time as Date) = cast(getdate() as Date)")
    suspend fun getTodayLogs(): List<MealLog>

    @Query("SELECT * FROM meal_logs")
    suspend fun getAllLogs(): List<MealLog>

    @Query("UPDATE meal_logs SET food_id = :foodId where id = :id")
    suspend fun updateLog(id: Int, foodId: Int)

    @Query("DELETE FROM meal_logs where id = :id")
    suspend fun removeLog(id: Int)
}