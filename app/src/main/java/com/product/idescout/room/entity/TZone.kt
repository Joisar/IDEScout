package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "t_zone",
    primaryKeys = ["ZoneId"],
    foreignKeys = [
        ForeignKey(
            entity = TRegion::class,
            childColumns = arrayOf("RegionId"),
            parentColumns = arrayOf("RegionId")
        )],
    indices = [
        Index("RegionId")]
)
data class TZone(
    @ColumnInfo(name = "ZoneId") val zoneId: Long,
    @ColumnInfo(name = "RegionId") val regionId: Long,
    @ColumnInfo(name = "ZoneName") val zoneName: String,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?
)
