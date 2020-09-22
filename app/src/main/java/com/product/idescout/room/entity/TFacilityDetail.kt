package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "t_facility_details",
    primaryKeys = ["FacilityId", "DeviceId"],
    foreignKeys = [
        ForeignKey(
            entity = TFacility::class,
            childColumns = arrayOf("FacilityId"),
            parentColumns = arrayOf("FacilityId")
        )],
    indices = [
        Index("FacilityId")]
)
data class TFacilityDetail(
    @ColumnInfo(name = "FacilityId") val facilityId: Long,
    @ColumnInfo(name = "DeviceId") val deviceId: String,
    @ColumnInfo(name = "DeviceType") val deviceType: String,
    @ColumnInfo(name = "CountryId") val countryId: Long,
    @ColumnInfo(name = "FacilityName") val facilityName: String,
    @ColumnInfo(name = "SiteOwnerName") val siteOwnerName: String,
    @ColumnInfo(name = "FacilityAddress") val facilityAddress: String?,
    @ColumnInfo(name = "CurrencyName") val currencyName: String?,
    @ColumnInfo(name = "Latitude") val latitude: String?,
    @ColumnInfo(name = "Longitude") val longitude: String?,
    @ColumnInfo(name = "ContactNo") val contactNo: String?,
    @ColumnInfo(name = "PurchasePriceCalculationMethod") val purchasePriceCalculationMethod: Long,
    @ColumnInfo(name = "UpdateBy") val updateBy: Long?,
    @ColumnInfo(name = "DeviceRegisterDt") val deviceRegisterDt: String?,
    @ColumnInfo(name = "OrderBy") val orderBy: Long?,
    @ColumnInfo(name = "ApprovedBy") val approvedBy: Long?,
    @ColumnInfo(name = "SupplyFrom") val supplyFrom: Long?,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?,
    @ColumnInfo(name = "MetaDataDownStartDt") val metaDataDownStartDt: String?,
    @ColumnInfo(name = "MetaDataDownEndDt") val metaDataDownEndDt: String?,
    @ColumnInfo(name = "SyncStartDt") val syncStartDt: String?,
    @ColumnInfo(name = "SyncEndDt") val syncEndDt: String?
)
