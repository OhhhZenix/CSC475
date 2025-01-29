package com.ohhhzenix.csc475.fitnesstracker.database.catalog.exercise

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert

@Dao
interface ExerciseCatalogDao {

    @Upsert
    suspend fun addExercise(exercise: ExerciseCatalog)

    @Query("SELECT * FROM exercise_catalogs WHERE id = :id")
    suspend fun getExercise(id: Int): ExerciseCatalog?

    @Query("SELECT * FROM exercise_catalogs")
    suspend fun getAllExercise(): List<ExerciseCatalog>

    @Query("UPDATE exercise_catalogs SET name = :name, calories = :calories WHERE id = :id")
    suspend fun updateExercise(id: Int, name: String, calories: Double)

    @Query("DELETE FROM exercise_catalogs WHERE id = :id")
    suspend fun removeExercise(id: Int)
}