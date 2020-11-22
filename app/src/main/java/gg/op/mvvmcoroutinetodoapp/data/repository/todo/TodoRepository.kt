package gg.op.mvvmcoroutinetodoapp.data.repository.todo

import gg.op.mvvmcoroutinetodoapp.data.local.db.entity.Todo
import kotlinx.coroutines.flow.Flow

interface TodoRepository {

    suspend fun insert(title: String, content: String)

    fun getAll(): Flow<List<Todo>>
}