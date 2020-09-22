package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(
    tableName = "t_service_area",
    primaryKeys = ["ServiceAreaId"]
)
data class TServiceArea(
    @ColumnInfo(name = "ServiceAreaId") val serviceAreaId: Long,
    @ColumnInfo(name = "ServiceAreaName") val serviceAreaName: String,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?
)
