package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(
    tableName = "t_api",
    primaryKeys = ["ApiId"]
)
data class TApi(
    @ColumnInfo(name = "ApiId") val apiId: Long,
    @ColumnInfo(name = "ApiKey") val apiKey: String,
    @ColumnInfo(name = "ApiClass") val apiClass: String,
    @ColumnInfo(name = "ApiMethod") val apiMethod: String,
    @ColumnInfo(name = "UpdateTs") val updateTs: String,
    @ColumnInfo(name = "CreateTs") val createTs: String
)
