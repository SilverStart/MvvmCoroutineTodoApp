package gg.op.mvvmcoroutinetodoapp.data.local.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import gg.op.mvvmcoroutinetodoapp.data.local.db.entity.Todo
import kotlinx.coroutines.flow.Flow

@Dao
interface TodoDao {

    @Insert
    fun insert(todo: Todo)

    @Query("SELECT * FROM todo")
    fun getAll(): Flow<List<Todo>>
}