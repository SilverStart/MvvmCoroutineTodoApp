package gg.op.mvvmcoroutinetodoapp.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import gg.op.mvvmcoroutinetodoapp.data.repository.todo.TodoRepository
import gg.op.mvvmcoroutinetodoapp.data.repository.todo.TodoRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
interface RepositoryModule {

    @Singleton
    @Binds
    fun bindTodoRepository(repository: TodoRepositoryImpl): TodoRepository
}