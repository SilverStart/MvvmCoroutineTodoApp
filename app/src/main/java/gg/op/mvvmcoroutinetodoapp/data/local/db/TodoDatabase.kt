package gg.op.mvvmcoroutinetodoapp.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import gg.op.mvvmcoroutinetodoapp.data.local.db.dao.TodoDao
import gg.op.mvvmcoroutinetodoapp.data.local.db.entity.Todo

@Database(entities = [Todo::class], version = 1)
abstract class TodoDatabase : RoomDatabase() {
    abstract fun todoDao(): TodoDao
}