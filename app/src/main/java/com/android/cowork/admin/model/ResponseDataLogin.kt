package com.android.cowork.admin.model

import com.google.gson.annotations.SerializedName

class ResponseDataLogin(@SerializedName("success") val noticeMessage: String?,
                        @SerializedName("data") val data: DataLogin?)

data class DataLogin(@SerializedName("error") val message: String?,
                     @SerializedName("email") val email: String?,
                     @SerializedName("_id") val id: String?,
                     @SerializedName("name") val name: String?,
                     @SerializedName("status") val status: String?)