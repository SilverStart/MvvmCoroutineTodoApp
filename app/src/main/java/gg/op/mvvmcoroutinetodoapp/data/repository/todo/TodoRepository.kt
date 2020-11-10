package gg.op.mvvmcoroutinetodoapp.data.repository.todo

interface TodoRepository {

    suspend fun insert(title: String, content: String)
}