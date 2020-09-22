package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(
    tableName = "t_transaction_type",
    primaryKeys = ["TransactionTypeId", "StoreId"]
)
data class TTransactionType(
    @ColumnInfo(name = "TransactionTypeId") val transactionTypeId: Long,
    @ColumnInfo(name = "TransactionType") val transactionType: String,
    @ColumnInfo(name = "IsPositive") val isPositive: Long,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?,
    @ColumnInfo(name = "StoreId") val storeId: Long
)
