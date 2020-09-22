package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "t_facility",
    primaryKeys = ["FacilityId"],
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
        ),
        ForeignKey(
            entity = TFacilityType::class,
            childColumns = arrayOf("FTypeId"),
            parentColumns = arrayOf("FTypeId")
        ),
        ForeignKey(
            entity = TFacilityLevel::class,
            childColumns = arrayOf("FLevelId"),
            parentColumns = arrayOf("FLevelId")
        ),
        ForeignKey(
            entity = TDistrict::class,
            childColumns = arrayOf("DistrictId"),
            parentColumns = arrayOf("DistrictId")
        ),
        ForeignKey(
            entity = TServiceArea::class,
            childColumns = arrayOf("ServiceAreaId"),
            parentColumns = arrayOf("ServiceAreaId")
        ),
        ForeignKey(
            entity = TOwnerType::class,
            childColumns = arrayOf("OwnerTypeId"),
            parentColumns = arrayOf("OwnerTypeId")
        )],
    indices = [
        Index("CountryId"),
        Index("RegionId"),
        Index("ZoneId"),
        Index("FTypeId"),
        Index("FLevelId"),
        Index("DistrictId"),
        Index("ServiceAreaId"),
        Index("OwnerTypeId")]
)
data class TFacility(
    @ColumnInfo(name = "FacilityId") val facilityId: Long,
    @ColumnInfo(name = "CountryId") val countryId: Long,
    @ColumnInfo(name = "RegionId") val regionId: Long,
    @ColumnInfo(name = "ZoneId") val zoneId: Long,
    @ColumnInfo(name = "FTypeId") val FTypeId: Long,
    @ColumnInfo(name = "FLevelId") val FLevelId: Long,
    @ColumnInfo(name = "ParentFacilityId") val parentFacilityId: Long?,
    @ColumnInfo(name = "FacilityCode") val facilityCode: String,
    @ColumnInfo(name = "FacilityName") val facilityName: String,
    @ColumnInfo(name = "FacilityAddress") val facilityAddress: String,
    @ColumnInfo(name = "FacilityPhone") val facilityPhone: String,
    @ColumnInfo(name = "FacilityFax") val facilityFax: String,
    @ColumnInfo(name = "FacilityEmail") val facilityEmail: String,
    @ColumnInfo(name = "Latitude") val latitude: String,
    @ColumnInfo(name = "Longitude") val longitude: String,
    @ColumnInfo(name = "FacilityCount") val facilityCount: Long?,
    @ColumnInfo(name = "DistrictId") val districtId: Long,
    @ColumnInfo(name = "ServiceAreaId") val serviceAreaId: Long,
    @ColumnInfo(name = "OwnerTypeId") val ownerTypeId: Long,
    @ColumnInfo(name = "ExternalFacilityId") val externalFacilityId: String?,
    @ColumnInfo(name = "FacilityInCharge") val facilityInCharge: String?,
    @ColumnInfo(name = "eSIGL") val eSIGL: Long?,
    @ColumnInfo(name = "FacilityExcelFileName") val facilityExcelFileName: String?,
    @ColumnInfo(name = "FArv") val FArv: Long?,
    @ColumnInfo(name = "PMIS") val PMIS: Long?,
    @ColumnInfo(name = "FacilityManager") val facilityManager: String?,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?
)
