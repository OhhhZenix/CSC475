package com.ohhhzenix.csc475.todolist

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.ohhhzenix.csc475.todolist.database.Task

class TaskViewModel : ViewModel() {

    private val taskDao = MainApplication.taskDatabase.getTaskDao();
    val tasks: LiveData<List<Task>> = taskDao.getAll()
    val completedTasks: LiveData<List<Task>> = taskDao.getAllCompleted()
    val uncompletedTasks: LiveData<List<Task>> = taskDao.getAllUncompleted()

    fun getAll(): List<Task> {
        return emptyList()
    }

    fun getAllCompleted() {

    }

    fun getAllUncompleted() {

    }

    fun addTask(title: String, description: String) {
        taskDao.upsertTask(Task(title = title, description = description))
    }

    fun deleteTask(id: Int) {
        taskDao.deleteTask(id)
    }
}
