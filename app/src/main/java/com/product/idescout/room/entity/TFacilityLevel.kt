package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(
    tableName = "t_facility_level",
    primaryKeys = ["FLevelId"]
)
data class TFacilityLevel(
    @ColumnInfo(name = "FLevelId") val FLevelId: Long,
    @ColumnInfo(name = "FLevelName") val FLevelName: String,
    @ColumnInfo(name = "ColorCode") val colorCode: String?,
    @ColumnInfo(name = "FLevelShortName") val FLevelShortName: String?,
    @ColumnInfo(name = "PriceMarkupMin") val priceMarkupMin: Double?,
    @ColumnInfo(name = "PriceMarkupMax") val priceMarkupMax: Double?,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?
)
