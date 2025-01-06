package com.ohhhzenix.csc475.todolist

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.ohhhzenix.csc475.todolist.database.Task

class TaskViewModel : ViewModel() {

    private val taskDao = MainApplication.taskDatabase.getTaskDao();

    fun getAll(): LiveData<List<Task>> {
        return taskDao.getAll()
    }

    fun getAllCompleted(): LiveData<List<Task>> {
        return taskDao.getAllCompleted()
    }

    fun getAllUncompleted(): LiveData<List<Task>> {
        return taskDao.getAllUncompleted()
    }

    fun addTask(title: String, description: String) {
        taskDao.upsertTask(Task(title = title, description = description))
    }

    fun deleteTask(id: Int) {
        taskDao.deleteTask(id)
    }
}
