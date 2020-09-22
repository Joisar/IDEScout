package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(
    tableName = "synchurl",
    primaryKeys = ["Id"]
)
data class Synchurl(
    @ColumnInfo(name = "Id") val id: Long,
    @ColumnInfo(name = "URL") val URL: String,
    @ColumnInfo(name = "UpdateTs") val updateTs: String,
    @ColumnInfo(name = "CreateTs") val createTs: String
)
