package gg.op.mvvmcoroutinetodoapp.ui.todo.add

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import gg.op.mvvmcoroutinetodoapp.databinding.TodoAddActivityBinding

@AndroidEntryPoint
class TodoAddActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = TodoAddActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}