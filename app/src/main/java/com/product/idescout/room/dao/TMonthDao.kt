package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TMonth

@Dao
interface TMonthDao {
    @Query("SELECT * FROM t_month")
    fun getTMonths(): List<TMonth>

    @Insert
    fun insertTMonths(vararg TMonths: TMonth)

    @Update
    fun updateTMonth(TMonth: TMonth)

    @Delete
    fun deleteTMonth(TMonth: TMonth)
}