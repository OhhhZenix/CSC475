package com.ohhhzenix.csc475.fitnesstracker.database.log.meal

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import java.time.LocalDate
import java.time.LocalDateTime

@Dao
interface MealLogDao {

    @Upsert
    suspend fun addLog(log: MealLog)

    @Query("SELECT * FROM meal_logs where id = :id")
    suspend fun getLog(id: Int): MealLog

    @Query("SELECT * FROM meal_logs")
    suspend fun getAllLogs(): List<MealLog>

    suspend fun getTodayLogs(): List<MealLog> {
        return getAllLogs().filter {
            it.dateTime.toLocalDate() == LocalDate.now()
        }
    }

    @Query("UPDATE meal_logs SET date_time = :dateTime, food_id = :foodId, quantity = :quantity where id = :id")
    suspend fun updateLog(id: Int, dateTime: LocalDateTime, foodId: Int, quantity: Double)

    @Query("DELETE FROM meal_logs where id = :id")
    suspend fun removeLog(id: Int)
}