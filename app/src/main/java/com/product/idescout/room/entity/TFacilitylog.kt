package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(
    tableName = "t_facilitylog",
    primaryKeys = ["FacilityId", "DeviceId", "LogSeq"]
)
data class TFacilitylog(
    @ColumnInfo(name = "FacilityId") val facilityId: Long,
    @ColumnInfo(name = "DeviceId") val deviceId: String,
    @ColumnInfo(name = "LogSeq") val logSeq: Long,
    @ColumnInfo(name = "TableName") val tableName: String,
    @ColumnInfo(name = "QueryType") val queryType: String,
    @ColumnInfo(name = "LogJson") val logJson: String,
    @ColumnInfo(name = "DeviceLogDt") val deviceLogDt: String,
    @ColumnInfo(name = "WebLogInsertDt") val webLogInsertDt: String,
    @ColumnInfo(name = "WebLogExecuteDt") val webLogExecuteDt: String?
)
