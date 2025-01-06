package com.ohhhzenix.csc475.todolist

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ohhhzenix.csc475.todolist.database.Task
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TaskViewModel : ViewModel() {

    private val taskDao = MainApplication.taskDatabase.getTaskDao();
    val tasks : LiveData<List<Task>> = taskDao.getAll()

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
        viewModelScope.launch(Dispatchers.IO) {
            taskDao.upsertTask(Task(title = title, description = description))
        }
    }

    fun deleteTask(id: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            taskDao.deleteTask(id)
        }
    }
}
