package com.example

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Epub {

    @SerializedName("isAvailable")
    @Expose
    var isAvailable: Boolean? = null
    @SerializedName("acsTokenLink")
    @Expose
    var acsTokenLink: String? = null

}
