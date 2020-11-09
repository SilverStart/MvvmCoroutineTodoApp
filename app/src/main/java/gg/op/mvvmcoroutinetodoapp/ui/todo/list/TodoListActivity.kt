package gg.op.mvvmcoroutinetodoapp.ui.todo.list

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import gg.op.mvvmcoroutinetodoapp.databinding.TodoListActivityBinding
import gg.op.mvvmcoroutinetodoapp.ui.todo.add.TodoAddActivity

class TodoListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = TodoListActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fabAddTodo.setOnClickListener {
            startActivity(Intent(this, TodoAddActivity::class.java))
        }
    }
}