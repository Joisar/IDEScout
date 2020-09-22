package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "t_region",
    primaryKeys = ["RegionId"],
    foreignKeys = [
        ForeignKey(
            entity = TCountry::class,
            childColumns = arrayOf("CountryId"),
            parentColumns = arrayOf("CountryId")
        )],
    indices = [
        Index("CountryId")]
)
data class TRegion(
    @ColumnInfo(name = "RegionId") val regionId: Long,
    @ColumnInfo(name = "RegionName") val regionName: String,
    @ColumnInfo(name = "CountryId") val countryId: Long,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?
)
