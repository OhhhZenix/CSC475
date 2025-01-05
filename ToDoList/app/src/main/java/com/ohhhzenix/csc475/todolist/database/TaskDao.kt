package com.ohhhzenix.csc475.todolist.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert

@Dao
interface TaskDao {

    @Query("SELECT * FROM task")
    fun getAll(): List<Task>

    @Upsert
    suspend fun add(task: Task)

    @Delete
    suspend fun remove(task: Task)
}