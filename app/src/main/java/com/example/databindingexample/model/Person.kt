package com.example.databindingexample.model

import androidx.databinding.Bindable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Person {
    @SerializedName("name")
    @Expose
    @Bindable
    var name: String? = null
    @SerializedName("realname")
    @Expose
    @Bindable
    var realname: String? = null
    @SerializedName("team")
    @Expose
    @Bindable
    var team: String? = null
    @SerializedName("firstappearance")
    @Expose
    @Bindable
    var firstappearance: String? = null
    @SerializedName("createdby")
    @Expose
    @Bindable
    var createdby: String? = null
    @SerializedName("publisher")
    @Expose
    @Bindable
    var publisher: String? = null
    @SerializedName("imageurl")
    @Expose
    @Bindable
    var imageurl: String? = null
    @SerializedName("bio")
    @Expose
    @Bindable
    var bio: String? = null

}
