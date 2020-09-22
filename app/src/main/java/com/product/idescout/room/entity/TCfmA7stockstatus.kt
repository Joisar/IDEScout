package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "t_cfm_a7stockstatus",
    primaryKeys = ["CFMStockStatusId", "CFMStockId", "FacilityId"],
    foreignKeys = [
        ForeignKey(
            entity = TCfmA7masterstockstatus::class,
            childColumns = arrayOf("CFMStockId", "FacilityId"),
            parentColumns = arrayOf("CFMStockId", "FacilityId")
        ),
        ForeignKey(
            entity = TFacility::class,
            childColumns = arrayOf("FacilityId"),
            parentColumns = arrayOf("FacilityId")
        ),
        ForeignKey(
            entity = TCountry::class,
            childColumns = arrayOf("CountryId"),
            parentColumns = arrayOf("CountryId")
        ),
        ForeignKey(
            entity = TMonth::class,
            childColumns = arrayOf("MonthId"),
            parentColumns = arrayOf("MonthId")
        ),
        ForeignKey(
            entity = TItemgroup::class,
            childColumns = arrayOf("ItemGroupId"),
            parentColumns = arrayOf("ItemGroupId")
        ),
        ForeignKey(
            entity = TItemlist::class,
            childColumns = arrayOf("ItemNo"),
            parentColumns = arrayOf("ItemNo")
        ),
        ForeignKey(
            entity = TStore::class,
            childColumns = arrayOf("StoreId"),
            parentColumns = arrayOf("StoreId")
        )],
    indices = [
        Index("CFMStockId", "FacilityId"),
        Index("FacilityId"),
        Index("CountryId"),
        Index("MonthId"),
        Index("ItemGroupId"),
        Index("ItemNo"),
        Index("StoreId")]
)
data class TCfmA7stockstatus(
    @ColumnInfo(name = "CFMStockStatusId") val CFMStockStatusId: Long,
    @ColumnInfo(name = "CFMStockId") val CFMStockId: Long,
    @ColumnInfo(name = "FacilityId") val facilityId: Long,
    @ColumnInfo(name = "CountryId") val countryId: Long,
    @ColumnInfo(name = "Year") val year: String,
    @ColumnInfo(name = "MonthId") val monthId: Long,
    @ColumnInfo(name = "ItemGroupId") val itemGroupId: Long,
    @ColumnInfo(name = "ItemNo") val itemNo: Long,
    @ColumnInfo(name = "OpStock") val opStock: Long?,
    @ColumnInfo(name = "ReceiveQty") val receiveQty: Long?,
    @ColumnInfo(name = "DispenseQty1") val dispenseQty1: Long?,
    @ColumnInfo(name = "DispenseQty2") val dispenseQty2: Long?,
    @ColumnInfo(name = "DispenseQty") val dispenseQty: Long?,
    @ColumnInfo(name = "AdjustQty") val adjustQty: Long?,
    @ColumnInfo(name = "TotalDispenseQty") val totalDispenseQty: Long?,
    @ColumnInfo(name = "ClStock") val clStock: Long?,
    @ColumnInfo(name = "ExpiryQty") val expiryQty: Long?,
    @ColumnInfo(name = "ExpiryDate") val expiryDate: String?,
    @ColumnInfo(name = "StockoutDays1") val stockoutDays1: Long?,
    @ColumnInfo(name = "StockoutDays2") val stockoutDays2: Long?,
    @ColumnInfo(name = "StockoutDays") val stockoutDays: Long?,
    @ColumnInfo(name = "Price") val price: Double?,
    @ColumnInfo(name = "AMC") val AMC: Long?,
    @ColumnInfo(name = "MOS") val MOS: Long?,
    @ColumnInfo(name = "DMM") val DMM: Long?,
    @ColumnInfo(name = "DMMMOS") val DMMMOS: Long?,
    @ColumnInfo(name = "UpdateTs") val updateTs: String,
    @ColumnInfo(name = "CreateTs") val createTs: String,
    @ColumnInfo(name = "StoreId") val storeId: Long?,
    @ColumnInfo(name = "bFree") val bFree: Long?
)
