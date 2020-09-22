package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "t_districts",
    primaryKeys = ["DistrictId"],
    foreignKeys = [
        ForeignKey(
            entity = TCountry::class,
            childColumns = arrayOf("CountryId"),
            parentColumns = arrayOf("CountryId")
        ),
        ForeignKey(
            entity = TRegion::class,
            childColumns = arrayOf("RegionId"),
            parentColumns = arrayOf("RegionId")
        ),
        ForeignKey(
            entity = TZone::class,
            childColumns = arrayOf("ZoneId"),
            parentColumns = arrayOf("ZoneId")
        )],
    indices = [
        Index("CountryId"),
        Index("RegionId"),
        Index("ZoneId")]
)
data class TDistrict(
    @ColumnInfo(name = "DistrictId") val districtId: Long,
    @ColumnInfo(name = "CountryId") val countryId: Long,
    @ColumnInfo(name = "RegionId") val regionId: Long,
    @ColumnInfo(name = "ZoneId") val zoneId: Long,
    @ColumnInfo(name = "DistrictName") val districtName: String,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?
)
