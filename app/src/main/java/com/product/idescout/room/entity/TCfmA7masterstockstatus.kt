package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "t_cfm_a7masterstockstatus",
    primaryKeys = ["CFMStockId", "FacilityId"],
    foreignKeys = [
        ForeignKey(
            entity = TFacility::class,
            childColumns = arrayOf("FacilityId"),
            parentColumns = arrayOf("FacilityId")
        ),
        ForeignKey(
            entity = TMonth::class,
            childColumns = arrayOf("MonthId"),
            parentColumns = arrayOf("MonthId")
        ),
        ForeignKey(
            entity = TCountry::class,
            childColumns = arrayOf("CountryId"),
            parentColumns = arrayOf("CountryId")
        )],
    indices = [
        Index("FacilityId"),
        Index("MonthId"),
        Index("CountryId")]
)
data class TCfmA7masterstockstatus(
    @ColumnInfo(name = "CFMStockId") val CFMStockId: Long,
    @ColumnInfo(name = "FacilityId") val facilityId: Long,
    @ColumnInfo(name = "MonthId") val monthId: Long,
    @ColumnInfo(name = "Year") val year: String,
    @ColumnInfo(name = "CountryId") val countryId: Long,
    @ColumnInfo(name = "StatusId") val statusId: Double,
    @ColumnInfo(name = "CreatedBy") val createdBy: String?,
    @ColumnInfo(name = "CreatedDt") val createdDt: String?,
    @ColumnInfo(name = "LastSubmittedBy") val lastSubmittedBy: String?,
    @ColumnInfo(name = "LastSubmittedDt") val lastSubmittedDt: String?,
    @ColumnInfo(name = "PublishedBy") val publishedBy: String?,
    @ColumnInfo(name = "PublishedDt") val publishedDt: String?,
    @ColumnInfo(name = "FieldStatusId") val fieldStatusId: Long?,
    @ColumnInfo(name = "FieldCreatedBy") val fieldCreatedBy: String?,
    @ColumnInfo(name = "FieldCreatedDt") val fieldCreatedDt: String?,
    @ColumnInfo(name = "FieldPublishedBy") val fieldPublishedBy: Double?,
    @ColumnInfo(name = "FieldPublishedDt") val fieldPublishedDt: String?,
    @ColumnInfo(name = "UpdateTs") val updateTs: String,
    @ColumnInfo(name = "CreateTs") val createTs: String
)
