package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TYear

@Dao
interface TYearDao {
    @Query("SELECT * FROM t_year")
    fun getTYears(): List<TYear>

    @Insert
    fun insertTYears(vararg TYears: TYear)

    @Update
    fun updateTYear(TYear: TYear)

    @Delete
    fun deleteTYear(TYear: TYear)
}