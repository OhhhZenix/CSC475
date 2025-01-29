package com.ohhhzenix.csc475.fitnesstracker.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDateTime

@Entity(
    tableName = "meal_logs",
)
data class MealLog(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    @ColumnInfo(name = "date")
    val date: Long,

    @ColumnInfo(name = "time")
    val time: Long,

    @ColumnInfo(name = "food_id")
    val foodId: Int,

    @ColumnInfo(name = "quantity")
    val quantity: Double,
)