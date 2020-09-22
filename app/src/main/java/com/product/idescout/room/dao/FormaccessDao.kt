package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.Formaccess

@Dao
interface FormaccessDao {
    @Query("SELECT * FROM formaccess")
    fun getFormaccesses(): List<Formaccess>

    @Insert
    fun insertFormaccesses(vararg formaccesses: Formaccess)

    @Update
    fun updateFormaccess(formaccess: Formaccess)

    @Delete
    fun deleteFormaccess(formaccess: Formaccess)
}