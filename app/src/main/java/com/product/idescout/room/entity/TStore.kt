package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(
    tableName = "t_store",
    primaryKeys = ["StoreId"]
)
data class TStore(
    @ColumnInfo(name = "StoreId") val storeId: Long,
    @ColumnInfo(name = "StoreName") val storeName: String,
    @ColumnInfo(name = "FLevelIds") val FLevelIds: String,
    @ColumnInfo(name = "UpdateTs") val updateTs: String,
    @ColumnInfo(name = "CreateTs") val createTs: String,
    @ColumnInfo(name = "bConsiderOrderStock") val bConsiderOrderStock: Long,
    @ColumnInfo(name = "bConsiderOrderAMC") val bConsiderOrderAMC: Long
)
