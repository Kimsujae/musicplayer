package kr.ac.kumoh.s20160250.mymelon.service

import retrofit2.Call
import retrofit2.http.GET

interface MusicService {
    @GET("v3/a61edddd-18d4-40b7-82c3-e47664187b81")
    fun listMusics() : Call<MusicDto>
}