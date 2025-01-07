package com.ohhhzenix.csc475.todolist.database

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {

    @Query("SELECT * FROM tasks ORDER BY completed ASC")
    suspend fun getAll(): List<Task>

    @Query("SELECT * FROM tasks WHERE completed = 1")
    suspend fun getAllCompleted(): List<Task>

    @Query("SELECT * FROM tasks WHERE completed = 0")
    suspend fun getAllUncompleted(): List<Task>

    @Query("SELECT * FROM tasks WHERE id=:id LIMIT 1")
    suspend fun getTask(id: Int): Task

    @Upsert
    suspend fun upsertTask(task: Task)

    @Query("DELETE FROM tasks where id = :id")
    suspend fun deleteTask(id: Int)

    @Query("UPDATE tasks SET title=:title, description=:description, completed=:completed WHERE id = :id")
    suspend fun updateTask(id: Int, title: String, description: String, completed: Boolean)
}