package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TTransactionType

@Dao
interface TTransactionTypeDao {
    @Query("SELECT * FROM t_transaction_type")
    fun getTTransactionTypes(): List<TTransactionType>

    @Insert
    fun insertTTransactionTypes(vararg TTransactionTypes: TTransactionType)

    @Update
    fun updateTTransactionType(TTransactionType: TTransactionType)

    @Delete
    fun deleteTTransactionType(TTransactionType: TTransactionType)
}