package gg.op.mvvmcoroutinetodoapp.di

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.multibindings.IntoMap
import gg.op.mvvmcoroutinetodoapp.ui.todo.add.TodoAddScreenViewModel

@Module
@InstallIn(ApplicationComponent::class)
interface ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(TodoAddScreenViewModel::class)
    fun bindTodoAddScreenViewModel(viewModel: TodoAddScreenViewModel): ViewModel
}