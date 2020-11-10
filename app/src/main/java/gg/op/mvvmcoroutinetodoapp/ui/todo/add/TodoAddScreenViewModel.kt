package gg.op.mvvmcoroutinetodoapp.ui.todo.add

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import gg.op.mvvmcoroutinetodoapp.data.repository.todo.TodoRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class TodoAddScreenViewModel @Inject constructor(
    private val todoRepository: TodoRepository
) : ViewModel() {

    fun saveTodo(title: String, content: String) {
        viewModelScope.launch {
            todoRepository.insert(title, content)
        }
    }
}