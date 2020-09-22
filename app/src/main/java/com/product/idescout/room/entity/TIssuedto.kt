package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "t_issuedto",
    primaryKeys = ["IssuedToId"],
    foreignKeys = [
        ForeignKey(
            entity = TFacility::class,
            childColumns = arrayOf("FacilityId"),
            parentColumns = arrayOf("FacilityId")
        )],
    indices = [
        Index("FacilityId")]
)
data class TIssuedto(
    @ColumnInfo(name = "IssuedToId") val issuedToId: Long,
    @ColumnInfo(name = "IssuedToGroupId") val issuedToGroupId: Long,
    @ColumnInfo(name = "FacilityId") val facilityId: Long,
    @ColumnInfo(name = "IssuedToName") val issuedToName: String,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?
)
