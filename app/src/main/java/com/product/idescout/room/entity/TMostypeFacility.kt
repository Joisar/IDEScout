package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "t_mostype_facility",
    primaryKeys = ["MosTypeId"],
    foreignKeys = [
        ForeignKey(
            entity = TCountry::class,
            childColumns = arrayOf("CountryId"),
            parentColumns = arrayOf("CountryId")
        ),
        ForeignKey(
            entity = TFacilityLevel::class,
            childColumns = arrayOf("FLevelId"),
            parentColumns = arrayOf("FLevelId")
        ),
        ForeignKey(
            entity = TFacilityType::class,
            childColumns = arrayOf("FTypeId"),
            parentColumns = arrayOf("FTypeId")
        )],
    indices = [
        Index("CountryId"),
        Index("FLevelId"),
        Index("FTypeId")]
)
data class TMostypeFacility(
    @ColumnInfo(name = "MosTypeId") val mosTypeId: Long,
    @ColumnInfo(name = "CountryId") val countryId: Long,
    @ColumnInfo(name = "FLevelId") val FLevelId: Long,
    @ColumnInfo(name = "FTypeId") val FTypeId: Long,
    @ColumnInfo(name = "MosTypeName") val mosTypeName: String,
    @ColumnInfo(name = "MinMos") val minMos: Long,
    @ColumnInfo(name = "MaxMos") val maxMos: Long,
    @ColumnInfo(name = "ColorCode") val colorCode: String,
    @ColumnInfo(name = "MosLabel") val mosLabel: String,
    @ColumnInfo(name = "IconMos") val iconMos: String,
    @ColumnInfo(name = "IconMos_Width") val iconMosWidth: Long,
    @ColumnInfo(name = "IconMos_Height") val iconMosHeight: Long,
    @ColumnInfo(name = "bSatisfactory") val bSatisfactory: Long?,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?
)
