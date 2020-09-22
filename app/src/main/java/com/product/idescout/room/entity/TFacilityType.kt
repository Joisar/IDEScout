package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(
    tableName = "t_facility_type",
    primaryKeys = ["FTypeId"]
)
data class TFacilityType(
    @ColumnInfo(name = "FTypeId") val FTypeId: Long,
    @ColumnInfo(name = "FTypeName") val FTypeName: String,
    @ColumnInfo(name = "FTypeShortName") val FTypeShortName: String,
    @ColumnInfo(name = "MaxMonth") val maxMonth: Long,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?
)
