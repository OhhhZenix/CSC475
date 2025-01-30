package com.ohhhzenix.csc475.fitnesstracker.database.log.meal

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import java.time.LocalDate

@Dao
interface MealLogDao {

    @Upsert
    suspend fun addLog(log: MealLog)

    @Query("SELECT * FROM meal_logs")
    suspend fun getAllLogs(): List<MealLog>

    suspend fun getTodayLogs(): List<MealLog> {
        return getAllLogs().filter {
            it.dateTime.toLocalDate() == LocalDate.now()
        }
    }

    @Query("UPDATE meal_logs SET food_id = :foodId where id = :id")
    suspend fun updateLog(id: Int, foodId: Int)

    @Query("DELETE FROM meal_logs where id = :id")
    suspend fun removeLog(id: Int)
}