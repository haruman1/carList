package com.braderrr.carmobile.models
import android.os.Parcelable
import kotlinx.parcelize.Parcelize
@Parcelize
data class CarModels(
    val avatar: Int?,
    val pembuatMobil: String?,
    val modelMobil: String?,
    val keluaranMobil: String?,
    val deskripsiMobil: String?,
//    val jenisDataMobil : String?,
//    val pembuatDataMobil : String?,
//    val modelDataMobil : String?,
//    val keluaranDataMobil : String?,
//    val descDataMobil : String?,
): Parcelable
