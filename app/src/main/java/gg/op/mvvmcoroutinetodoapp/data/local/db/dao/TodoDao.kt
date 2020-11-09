package gg.op.mvvmcoroutinetodoapp.data.local.db.dao

import androidx.room.Dao
import androidx.room.Insert
import gg.op.mvvmcoroutinetodoapp.data.local.db.entity.Todo

@Dao
interface TodoDao {

    @Insert
    fun insert(todo: Todo)
}