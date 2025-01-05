package com.ohhhzenix.csc475.todolist

import com.ohhhzenix.csc475.todolist.database.Task

sealed interface TaskEvent {
    object tasks: TaskEvent
    data class SetTitle(val title: String): TaskEvent
    data class SetDescription(val description: String): TaskEvent
    data class SetCompleted(val completed: Boolean): TaskEvent
    object ShowDialog: TaskEvent
    object HideDialog: TaskEvent
    data class FilterTasks(val filterType: FilterType): TaskEvent
    data class DeleteTask(val task: Task): TaskEvent
}