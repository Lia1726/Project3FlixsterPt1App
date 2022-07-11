package com.example.project3flixsterpt1

import com.google.gson.annotations.SerializedName

/**
 * The Model for storing a single book from the NY Times API
 *
 * SerializedName tags MUST match the JSON response for the
 * object to correctly parse with the gson library.
 */
class Movie {

    @JvmField
    @SerializedName("title")
    var title: String? = null

    //TODO bookImageUrl
    @SerializedName("poster_path")
    var movieImageUrl: String? = null

    //TODO description
    @SerializedName("overview")
    var description: String? = null

}