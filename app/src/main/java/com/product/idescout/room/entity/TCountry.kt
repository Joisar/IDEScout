package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(
    tableName = "t_country",
    primaryKeys = ["CountryId"]
)
data class TCountry(
    @ColumnInfo(name = "CountryId") val countryId: Long,
    @ColumnInfo(name = "CountryCode") val countryCode: String,
    @ColumnInfo(name = "CountryName") val countryName: String,
    @ColumnInfo(name = "ISO3") val ISO3: String,
    @ColumnInfo(name = "NumCode") val numCode: Long,
    @ColumnInfo(name = "CenterLat") val centerLat: Double,
    @ColumnInfo(name = "CenterLong") val centerLong: Double,
    @ColumnInfo(name = "ZoomLevel") val zoomLevel: Long,
    @ColumnInfo(name = "LevelType") val levelType: Long,
    @ColumnInfo(name = "StartMonth") val startMonth: Long,
    @ColumnInfo(name = "StartYear") val startYear: String,
    @ColumnInfo(name = "BBox") val BBox: String,
    @ColumnInfo(name = "TopoJsonRef") val topoJsonRef: String,
    @ColumnInfo(name = "bStarted") val bStarted: Long?,
    @ColumnInfo(name = "CurrencyId") val currencyId: Long,
    @ColumnInfo(name = "FrequencyId") val frequencyId: Long,
    @ColumnInfo(name = "LMISReportExpectedDate") val LMISReportExpectedDate: Long?,
    @ColumnInfo(name = "esiglRole") val esiglRole: String?,
    @ColumnInfo(name = "PurchasePriceCalculationMethod") val purchasePriceCalculationMethod: Long?,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?
)
