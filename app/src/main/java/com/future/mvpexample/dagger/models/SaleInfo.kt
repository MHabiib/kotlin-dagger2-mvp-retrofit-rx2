package com.example

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class SaleInfo {

    @SerializedName("country")
    @Expose
    var country: String? = null
    @SerializedName("saleability")
    @Expose
    var saleability: String? = null
    @SerializedName("isEbook")
    @Expose
    var isEbook: Boolean? = null

}
