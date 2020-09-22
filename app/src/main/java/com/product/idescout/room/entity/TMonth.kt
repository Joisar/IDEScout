package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(
    tableName = "t_month",
    primaryKeys = ["MonthId"]
)
data class TMonth(
    @ColumnInfo(name = "MonthId") val monthId: Long,
    @ColumnInfo(name = "MonthName") val monthName: String,
    @ColumnInfo(name = "UpdateTs") val updateTs: String,
    @ColumnInfo(name = "CreateTs") val createTs: String
)
