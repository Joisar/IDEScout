package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TOrderbookitem

@Dao
interface TOrderbookitemDao {
    @Query("SELECT * FROM t_orderbookitems")
    fun getTOrderbookitems(): List<TOrderbookitem>

    @Insert
    fun insertTOrderbookitems(vararg TOrderbookitems: TOrderbookitem)

    @Update
    fun updateTOrderbookitem(TOrderbookitem: TOrderbookitem)

    @Delete
    fun deleteTOrderbookitem(TOrderbookitem: TOrderbookitem)
}