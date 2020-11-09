package gg.op.mvvmcoroutinetodoapp.data.repository.todo

import gg.op.mvvmcoroutinetodoapp.data.local.db.dao.TodoDao
import gg.op.mvvmcoroutinetodoapp.data.local.db.entity.Todo
import javax.inject.Inject

class TodoRepositoryImpl @Inject constructor(
    private val todoDao: TodoDao
) : TodoRepository {
    override fun insert(title: String, content: String) {
        todoDao.insert(Todo(title, content))
    }
}