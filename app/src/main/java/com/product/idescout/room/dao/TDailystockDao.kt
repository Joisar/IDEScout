package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TDailystock

@Dao
interface TDailystockDao {
    @Query("SELECT * FROM t_dailystock")
    fun getTDailystocks(): List<TDailystock>

    @Insert
    fun insertTDailystocks(vararg TDailystocks: TDailystock)

    @Update
    fun updateTDailystock(TDailystock: TDailystock)

    @Delete
    fun deleteTDailystock(TDailystock: TDailystock)
}