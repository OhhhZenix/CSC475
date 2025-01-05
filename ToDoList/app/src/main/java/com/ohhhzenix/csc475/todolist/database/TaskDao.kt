package com.ohhhzenix.csc475.todolist.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {

    @Query("SELECT * FROM task")
    fun getAll(): Flow<List<Task>>

    @Query("SELECT * FROM task WHERE completed = 1")
    fun getAllCompleted(): Flow<List<Task>>

    @Query("SELECT * FROM task WHERE completed = 0")
    fun getAllUncompleted(): Flow<List<Task>>

    @Upsert
    suspend fun upsertTask(task: Task)

    @Delete
    suspend fun deleteTask(task: Task)
}