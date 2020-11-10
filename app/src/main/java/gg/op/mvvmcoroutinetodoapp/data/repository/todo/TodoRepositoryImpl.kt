package gg.op.mvvmcoroutinetodoapp.data.repository.todo

import gg.op.mvvmcoroutinetodoapp.data.local.db.dao.TodoDao
import gg.op.mvvmcoroutinetodoapp.data.local.db.entity.Todo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class TodoRepositoryImpl @Inject constructor(
    private val todoDao: TodoDao
) : TodoRepository {
    override suspend fun insert(title: String, content: String) = withContext(Dispatchers.IO) {
        todoDao.insert(Todo(title, content))
    }
}