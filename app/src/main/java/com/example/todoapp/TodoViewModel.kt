package com.example.todoapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.todoapp.ui.theme.Todo
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class TodoViewModel : ViewModel(){
    private var _todoList = MutableStateFlow<List<Todo>>(emptyList())

    val todoList : StateFlow<List<Todo>> = _todoList

    fun getAllTodo(){
        _todoList.value = TodoManager.getAllTodo().reversed()
    }

    fun addTodo(title : String){
        TodoManager.addTodo(title)
        getAllTodo()
    }

    fun deleteTodo(id: Int){
        TodoManager.deleteTodo((id))
        getAllTodo()
    }

}