package gg.op.mvvmcoroutinetodoapp.ui.todo.add

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import dagger.hilt.android.AndroidEntryPoint
import gg.op.mvvmcoroutinetodoapp.databinding.TodoAddActivityBinding
import javax.inject.Inject

@AndroidEntryPoint
class TodoAddActivity : AppCompatActivity() {

    private val viewModel by viewModels<TodoAddScreenViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = TodoAddActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fabAddTodo.setOnClickListener {
            val title = binding.etTitle.text.toString()
            val content = binding.etContent.text.toString()
            viewModel.saveTodo(title, content)
            finish()
        }
    }
}