package cn.kc.mvvmdemo.ui.login

import cn.kc.mvvmdemo.BuildConfig
import cn.kc.mvvmdemo.ui.main.UserBean
import io.reactivex.Observable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import java.util.*

/**
 * 作者： Abel .
 * 日期：2019/11/5
 * 说明：
 */
interface Service {

    //登录
    @GET("UserLogin")
    fun login(@Query("UserId") username: String,
              @Query("Pwd") password: String): Observable<UserBean>

}

private const val API_BASE_URL = "http://192.168.100.20:9999/tools/command_app.asmx/"

val wanService: Service by lazy {

    val loggingInterceptor = HttpLoggingInterceptor()
    loggingInterceptor.level = if (BuildConfig.DEBUG) {
        HttpLoggingInterceptor.Level.BODY
    } else {
        HttpLoggingInterceptor.Level.NONE
    }

    val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(loggingInterceptor)
        .build()

    val retrofit = Retrofit.Builder()
        .baseUrl(API_BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
    return@lazy retrofit.create(Service::class.java)
}