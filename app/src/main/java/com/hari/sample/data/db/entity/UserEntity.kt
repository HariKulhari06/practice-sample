package com.hari.sample.data.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class UserEntity(
    @PrimaryKey(autoGenerate = true) override val id: Int = 0,
    @ColumnInfo(name = "name") val name: String? = null,
    @ColumnInfo(name = "userId") val userId: String? = null,
    @ColumnInfo(name = "gender") val gender: String? = null,
    @ColumnInfo(name = "age") val age: Int? = null,
    @ColumnInfo(name = "phoneNumber") val phoneNumber: String? = null,
    @ColumnInfo(name = "cellNumber") val cellNumber: String? = null,
    @ColumnInfo(name = "emailAddress") val emailAddress: String? = null,
    @ColumnInfo(name = "profilePic") val profilePic: String? = null,
    @ColumnInfo(name = "address") val address: String? = null,
) : AppEntity