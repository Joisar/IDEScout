package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TTransactionItem

@Dao
interface TTransactionItemDao {
    @Query("SELECT * FROM t_transaction_items")
    fun getTTransactionItems(): List<TTransactionItem>

    @Insert
    fun insertTTransactionItems(vararg TTransactionItems: TTransactionItem)

    @Update
    fun updateTTransactionItem(TTransactionItem: TTransactionItem)

    @Delete
    fun deleteTTransactionItem(TTransactionItem: TTransactionItem)
}