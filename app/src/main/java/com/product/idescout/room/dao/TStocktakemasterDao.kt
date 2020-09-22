package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TStocktakemaster

@Dao
interface TStocktakemasterDao {
    @Query("SELECT * FROM t_stocktakemaster")
    fun getTStocktakemasters(): List<TStocktakemaster>

    @Insert
    fun insertTStocktakemasters(vararg TStocktakemasters: TStocktakemaster)

    @Update
    fun updateTStocktakemaster(TStocktakemaster: TStocktakemaster)

    @Delete
    fun deleteTStocktakemaster(TStocktakemaster: TStocktakemaster)
}