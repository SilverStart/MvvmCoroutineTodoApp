package gg.op.mvvmcoroutinetodoapp.ui.todo.list

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import gg.op.mvvmcoroutinetodoapp.databinding.TodoListActivityBinding
import gg.op.mvvmcoroutinetodoapp.ui.todo.add.TodoAddActivity
import gg.op.mvvmcoroutinetodoapp.ui.todo.list.adapter.TodoListAdapter

@AndroidEntryPoint
class TodoListActivity : AppCompatActivity() {

    private val viewModel by viewModels<TodoListScreenViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = TodoListActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = TodoListAdapter()

        binding.rvTodo.adapter = adapter

        binding.fabAddTodo.setOnClickListener {
            startActivity(Intent(this, TodoAddActivity::class.java))
        }

        viewModel.todoList.observe(this) {
            adapter.submitList(it)
        }

        viewModel.init()
    }
}