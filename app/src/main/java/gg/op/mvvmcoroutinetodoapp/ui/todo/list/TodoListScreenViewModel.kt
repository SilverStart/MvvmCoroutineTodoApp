package gg.op.mvvmcoroutinetodoapp.ui.todo.list

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import gg.op.mvvmcoroutinetodoapp.data.local.db.entity.Todo
import gg.op.mvvmcoroutinetodoapp.data.repository.todo.TodoRepository
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class TodoListScreenViewModel @ViewModelInject constructor(
    private val todoRepository: TodoRepository
) : ViewModel() {

    private val _todoList = MutableLiveData<List<Todo>>()
    val todoList: LiveData<List<Todo>> = _todoList

    fun init() {
        viewModelScope.launch {
            todoRepository.getAll()
                .collect {
                    _todoList.value = it
                }
        }
    }
}