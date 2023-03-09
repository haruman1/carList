package com.braderrr.carmobile.models
import android.os.Parcelable
import kotlinx.parcelize.Parcelize
@Parcelize
data class CarModels(
    val avatar: Int?,
    val jenisMobil: String?,
    val merkMobil: String?,
    val keluaranMobil: String?,
    val deskripsiMobil: String?,

): Parcelable
