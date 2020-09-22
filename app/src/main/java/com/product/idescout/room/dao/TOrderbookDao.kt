package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TOrderbook

@Dao
interface TOrderbookDao {
    @Query("SELECT * FROM t_orderbook")
    fun getTOrderbooks(): List<TOrderbook>

    @Insert
    fun insertTOrderbooks(vararg TOrderbooks: TOrderbook)

    @Update
    fun updateTOrderbook(TOrderbook: TOrderbook)

    @Delete
    fun deleteTOrderbook(TOrderbook: TOrderbook)
}