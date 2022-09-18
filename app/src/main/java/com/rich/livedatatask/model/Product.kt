package com.rich.livedatatask.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.io.Serializable

@Parcelize
data class Product(val imageProduct: Int, val productName:String, val price:Int, val stock : Int,val description:String) :
    Parcelable