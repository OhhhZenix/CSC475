package com.ohhhzenix.csc475.todolist.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {

    @Query("SELECT * FROM task")
    fun getAll(): LiveData<List<Task>>

    @Query("SELECT * FROM task WHERE completed = 1")
    fun getAllCompleted(): LiveData<List<Task>>

    @Query("SELECT * FROM task WHERE completed = 0")
    fun getAllUncompleted(): LiveData<List<Task>>

    @Upsert
    fun upsertTask(task: Task)

    @Delete
    fun deleteTask(task: Task)
}