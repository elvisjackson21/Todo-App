package com.example.todoapp.ui.theme

import java.time.Instant
import java.util.Date

data class Todo(
    var id: Int,
    var title : String,
    var createdAt : Date
)

fun getFakeTodo() : List<Todo>{
    return listOf(
        Todo(id = 1, title = "First todo ", Date.from(Instant.now())),
        Todo(id = 2, title = "Second todo ", Date.from(Instant.now())),
        Todo(id = 3, title = "Third todo ", Date.from(Instant.now())),
        Todo(id = 4, title = "Fourth todo ", Date.from(Instant.now()))
    )
}

