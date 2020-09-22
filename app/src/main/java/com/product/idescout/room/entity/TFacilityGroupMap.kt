package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "t_facility_group_map",
    primaryKeys = ["FacilityServiceId"],
    foreignKeys = [
        ForeignKey(
            entity = TFacility::class,
            childColumns = arrayOf("FacilityId"),
            parentColumns = arrayOf("FacilityId")
        ),
        ForeignKey(
            entity = TFacility::class,
            childColumns = arrayOf("SupplyFrom"),
            parentColumns = arrayOf("FacilityId")
        ),
        ForeignKey(
            entity = TItemgroup::class,
            childColumns = arrayOf("ItemGroupId"),
            parentColumns = arrayOf("ItemGroupId")
        )],
    indices = [
        Index("FacilityId"),
        Index("SupplyFrom"),
        Index("ItemGroupId")]
)
data class TFacilityGroupMap(
    @ColumnInfo(name = "FacilityServiceId") val facilityServiceId: Long,
    @ColumnInfo(name = "FacilityId") val facilityId: Long?,
    @ColumnInfo(name = "ItemGroupId") val itemGroupId: Long?,
    @ColumnInfo(name = "StartMonthId") val startMonthId: Long?,
    @ColumnInfo(name = "StartYearId") val startYearId: String?,
    @ColumnInfo(name = "SupplyFrom") val supplyFrom: Long?,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?,
    @ColumnInfo(name = "FLevelId") val FLevelId: Long?
)
