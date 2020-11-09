package gg.op.mvvmcoroutinetodoapp.data.repository.todo

interface TodoRepository {

    fun insert(title: String, content: String)
}