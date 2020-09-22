package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TTransaction

@Dao
interface TTransactionDao {
    @Query("SELECT * FROM t_transaction")
    fun getTTransactions(): List<TTransaction>

    @Insert
    fun insertTTransactions(vararg TTransactions: TTransaction)

    @Update
    fun updateTTransaction(TTransaction: TTransaction)

    @Delete
    fun deleteTTransaction(TTransaction: TTransaction)
}