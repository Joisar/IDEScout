package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TStocktakeitem

@Dao
interface TStocktakeitemDao {
    @Query("SELECT * FROM t_stocktakeitems")
    fun getTStocktakeitems(): List<TStocktakeitem>

    @Insert
    fun insertTStocktakeitems(vararg TStocktakeitems: TStocktakeitem)

    @Update
    fun updateTStocktakeitem(TStocktakeitem: TStocktakeitem)

    @Delete
    fun deleteTStocktakeitem(TStocktakeitem: TStocktakeitem)
}