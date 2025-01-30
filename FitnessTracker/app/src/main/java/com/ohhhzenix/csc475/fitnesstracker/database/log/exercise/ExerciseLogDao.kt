package com.ohhhzenix.csc475.fitnesstracker.database.log.exercise

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import java.time.LocalDate
import java.time.LocalDateTime

@Dao
interface ExerciseLogDao {

    @Upsert
    suspend fun addLog(log: ExerciseLog)

    @Query("SELECT * FROM exercise_logs where id = :id")
    suspend fun getLog(id: Int): ExerciseLog

    @Query("SELECT * FROM exercise_logs")
    suspend fun getAllLogs(): List<ExerciseLog>

    suspend fun getTodayLogs(): List<ExerciseLog> {
        return getAllLogs().filter {
            it.dateTime.toLocalDate() == LocalDate.now()
        }
    }

    @Query("UPDATE exercise_logs SET date_time = :dateTime, exercise_id = :exerciseId, quantity = :quantity where id = :id")
    suspend fun updateLog(id: Int, dateTime: LocalDateTime, exerciseId: Int, quantity: Double)

    @Query("DELETE FROM exercise_logs where id = :id")
    suspend fun removeLog(id: Int)
}