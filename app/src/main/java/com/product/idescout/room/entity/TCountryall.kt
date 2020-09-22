package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(
    tableName = "t_countryall",
    primaryKeys = ["CountryId"]
)
data class TCountryall(
    @ColumnInfo(name = "CountryId") val countryId: Long,
    @ColumnInfo(name = "CountryCode") val countryCode: String,
    @ColumnInfo(name = "CountryName") val countryName: String,
    @ColumnInfo(name = "ISO3") val ISO3: String?,
    @ColumnInfo(name = "NumCode") val numCode: Long?,
    @ColumnInfo(name = "CenterLat") val centerLat: Double,
    @ColumnInfo(name = "CenterLong") val centerLong: Double,
    @ColumnInfo(name = "ZoomLevel") val zoomLevel: Double,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?
)
