package com.example

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class BookRes (

    @SerializedName("kind")
    @Expose
    var kind: String? = null,
    @SerializedName("totalItems")
    @Expose
    var totalItems: Int? = null,
    @SerializedName("items")
    @Expose
    var items: List<Item>? = null

)
