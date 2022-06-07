package com.capstone.bangkit.skinkr.data.remote.services

import com.capstone.bangkit.skinkr.data.remote.responses.AcneResponse
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface ApiService {
    @Multipart
    @POST("/")
    fun uploadImage(
        @Part file: MultipartBody.Part
    ): Call<AcneResponse>
}