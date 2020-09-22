package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(
    tableName = "t_adj_type",
    primaryKeys = ["AdjTypeId", "StoreId"]
)
data class TAdjType(
    @ColumnInfo(name = "AdjTypeId") val adjTypeId: Long,
    @ColumnInfo(name = "StoreId") val storeId: Long,
    @ColumnInfo(name = "AdjType") val adjType: String,
    @ColumnInfo(name = "IsPositive") val isPositive: Long?,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?,
    @ColumnInfo(name = "PickListMethod") val pickListMethod: String?,
    @ColumnInfo(name = "isStockTake") val isStockTake: Long?,
    @ColumnInfo(name = "isExpired") val isExpired: String?,
    @ColumnInfo(name = "LinkAdjTypeId") val linkAdjTypeId: Long?,
    @ColumnInfo(name = "FLevelIds") val FLevelIds: String?
)
