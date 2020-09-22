package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(
    tableName = "t_dailystock",
    primaryKeys = ["FacilityId", "StoreId", "ProductStockId", "TransactionDate"]
)
data class TDailystock(
    @ColumnInfo(name = "FacilityId") val facilityId: Long,
    @ColumnInfo(name = "StoreId") val storeId: Long,
    @ColumnInfo(name = "ProductStockId") val productStockId: Long,
    @ColumnInfo(name = "TransactionDate") val transactionDate: String,
    @ColumnInfo(name = "Year") val year: String,
    @ColumnInfo(name = "MonthId") val monthId: Long,
    @ColumnInfo(name = "ItemNo") val itemNo: Long,
    @ColumnInfo(name = "StockQty") val stockQty: Long,
    @ColumnInfo(name = "UpdateTs") val updateTs: String,
    @ColumnInfo(name = "CreateTs") val createTs: String
)
