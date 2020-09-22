package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(
    tableName = "t_year",
    primaryKeys = ["YearID"]
)
data class TYear(
    @ColumnInfo(name = "YearID") val yearID: String,
    @ColumnInfo(name = "YearName") val yearName: String,
    @ColumnInfo(name = "DefaultYear") val defaultYear: Long,
    @ColumnInfo(name = "UpdateTs") val updateTs: String,
    @ColumnInfo(name = "CreateTs") val createTs: String
)
